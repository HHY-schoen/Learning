## Git
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
- 保存進度 : git commit ( 類似遊戲存檔 )

  通常會寫修改了什麼。直接輸入  git commit -m ""，可以不用進入文字編輯器 commit，''引號可以輸入文字訊息。
  > c : 進入編輯模式
  > esc : 退出編輯模式
  > ZZ ( 連押兩次大寫Z ) : 保存並退出
- 把 git 過的檔案 unstage 回去 : git reset -- <file_name>
  > 等於減號效果
- 將檔案回到上次 commit 時的狀態 : git checkout -- <file_name>
  > 等於 discard changes 的效果
- 往前退一個 commit ( 會保留修改的部分 ) : git reset -- soft HEAD~1 ( 1 代表回到前一個 commit，以此類推 )

## Git & GitHub
- 將 github repository 連接到本地端
  > git remote add origin <repo_link>.git
- git push <remote_name> <branch_name>

  (ex. git push origin master : 將 master branch 推到 origin (github repo)。
  > git push -u : 將預設的 remote 設為 origin ( 未來 push 若不指定 remote 都會 push 到 origin )。之後若要推到相同 repo ，只要輸入 git push 即可 !
- git clone <link> : 完整下載遠端的 git repo，下載後不需要重新 git init。


--------------

refer : https://www.youtube.com/playlist?list=PLz-S_Wd1N3svV8XnuDM6CPaTCtQkk5SY4
