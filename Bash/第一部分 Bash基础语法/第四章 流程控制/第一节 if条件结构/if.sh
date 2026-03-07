# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第4章 第1节 if条件结构

一、语法结构
if 条件; then
  语句
elif 条件; then
  语句
else
  语句
fi

二、习题
1) 输入分数输出等级（A/B/C）。
2) 输入整数判断奇偶。

三、答案与讲解
1) 先判断高分区间再判断低分区间。
2) num%2==0 为偶数。
DOC

score=85 # 定义分数变量

if (( score >= 90 )); then # 判断是否大于等于90
  echo "A" # 输出A等级
elif (( score >= 60 )); then # 判断是否大于等于60
  echo "B" # 输出B等级
else # 其余情况
  echo "C" # 输出C等级
fi

# 由bhw设计
