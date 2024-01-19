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

## 如何把 branch 整合回 master ?
1. 在 GitHub 上用 pull, request 做 merge ( 推薦方法! )
2. 在電腦上 merge 完後再 push
