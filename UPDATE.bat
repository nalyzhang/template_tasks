git stash
git fetch --all
git pull template master -s recursive -X theirs --rebase --allow-unrelated-histories
git push origin
git stash pop
