### Git
- 版本控制系統
- 類似遊戲存檔功能
- 共同開發

### 常用指令
- git add
- git commit
- git push

## other command
- 初始化 repo : git init
- 查看目前狀態 : git status
  > 只顯示跟上一次 commit 不同的部分
- 增加檔案到 git : git add <file_name>
  > git add . : 將資料夾內所有檔案加入 git ( . 代表目前所在資料夾位置 )
- 保存進度 : git commit ( 類似遊戲存檔 )，通常會寫修改了什麼。直接輸入  git commit -m ""，可以不用進入文字編輯器 commit，''引號可以輸入文字訊息。
  > c : 進入編輯模式
  > esc : 退出編輯模式
  > ZZ ( 連押兩次大寫Z ) : 保存並退出

## Git & GitHub
將 github repo 中的 remote 訊息輸入至 gitbash 中操作。
- git push <remote_name> <branch_name> (ex. git push origin master 即將master branch 推到 origin (github repo)。

--------------

refer : https://www.youtube.com/watch?v=Zd5jSDRjWfA&t=262s
