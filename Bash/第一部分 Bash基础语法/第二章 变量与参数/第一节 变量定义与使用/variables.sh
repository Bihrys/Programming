# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第2章 第1节 变量定义与使用

一、核心语法
1) 定义变量：name="bhw"（等号两边不能有空格）
2) 读取变量：$name 或 ${name}
3) 只读变量：readonly CONST_VALUE="xxx"

二、常见坑
1) 写成 name = "bhw" 会报错。
2) 未加引号可能触发单词分割。

三、习题
1) 定义 city 和 job 并输出一句自我介绍。
2) 定义只读变量 PI，尝试修改并观察结果。

四、答案与讲解
1) echo "我在${city}做${job}"。
2) 只读变量不能再赋值，会报 readonly 错误。
DOC

name="bhw" # 定义普通变量
age=18 # 定义数字变量（本质也是字符串）
readonly role="student" # 定义只读变量

echo "name=${name}" # 输出 name
echo "age=${age}" # 输出 age
echo "role=${role}" # 输出只读变量

# 由bhw设计
