// 由bhw设计
/*
第8章 第2节 ref 与 out 参数

一、原理
1) ref：调用前变量必须已赋值，函数内部可读可写。
2) out：调用前可以未赋值，函数内部必须赋值后返回。
3) 这两个关键字能让函数“带回多个结果”。

二、习题
1) 写函数交换两个整数（ref）。
2) 写函数 TryDivide(a,b,out result)。

三、答案与讲解
1) ref 参数可直接交换。
2) 除数为 0 返回 false，并给 result 默认值。
*/
using System; // 控制台库

class Program
{
    static void Swap(ref int a, ref int b) // 用 ref 交换两个变量
    {
        int t = a; // 临时保存 a
        a = b; // b 赋给 a
        b = t; // 临时值赋给 b
    }

    static bool TryDivide(int x, int y, out double result) // 用 out 返回计算结果
    {
        if (y == 0) // 除数为零时处理
        {
            result = 0; // out 参数必须赋值
            return false; // 返回失败
        }
        result = (double)x / y; // 正常计算结果
        return true; // 返回成功
    }

    static void Main()
    {
        int m = 3, n = 5; // 定义两个变量
        Swap(ref m, ref n); // 调用 ref 交换
        Console.WriteLine($"m={m}, n={n}"); // 输出交换结果

        if (TryDivide(10, 2, out double ans)) // 调用 out 函数
        {
            Console.WriteLine($"ans={ans}"); // 输出除法结果
        }
    }
}
// 由bhw设计
