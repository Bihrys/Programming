// 由bhw设计
/*
第6章 第2节 递归函数

一、原理
1) 递归 = 函数直接或间接调用自己。
2) 必须有终止条件，否则会栈溢出。
3) 递归常用于树、分治、回溯问题。

二、习题
1) 写递归版斐波那契。
2) 对比递归和循环求阶乘的优缺点。

三、答案与讲解
1) Fib(n) = Fib(n-1) + Fib(n-2)。
2) 递归写法直观，循环通常更省栈空间。
*/
using System; // 输出库

class Program // 类定义
{
    static long Factorial(int n) // 定义递归阶乘函数
    {
        if (n <= 1) return 1; // 终止条件
        return n * Factorial(n - 1); // 递归调用
    }

    static void Main() // 主函数
    {
        Console.WriteLine(Factorial(5)); // 输出 5! = 120
    }
}
// 由bhw设计
