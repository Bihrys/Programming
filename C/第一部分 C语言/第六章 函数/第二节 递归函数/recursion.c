// 由bhw设计
/*
第6章 第2节 递归函数
核心点:
1) 函数调用自身称为递归。
2) 必须有明确终止条件。
3) 递归层数过深会导致栈溢出。

习题:
1) 写递归版斐波那契。
2) 对比递归和循环计算阶乘的效率。

答案与讲解:
1) f(n)=f(n-1)+f(n-2), 边界f(1)=f(2)=1。
2) 循环通常更省栈空间。
*/
#include <stdio.h> // 使用printf输出结果

long long factorial(int n) { // 定义递归函数计算阶乘
    if (n <= 1) return 1; // 终止条件: n<=1时返回1
    return n * factorial(n - 1); // 递归调用: n乘以(n-1)的阶乘
} // factorial结束

int main(void) { // 主函数开始
    printf("%lld\n", factorial(5)); // 调用递归函数并输出结果
    return 0; // 正常结束
} // main结束
// 由bhw设计
