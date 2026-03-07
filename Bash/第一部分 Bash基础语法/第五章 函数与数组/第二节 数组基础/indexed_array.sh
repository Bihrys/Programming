# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第5章 第2节 数组基础

一、定义与访问
1) arr=(a b c)
2) ${arr[0]} 访问单个元素
3) ${arr[@]} 访问全部元素
4) ${#arr[@]} 获取元素个数

二、习题
1) 遍历数组输出每个元素。
2) 输出数组长度和最后一个元素。

三、答案与讲解
1) for item in "${arr[@]}"; do ...; done
2) len=${#arr[@]}，最后元素下标是 len-1。
DOC

arr=("apple" "banana" "orange") # 定义索引数组

echo "first=${arr[0]}" # 输出第1个元素
echo "count=${#arr[@]}" # 输出数组长度

for idx in "${!arr[@]}"; do # 遍历数组下标
  echo "idx=${idx}, value=${arr[idx]}" # 输出下标与元素值
done

# 由bhw设计
