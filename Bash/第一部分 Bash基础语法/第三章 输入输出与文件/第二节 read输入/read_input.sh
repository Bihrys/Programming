# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第3章 第2节 read输入

一、基础语法
1) read var：读取一行到变量 var。
2) read -p "提示" var：带提示读取。
3) read -r：保留反斜杠原义，推荐默认加上。

二、习题
1) 读取姓名和年龄并输出。
2) 读取两个整数输出和。

三、答案与讲解
1) read -r -p "name: " name
2) sum=$((a+b))
DOC

read -r -p "请输入姓名: " name # 读取用户输入的姓名
read -r -p "请输入年龄: " age # 读取用户输入的年龄

if [[ -z "$name" || -z "$age" ]]; then # 判断是否有空输入
  echo "输入不能为空" # 输出错误提示
  exit 1 # 异常退出
fi

echo "name=${name}, age=${age}" # 输出读取结果

# 由bhw设计
