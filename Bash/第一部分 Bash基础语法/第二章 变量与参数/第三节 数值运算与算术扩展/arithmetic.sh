# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第2章 第3节 数值运算与算术扩展

一、算术方式
1) $((expr))：推荐
2) let "a = b + c"：可用但不如前者直观
3) expr 命令：老写法，现代脚本较少用

二、注意事项
1) Bash 默认整数运算，不做浮点。
2) 需要浮点时可借助 awk/bc。

三、习题
1) 计算 1 到 100 的和。
2) 输入两个整数，输出加减乘除（整除）。

四、答案与讲解
1) sum=$(( (1 + 100) * 100 / 2 ))
2) 用 $((a+b)) 等表达式即可。
DOC

a=10 # 定义整数 a
b=3 # 定义整数 b

sum=$((a + b)) # 加法
diff=$((a - b)) # 减法
product=$((a * b)) # 乘法
quotient=$((a / b)) # 整数除法
mod=$((a % b)) # 取模

echo "sum=${sum}" # 输出加法结果
echo "diff=${diff}" # 输出减法结果
echo "product=${product}" # 输出乘法结果
echo "quotient=${quotient}" # 输出整除结果
echo "mod=${mod}" # 输出取模结果

# 由bhw设计
