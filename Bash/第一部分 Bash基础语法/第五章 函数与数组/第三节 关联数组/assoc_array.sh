# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第5章 第3节 关联数组

一、关联数组特点
1) 键值对结构，键通常是字符串。
2) 适合做计数映射、配置映射。

二、语法要点
1) declare -A map
2) map[key]=value
3) ${!map[@]} 取全部键

三、习题
1) 建立“课程->老师”映射并输出。
2) 遍历关联数组输出所有键值对。

四、答案与讲解
1) teacher_map["bash"]="张老师"
2) for k in "${!teacher_map[@]}"; do ...; done
DOC

declare -A teacher_map # 声明关联数组
teacher_map["bash"]="李老师" # 设置 bash 课程老师
teacher_map["c"]="王老师" # 设置 c 课程老师
teacher_map["cpp"]="赵老师" # 设置 cpp 课程老师

echo "bash老师=${teacher_map["bash"]}" # 通过键读取值

for course in "${!teacher_map[@]}"; do # 遍历所有键
  echo "course=${course}, teacher=${teacher_map[$course]}" # 输出键值对
done

# 由bhw设计
