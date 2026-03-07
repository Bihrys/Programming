// 由bhw设计
/*
第3章 第3节 switch语句

一、适用场景
1) 离散值分支判断（菜单、枚举、状态码）。
2) 可读性通常优于长 if-else 链。

二、原理
1) switch 按值匹配 case。
2) C# 传统 switch case 需要 break 防止继续执行。

三、习题
1) 输入 1~7 输出星期。
2) 输入字符 '+' '-' '*' '/' 实现简易计算器。

四、答案与讲解
1) 每个数字对应一个 case。
2) 计算器里要特别处理除数为 0。
*/
using System; // 控制台输入输出

class Program // 类定义
{
    static void Main() // 主函数
    {
        Console.Write("请输入 1~7: "); // 提示输入
        string text = Console.ReadLine() ?? ""; // 读取输入
        if (!int.TryParse(text, out int day)) // 解析整数
        {
            Console.WriteLine("输入错误"); // 错误提示
            return; // 结束
        }

        switch (day) // 按 day 分支
        {
            case 1: Console.WriteLine("周一"); break; // case 1
            case 2: Console.WriteLine("周二"); break; // case 2
            case 3: Console.WriteLine("周三"); break; // case 3
            case 4: Console.WriteLine("周四"); break; // case 4
            case 5: Console.WriteLine("周五"); break; // case 5
            case 6: Console.WriteLine("周六"); break; // case 6
            case 7: Console.WriteLine("周日"); break; // case 7
            default: Console.WriteLine("输入非法"); break; // 默认分支
        }
    } // Main 结束
} // 类结束
// 由bhw设计
