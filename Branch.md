## Branch
- conflict : 兩個人同時對一個 respository 做更新的情況。某一方會無法 push 上去，出現 error ( 電腦跟 GitHub 上面的 repo 有衝突 )
  > 解決方法 : 執行 git pull 把更新抓下來，把有發生衝突的檔案修改好，再 push 上去
  > 若 current changes 和 incoming changes 都不是你要的，可以選 accept both changes 再手動進行修改
--------------

- 建立新 branch 並切換過去 : git checkout -b <branch_name>
  > 或直接在 vscode 上方輸入 new branch name
  > 新 branch push 出去會發生錯誤，因為沒設定 upstream，輸入 git push -u origin HEAD ( 將目前所在的 branch 推上去 )
- 查看電腦上的 branch ( press "q" to guit ) : git branch
  > git branch -a : 查看所有 branch ( 包含 remote )
- git switch <branch_name> :　切換分支
  > tips : 若分支工作未完成，可以先送出一個假的commit(ex. working...)，完成其他工作後再切換回來，壓 undo last commit 即可回到之前的狀態。

## 如何把 branch 整合回 master ?
1. 在 GitHub 上用 pull, request 做 merge ( 推薦方法! )
   - git rebase < 要rebase到哪個分支 > : 把分支接回原本分支 ( ex. master ) 的最新進度上面，如此一來即可解決衝突。
     > 切到該分支將檔案 pull 下來，再切回分支進行 rebase。
   - git rebase --continue
     > 解完衝突後繼續 rebase ( 有時候可能要解多次衝突 )
   - git push -f
     > 不建議在主分支做!! 會覆蓋掉整個紀錄!
     > 強制將電腦上的紀錄 push 到 remote (因push在一般情況下，只允許你對一個repo做新的commit)
     
2. 在電腦上 merge 完後再 push
