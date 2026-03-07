# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第4章 第4节 while与until循环

一、while
1) 条件为真时持续执行。

二、until
1) 条件为假时持续执行（与 while 互补）。

三、习题
1) 用 while 求 1 到 10 的和。
2) 用 until 把数字从 0 增加到 5。

四、答案与讲解
1) while ((i<=10)) 持续累加。
2) until ((i>5)) 时退出。
DOC

i=1 # while 计数器初始化
sum=0 # while 累加器初始化

while (( i <= 10 )); do # 条件为真则循环
  sum=$((sum + i)) # 累加当前 i
  i=$((i + 1)) # i 自增
done

echo "while_sum=${sum}" # 输出 while 累加结果

j=0 # until 计数器初始化
until (( j > 5 )); do # 条件为假则循环
  echo "j=${j}" # 输出当前 j
  j=$((j + 1)) # j 自增
done

# 由bhw设计
