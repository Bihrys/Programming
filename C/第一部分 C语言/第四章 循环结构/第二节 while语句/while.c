// 由bhw设计
/*
第4章 第2节 while语句
while语法:
while(条件) { 循环体 }
适合循环次数不确定的场景。

习题:
1) 输入n计算n的阶乘。
2) 连续输入整数直到输入0停止并求和。

答案与讲解:
1) while (n > 1) fact *= n--。
2) 用while读取并累计sum。
*/
#include <stdio.h> // 输入输出函数

int main(void) { // 主函数开始
    int n = 5; // 定义并初始化n
    long long fact = 1; // 定义阶乘结果变量
    while (n > 1) { // 当n大于1继续循环
        fact *= n; // 累乘当前n
        n--; // n递减, 逐步逼近终止条件
    } // while结束
    printf("fact=%lld\n", fact); // 输出阶乘结果
    return 0; // 程序正常返回
} // main结束
// 由bhw设计
