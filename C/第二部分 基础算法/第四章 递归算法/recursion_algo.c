// 由bhw设计
/*
第二部分 第四章 递归算法
示例: 快速幂(递归分治)。
核心: n分成n/2子问题, 复杂度O(log n)。

习题:
1) 改成循环版快速幂。
2) 增加取模版本pow_mod。

答案与讲解:
1) 用二进制位迭代。
2) 每步乘法后取模。
*/
#include <stdio.h> 

long long fast_pow(long long a, long long n) { 
    if (n == 0) return 1; // 递归边界
    long long half = fast_pow(a, n / 2); // 求子问题
    if (n % 2 == 0) return half * half; // 偶数指数
    return half * half * a; // 奇数指数
} 

int main(void) { 
    printf("%lld\n", fast_pow(2, 10)); // 输出2^10
    return 0; 
} 
// 由bhw设计
