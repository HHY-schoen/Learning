
- /data
    - activity_tag.json：為現階段透過 貼標定義google sheet 上的資訊轉換成json格式的標籤定義參考資料
    - product_test.xlsx：暫時用於測試的產品資訊表

- /TaggerCore
    - chat_model.py：LLM調用的相關方法
    - prompts.py：Prompt的模板設定
    - product_tagger.py：貼標主功能

- main.py / async_main.py / async_multiprocess_main.py
    > 分別是 一般調用 / 協程調用 / 協程+多進程調用 的貼標範本main.py


##### 相關名詞解釋
- AutoTokenizer
    - Hugging Face 提供的一個自動化工具，用於根據模型的名稱或路徑自動加載對應的分詞器（Tokenizer）。
    - 可以自動選擇與指定模型匹配的分詞器，而無需手動指定具體的分詞器類型。這使得處理不同類型的模型變得更加簡單，特別是在不確定具體使用的分詞器類型時。

- async
    - async 是 Python 中用來定義**異步函式（asynchronous function）**的關鍵字。讓 Python 可以更有效率地執行多個 I/O 操作，而不會讓單個任務卡住整個程式。
    - 適合 I/O 密集型任務：如網路請求、讀取資料庫、文件操作等，因為它不會讓 CPU 閒置等待。
    - 提高效率：相比傳統同步程式，異步程式可以在等待的同時執行其他任務，減少閒置時間。
        > asyncio.run() 不能在已經運行的事件迴圈（event loop）中被呼叫，這通常會在 Jupyter Notebook 或 某些異步框架（如 FastAPI、JupyterLab） 中發生，因為它們已經有一個運行中的事件迴圈。
        > 相關基礎操作可參考: async_basic.ipynb


- 模型使用 : Qwen2.5-32B-Instruct
    - 由 Qwen 開發的一個大型語言模型（LLM），專門設計用來處理指令式任務（Instructive tasks）。它的 "32B" 表示模型有 32 億個參數，而 "Instruct" 表示該模型是經過專門訓練來理解並執行指令的，這使得它在自然語言處理（NLP）任務中尤其擅長。
    - 設計用來理解並執行複雜的自然語言指令，並在多種 NLP 任務中提供高效和精準的表現。它結合了大型參數規模與指令式訓練，使其在處理指令和生成相關內容方面非常有用。


