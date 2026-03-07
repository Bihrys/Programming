// 由bhw设计
/*
第4章 第2节 while语句

一、语法
while (条件) { 循环体 }

二、原理
1) 先判断条件，再决定是否执行循环体。
2) 适合“循环次数不固定”的问题。

三、习题
1) 输入 n，计算 n 的阶乘。
2) 持续读入整数，直到输入 0 停止并求和。

四、答案与讲解
1) while (n > 1) 做累乘。
2) while 循环中先读值，再判断终止条件。
*/
using System; // 输出库

class Program // 类定义
{
    static void Main() // 主函数
    {
        int n = 5; // 初始化 n
        long fact = 1; // 阶乘结果
        while (n > 1) // 条件为真继续
        {
            fact *= n; // 累乘
            n--; // 递减
        }
        Console.WriteLine($"fact={fact}"); // 输出结果
    } // Main结束
} // 类结束
// 由bhw设计
