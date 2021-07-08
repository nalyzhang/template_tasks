git stash
REM git fetch --all
git pull template master -s recursive -X theirs --rebase --allow-unrelated-histories
git stash pop
