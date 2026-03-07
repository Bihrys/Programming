# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第5章 第1节 函数定义与返回值

一、函数定义
1) function_name() { ... }
2) 参数读取用 $1 $2 ...

二、返回值说明
1) return 只能返回 0~255 的退出码。
2) 业务结果推荐用 echo 输出，再用命令替换接收。

三、习题
1) 写一个 add 函数，输出两数之和。
2) 写 is_even 函数，偶数返回0，奇数返回1。

四、答案与讲解
1) sum=$(add 3 5)
2) if ((n%2==0)); then return 0; else return 1; fi
DOC

add() { # 定义 add 函数
  local a="$1" # 读取第1个参数
  local b="$2" # 读取第2个参数
  echo $((a + b)) # 输出加法结果
} # add 函数结束

is_even() { # 定义偶数判断函数
  local n="$1" # 读取输入参数
  if (( n % 2 == 0 )); then # 判断是否为偶数
    return 0 # 偶数返回成功状态
  fi
  return 1 # 奇数返回失败状态
} # is_even 函数结束

sum_result="$(add 3 5)" # 调用 add 并接收输出
echo "sum_result=${sum_result}" # 输出加法函数结果

if is_even 10; then # 调用判断函数
  echo "10 是偶数" # 偶数分支
else
  echo "10 是奇数" # 奇数分支
fi

# 由bhw设计
