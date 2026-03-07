# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第3章 第1节 echo与printf输出

一、echo 和 printf
1) echo 用法简单，适合快速输出。
2) printf 更可控，适合格式化输出。

二、推荐
1) 复杂输出优先 printf。
2) 输出变量时加双引号，避免空格拆分。

三、习题
1) 用 printf 输出姓名和分数，分数保留2位小数。
2) 用 echo 输出三行菜单文本。

四、答案与讲解
1) printf "name=%s score=%.2f\n" "$name" "$score"
2) 连续写三条 echo。
DOC

name="bhw" # 定义姓名变量
score="98.5" # 定义分数字符串

echo "欢迎来到 Bash 输出示例" # echo 简单输出
printf "name=%s score=%.2f\n" "$name" "$score" # printf 格式化输出
printf "line1=%d line2=%d\n" 1 2 # printf 输出整数

# 由bhw设计
