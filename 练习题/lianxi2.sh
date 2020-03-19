#!/bin/bash
mkdir example practice
touch ex01.c ex02.c ex03.c
mv ex01.c example/example.c
mv ex02.c practice/ex02.c
rm ex03.c
touch README.md 
echo "## example/example.c" > README.md 
echo "判断是奇数还是偶数" >> README.md 
echo "## practice/prictice.c" >>README.md 
echo "比较两个数的大小" >>README.md 
cp -r ../练习题 ~/chao
cd ~/chao
pwd
git add 练习题
git commit -m"预备课练习题2"
git push
