# 如何在保留本地文件的同时删除git仓库文件夹和文件
## 删除文件
1. git rm --cached filename

2. git commit -m "remove file from remote repository"

3. git push

## 删除文件夹
1. git rm --cached -r directoryname

2. git commit -m "remove directory from remote repository"

3. git push

