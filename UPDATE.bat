git remote add template https://github.com/academy-project-programming/all-tasks
git stash
git pull origin
git fetch template
git merge -s recursive -X ours --allow-unrelated-histories template/master
git checkout template/master -- README.md
git checkout template/master -- UPDATE.bat
git push origin
git stash pop
