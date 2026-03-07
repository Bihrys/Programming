# 由bhw设计
#!/usr/bin/env bash

: <<'DOC'
第6章 第2节 日志统计脚本

一、需求
统计日志文件中 ERROR 和 WARN 的出现次数。

二、思路
1) 检查日志文件是否存在。
2) 用 grep -c 统计关键字次数。
3) 输出结果并给出简单结论。

三、习题
1) 增加 INFO 统计。
2) 增加“ERROR 比例”计算。

四、答案与讲解
1) info_count=$(grep -c "INFO" "$log_file")
2) 可用 awk 做比例计算与格式化。
DOC

log_file="${1:-app.log}" # 读取第1个参数作为日志文件名，默认 app.log

if [[ ! -f "$log_file" ]]; then # 判断日志文件是否存在
  echo "日志文件不存在: ${log_file}" # 输出错误提示
  exit 1 # 异常退出
fi

error_count="$(grep -c "ERROR" "$log_file")" # 统计 ERROR 行数
warn_count="$(grep -c "WARN" "$log_file")" # 统计 WARN 行数

echo "log_file=${log_file}" # 输出日志文件名
echo "ERROR=${error_count}" # 输出 ERROR 统计
echo "WARN=${warn_count}" # 输出 WARN 统计

if (( error_count > warn_count )); then # 比较 ERROR 与 WARN
  echo "结论: ERROR 更多，优先排查故障。" # 输出结论
else
  echo "结论: WARN 不少，建议持续观察。" # 输出结论
fi

# 由bhw设计
