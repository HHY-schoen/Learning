import aiohttp
import requests
from transformers import AutoTokenizer
from typing import List, Dict
import ast


class ChatModel:
    def __init__(self, model_name: str, model_api_base: str) -> None:
        self.model_name = model_name
        print('Loading Tokenizer...')
        self.tokenizer = AutoTokenizer.from_pretrained(self.model_name)
        print('Tokenizer Loaded.')
        self.model_api_base = model_api_base

    def from_chat_template(self, messages: List[Dict[str, str]]) -> str:
        '''
        Transform chat template into prompt format
        '''
        prompt = self.tokenizer.apply_chat_template(
            messages,
            tokenize=False,
            add_generation_prompt=True
        )
        return prompt

    def chat(self,
             prompt: str,
             max_token: int = 2000,
             temperature: float = 0.5,
             top_p: float = 0.5,
             top_k: int = 85,
             repetition_penalty: float = 1,
             stream: bool = False) -> str:
        '''
        Chat function with model params (asynchronous)
        '''
        params = {"prompt": prompt,
                  "max_tokens": max_token,
                  "temperature": temperature,
                  "top_p": top_p,
                  "top_k": top_k,
                  "repetition_penalty": repetition_penalty,
                  "stream": stream}

        resp = requests.post(self.model_api_base, json=params)  # request model
        text = resp.json()["text"][0]  # get return text
        # parse output response
        response = text[text.rfind('<|im_start|>assistant\n') + 22:]
        response_json = ast.literal_eval(response)
        return response_json

    async def achat(self,
                    prompt: str,
                    max_token: int = 2000,
                    temperature: float = 0.5,
                    top_p: float = 0.5,
                    top_k: int = 85,
                    repetition_penalty: float = 1,
                    stream: bool = False) -> str:
        '''
        Async Chat function with model params (asynchronous)
        '''
        params = {"prompt": prompt,
                  "max_tokens": max_token,
                  "temperature": temperature,
                  "top_p": top_p,
                  "top_k": top_k,
                  "repetition_penalty": repetition_penalty,
                  "stream": stream}

        async with aiohttp.ClientSession() as session:
            async with session.post(self.model_api_base, json=params) as resp:
                resp_json = await resp.json()  # Wait for the response asynchronously
                text = resp_json["text"][0]
                response = text[text.rfind('<|im_start|>assistant\n') + 22:]
                response_json = ast.literal_eval(response)
                return response_json
