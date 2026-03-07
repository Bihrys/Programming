# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第6章 第1节 批量重命名脚本

一、需求
把当前目录下 .txt 文件批量改名为 .bak.txt。

二、核心思路
1) 用 for 遍历目标文件。
2) 用参数展开提取基础名。
3) 用 mv 执行重命名。

三、习题
1) 改成把 .log 改成 .old.log。
2) 增加“目标文件已存在则跳过”的保护。

四、答案与讲解
1) 把扩展名匹配从 .txt 改为 .log。
2) 用 [[ -e "$new_name" ]] 判断后 continue。
DOC

shopt -s nullglob # 无匹配文件时，通配符展开为空而不是原样字符串

for file in *.txt; do # 遍历当前目录所有 txt 文件
  base="${file%.txt}" # 去掉 .txt 后缀得到基础名
  new_name="${base}.bak.txt" # 生成新文件名
  if [[ -e "$new_name" ]]; then # 判断新文件名是否已存在
    echo "跳过: ${new_name} 已存在" # 输出跳过提示
    continue # 进入下一轮
  fi
  mv -- "$file" "$new_name" # 执行重命名
  echo "重命名: $file -> $new_name" # 输出重命名结果
done

# 由bhw设计
