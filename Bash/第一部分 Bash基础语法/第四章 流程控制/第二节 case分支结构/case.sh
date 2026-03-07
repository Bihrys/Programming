# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第4章 第2节 case分支结构

一、适用场景
1) 多个离散值匹配时，用 case 比 if/elif 更清晰。

二、基本语法
case "$var" in
  pattern1) 语句 ;;
  pattern2) 语句 ;;
  *) 默认语句 ;;
esac

三、习题
1) 输入 1~7 输出星期。
2) 输入 y/n 输出确认结果。

四、答案与讲解
1) 每个数字对应一个分支。
2) 用 [Yy]/[Nn] 做大小写兼容。
DOC

day="${1:-3}" # 读取第1个参数，默认值为3

case "$day" in # 根据 day 值选择分支
  1) echo "周一" ;; # day=1
  2) echo "周二" ;; # day=2
  3) echo "周三" ;; # day=3
  4) echo "周四" ;; # day=4
  5) echo "周五" ;; # day=5
  6) echo "周六" ;; # day=6
  7) echo "周日" ;; # day=7
  *) echo "输入非法" ;; # 默认分支
esac

# 由bhw设计
