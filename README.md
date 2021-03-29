# image-upload

git init

git add .
# Adds the files in the local repository and stages them for commit. To unstage a file, use 'git reset HEAD YOUR-FILE'.

git commit -m "First commit"
# Commits the tracked changes and prepares them to be pushed to a remote repository. To remove this commit and modify the file, use 'git reset --soft HEAD~1' and commit and add the file again.

At the top of your GitHub repository's Quick Setup page, click to copy the remote repository URL. 

In Terminal, add the URL for the remote repository where your local repository will be pushed.

$ git remote add origin  <REMOTE_URL> 
# Sets the new remote
$ git remote -v
# Verifies the new remote URL


git push origin master/main
# Pushes the changes in your local repository up to the remote repository you specified as the origin
