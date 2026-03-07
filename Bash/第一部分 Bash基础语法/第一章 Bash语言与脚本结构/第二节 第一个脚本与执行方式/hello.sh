# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第1章 第2节 第一个脚本与执行方式

一、执行方式
1) 方式A：bash hello.sh
2) 方式B：chmod +x hello.sh 后 ./hello.sh（需要首行 shebang）

二、脚本结构
1) 注释说明
2) 变量与逻辑
3) 输出结果

三、习题
1) 把脚本改成输出两行内容。
2) 输出当前脚本文件名。

四、答案与讲解
1) 连续写两个 echo 即可。
2) 使用 $0 获取脚本名。
DOC

script_name="$0" # 保存脚本文件名
echo "你好，世界！" # 输出第一行
echo "当前脚本：${script_name}" # 输出脚本名

# 由bhw设计
