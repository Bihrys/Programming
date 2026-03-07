# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第3章 第3节 重定向与管道

一、重定向
1) > 覆盖写入文件
2) >> 追加写入文件
3) 2> 错误输出重定向

二、管道
1) cmd1 | cmd2：把 cmd1 输出作为 cmd2 输入

三、习题
1) 把 ls 输出保存到文件。
2) 用管道统计当前目录文件数量。

四、答案与讲解
1) ls > files.txt
2) ls -1 | wc -l
DOC

work_file="demo_output.txt" # 定义输出文件名

echo "第一行" > "$work_file" # 覆盖写入第一行
echo "第二行" >> "$work_file" # 追加写入第二行

line_count="$(cat "$work_file" | wc -l)" # 用管道统计行数
echo "line_count=${line_count}" # 输出行数统计结果

ls not_exists_file 2> demo_error.txt # 把错误输出重定向到文件
echo "错误信息已写入 demo_error.txt" # 提示重定向完成

# 由bhw设计
