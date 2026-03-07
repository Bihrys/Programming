// 由bhw设计
/*
第6章 第1节 函数
核心点:
1) 函数用于封装可复用逻辑。
2) 函数签名包含返回类型、函数名、参数列表。
3) 主函数通过调用函数获得结果。

习题:
1) 写max2(a,b)返回较大值。
2) 写is_prime(n)判断质数。

答案与讲解:
1) return (a>b)?a:b;
2) 从2到sqrt(n)试除。
*/
#include <stdio.h> // 标准输入输出

int add(int a, int b) { // 定义加法函数, 接收两个int参数
    return a + b; // 返回a与b之和
} // add函数结束

int main(void) { // 主函数开始
    int result = add(3, 5); // 调用add函数并接收返回值
    printf("result=%d\n", result); // 输出计算结果
    return 0; // 正常结束
} // main结束
// 由bhw设计
