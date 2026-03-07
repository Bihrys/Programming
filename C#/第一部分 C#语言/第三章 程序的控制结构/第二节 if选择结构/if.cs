// 由bhw设计
/*
第3章 第2节 if选择结构

一、语法
if (条件) { ... }
else if (条件) { ... }
else { ... }

二、原理
1) 条件表达式结果必须是 bool。
2) 条件从上到下判断，命中后其余分支不再执行。

三、习题
1) 输入分数输出等级 A/B/C/D。
2) 输入整数判断奇偶和正负。

四、答案与讲解
1) 分值区间从高到低写，避免逻辑覆盖错误。
2) 可以先判正负，再判奇偶。
*/
using System; // 控制台输入输出

class Program // 类
{
    static void Main() // 主函数
    {
        Console.Write("请输入分数: "); // 提示输入
        string text = Console.ReadLine() ?? ""; // 读入文本
        if (!int.TryParse(text, out int score)) // 解析分数
        {
            Console.WriteLine("输入不是整数"); // 错误提示
            return; // 结束
        }

        if (score >= 90) // 第一分支
        {
            Console.WriteLine("A"); // 输出A
        }
        else if (score >= 60) // 第二分支
        {
            Console.WriteLine("B"); // 输出B
        }
        else // 其余分支
        {
            Console.WriteLine("C"); // 输出C
        }
    } // Main 结束
} // 类结束
// 由bhw设计
