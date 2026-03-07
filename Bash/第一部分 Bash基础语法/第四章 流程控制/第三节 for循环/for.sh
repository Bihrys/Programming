# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第4章 第3节 for循环

一、两种常见写法
1) for i in 列表; do ...; done
2) for ((i=0; i<n; i++)); do ...; done

二、习题
1) 计算 1 到 100 的和。
2) 遍历数组并输出下标和值。

三、答案与讲解
1) 用 sum=$((sum+i)) 累加。
2) 用 "${!arr[@]}" 获取数组下标。
DOC

sum=0 # 初始化累加变量

for ((i=1; i<=100; i++)); do # C风格 for 循环
  sum=$((sum + i)) # 每轮累加 i
done

echo "sum=${sum}" # 输出1到100总和

for item in apple banana orange; do # 遍历固定列表
  echo "item=${item}" # 输出当前元素
done

# 由bhw设计
