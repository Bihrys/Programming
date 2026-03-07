# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第2章 第2节 字符串与参数展开

一、常见展开
1) ${var}：基础展开
2) ${#var}：字符串长度
3) ${var:-default}：为空时使用默认值
4) ${var/pat/repl}：替换第一个匹配

二、推荐习惯
1) 变量展开尽量写成 ${var}，可读性更好。
2) 含空格内容务必加双引号。

三、习题
1) 统计用户名长度。
2) 把字符串中的 "cat" 替换成 "dog"。

四、答案与讲解
1) len=${#user}
2) new_text=${text/cat/dog}
DOC

user="bhw_admin" # 定义字符串变量
text="cat likes fish" # 定义待替换文本
empty_value="" # 空变量

echo "user=${user}" # 输出用户变量
echo "length=${#user}" # 输出字符串长度
echo "default=${empty_value:-未设置}" # 空变量时使用默认值
echo "replace=${text/cat/dog}" # 替换第一个匹配

# 由bhw设计
