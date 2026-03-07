// 由bhw设计
/*
第5章 第3节 字符类型和字符数组
核心点:
1) char存放单字符。
2) C字符串以'\\0'结束。
3) 常见库函数: strlen/strcpy/strcmp。

习题:
1) 输入字符串统计数字字符个数。
2) 判断字符串是否回文。

答案与讲解:
1) 遍历字符, 判断是否在'0'到'9'。
2) 双指针从两端向中间比较。
*/
#include <stdio.h> // 输入输出
#include <string.h> // 字符串函数

int main(void) { // 主函数开始
    char s[32] = "hello"; // 定义字符数组并初始化
    printf("s=%s len=%zu\n", s, strlen(s)); // 输出字符串和长度
    return 0; // 正常结束
} // main结束
// 由bhw设计
