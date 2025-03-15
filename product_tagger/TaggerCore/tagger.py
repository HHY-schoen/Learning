import prompts
from chat_model import ChatModel
from typing import List, Dict


class ProductTagger:
    def __init__(self, model_name: str, model_api_base: str) -> None:
        self.SYS_PROMPT = prompts.SYS_PROMPT
        self.USER_PROMPT = prompts.USER_PROMPT
        self.chatbot = ChatModel(model_name, model_api_base)
        self.messages = []

    def set_prompt(self, prompt_type: str, prompt_value: str) -> None:
        '''
        Set prompt value(system prompt or user prompt)
        '''
        attr_name = f"{prompt_type.upper()}_PROMPT"
        setattr(self, attr_name, prompt_value)
        print('Prompt Set.')

    def format_messages(self, format_args: Dict[str, str]):
        '''
        Format value into user messages
        '''
        self.messages = [
            {"role": "system", "content": self.SYS_PROMPT},
            {"role": "user", "content": self.USER_PROMPT.format(**format_args)}
        ]
        self.__cache_messages = [
            {"role": "system", "content": self.SYS_PROMPT},
            {"role": "user", "content": self.USER_PROMPT.format(**format_args)}
        ]
        print('Messages Formatted.')
        return self.messages

    def reset_messages(self):
        '''
        Clean few shot and reset messages
        '''
        self.messages = self.__cache_messages
        print("Messages Reset.")

    def append_few_shots(self, few_shot_messages: List[Dict[str, str]]) -> List[Dict[str, str]]:
        '''
        Add few shot messages into input messages
        '''
        if not self.messages:
            raise AttributeError("Messages is not defined.")

        if self._few_shot_message_checker(few_shot_messages):
            self.messages[-1:-1] = few_shot_messages
        print('Few shot messages inserted.')
        return self.messages

    def _few_shot_message_checker(self, few_shot_messages) -> bool:
        '''
        Check if an input few shot message is valid
        '''
        # Check instance
        if not isinstance(few_shot_messages, list):
            raise TypeError("Expected List type")

        # Check length
        length = len(few_shot_messages)
        if length % 2 != 0:
            raise ValueError("Few shot length should be even")

        # Check if last messages is user role
        if few_shot_messages[-1]['role'] != 'assistant':
            raise ValueError("Last message's role should be 'assistant'")

        # check if message is alternative and in right pattern
        pattern, sign, pattern_dict = 0, 1, ['user', 'assistant']
        for message in few_shot_messages:
            if list(message.keys()) != ['role', 'content']:
                raise ValueError("Invalid message format.")
            if not isinstance(message['role'], str) or not isinstance(message['content'], str):
                raise TypeError(
                    f"All values of 'role' and 'content' should be strings: {message}")
            if message['role'] != pattern_dict[pattern]:
                raise ValueError(
                    f"The message: {message} should be 'role': '{pattern_dict[pattern]}', not '{message['role']}'")
            pattern += sign
            sign *= -1
        return True

    def Tag(self):
        '''
        Tag the product by sending request to the chatbot asynchronously
        '''
        prompt = self.chatbot.from_chat_template(self.messages)
        output = self.chatbot.chat(prompt)  # Asynchronous chat
        return output

    async def aTag(self):
        '''
        Async Tag the product by sending request to the chatbot asynchronously
        '''
        prompt = self.chatbot.from_chat_template(self.messages)
        output = await self.chatbot.achat(prompt)  # Asynchronous chat
        return output
