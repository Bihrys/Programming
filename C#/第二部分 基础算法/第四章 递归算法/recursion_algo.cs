// 由bhw设计
/*
第二部分 第四章 递归算法

一、原理
1) 递归常与分治配合：把大问题拆成小问题。
2) 快速幂是典型递归分治：a^n -> a^(n/2)。
3) 时间复杂度可从 O(n) 降到 O(log n)。

二、习题
1) 实现快速幂并支持 long。
2) 扩展为取模快速幂（竞赛高频）。

三、答案与讲解
1) n 为偶数和奇数的转移不同。
2) 每次乘法后取模，避免溢出与超时。
*/
using System; // 输出库

class Program
{
    static long FastPow(long a, long n) // 快速幂函数
    {
        if (n == 0) return 1; // 终止条件
        long half = FastPow(a, n / 2); // 递归求子问题
        if (n % 2 == 0) return half * half; // 偶数幂
        return half * half * a; // 奇数幂
    }

    static void Main()
    {
        Console.WriteLine(FastPow(2, 10)); // 输出 2^10
    }
}
// 由bhw设计
