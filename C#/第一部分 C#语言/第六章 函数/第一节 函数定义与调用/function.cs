// 由bhw设计
/*
第6章 第1节 函数定义与调用

一、原理
1) 函数（方法）是可复用逻辑单元。
2) 好函数应“单一职责”：只做一件清晰的事。
3) 参数是输入，返回值是输出。

二、习题
1) 写 Max2(a,b) 返回较大值。
2) 写 IsPrime(n) 判断是否质数。

三、答案与讲解
1) return a > b ? a : b;
2) 从 2 到 sqrt(n) 试除。
*/
using System; // 引入系统库

class Program // 定义类
{
    static int Add(int a, int b) // 定义加法函数
    {
        return a + b; // 返回求和结果
    }

    static void Main() // 主函数
    {
        int result = Add(3, 5); // 调用 Add 函数
        Console.WriteLine($"result={result}"); // 输出返回值
    }
}
// 由bhw设计
