// 由bhw设计
/*
第2章 第2节 运算符和表达式

一、常用运算符
1) 算术：+ - * / %
2) 比较：> < >= <= == !=
3) 逻辑：&& || !

二、原理
1) 表达式会按“优先级+结合性”求值。
2) 不确定优先级时，加括号提升可读性和正确性。

三、习题
1) 输入 a,b，输出 a+b、a-b、a*b、a/b、a%b。
2) 判断 n 是否在 [1,100] 内。

四、答案与讲解
1) 注意 b 不能为 0（除法安全）。
2) 条件：n >= 1 && n <= 100。
*/
using System; // 引入基础库

class Program // 类定义
{
    static void Main() // 入口
    {
        int a = 10; // 初始化 a
        int b = 3; // 初始化 b
        int sum = a + b; // 加法
        int mod = a % b; // 取模
        bool ok = (a > b) && (b > 0); // 逻辑表达式
        Console.WriteLine($"sum={sum}, mod={mod}, ok={ok}"); // 输出多个值
    } // Main 结束
} // 类结束
// 由bhw设计
