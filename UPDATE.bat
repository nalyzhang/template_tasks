git stash
git pull -s recursive -X theirs --rebase --allow-unrelated-histories template master
git pull -s recursive -X ours --merge --allow-unrelated-histories origin master
git push origin
git stash pop
