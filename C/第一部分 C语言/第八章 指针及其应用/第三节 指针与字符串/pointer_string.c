// 由bhw设计
/*
第8章 第3节 指针与字符串
核心点:
1) C字符串本质是char数组。
2) 可用char*逐字符遍历。
3) 结束标志是'\\0'。

习题:
1) 统计字符串中的数字字符数量。
2) 手写字符串长度函数。

答案与讲解:
1) 循环判断字符是否在'0'~'9'。
2) 遍历直到遇到'\\0'计数。
*/
#include <stdio.h> // 输入输出函数

int main(void) { // 主函数开始
    const char *s = "cpp123"; // 定义指向字符串常量的指针
    int digit_count = 0; // 统计数字字符个数
    for (const char *p = s; *p != '\0'; ++p) { // 指针遍历字符串
        if (*p >= '0' && *p <= '9') { // 判断当前字符是否为数字
            ++digit_count; // 计数加1
        } // if结束
    } // for结束
    printf("digit_count=%d\n", digit_count); // 输出统计结果
    return 0; // 正常结束
} // main结束
// 由bhw设计
