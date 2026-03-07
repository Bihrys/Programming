# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第3章 第4节 文件测试与目录操作

一、常用测试
1) -e 路径是否存在
2) -f 是否普通文件
3) -d 是否目录
4) -r/-w/-x 可读/可写/可执行

二、目录操作
1) mkdir -p 创建目录
2) cp / mv / rm 完成复制、移动、删除

三、习题
1) 判断一个路径是文件还是目录。
2) 若目录不存在则自动创建。

四、答案与讲解
1) 用 [[ -f ]] 和 [[ -d ]] 分支判断。
2) 用 mkdir -p 保证幂等创建。
DOC

target_dir="demo_dir" # 定义目录变量
target_file="demo_dir/info.txt" # 定义文件变量

mkdir -p "$target_dir" # 创建目录（已存在不会报错）
echo "bash file test example" > "$target_file" # 写入示例文件

if [[ -d "$target_dir" ]]; then # 判断目录是否存在
  echo "${target_dir} 是目录" # 输出目录判断结果
fi

if [[ -f "$target_file" ]]; then # 判断文件是否存在
  echo "${target_file} 是普通文件" # 输出文件判断结果
fi

# 由bhw设计
