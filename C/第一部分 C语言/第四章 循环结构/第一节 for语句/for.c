// 由bhw设计
/*
第4章 第1节 for语句
for语法:
for(初始化; 条件; 更新) { 循环体 }
适合循环次数已知的情况。

习题:
1) 求1到100的和。
2) 输出1到n中的所有偶数。

答案与讲解:
1) sum += i循环累加。
2) if (i % 2 == 0) 输出即可。
*/
#include <stdio.h> // 标准输入输出

int main(void) { // 主函数开始
    int sum = 0; // 定义累加器
    for (int i = 1; i <= 100; ++i) { // i从1到100循环
        sum += i; // 每轮把i加到sum
    } // for循环结束
    printf("sum=%d\n", sum); // 输出最终和
    return 0; // 程序正常结束
} // main结束
// 由bhw设计
