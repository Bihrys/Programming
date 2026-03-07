// 由bhw设计
/*
第4章 第3节 do-while语句

一、语法
do { 循环体 } while (条件);

二、原理
1) 先执行一次循环体，再判断条件。
2) 至少会执行一次，和 while 的行为不同。

三、习题
1) 写一个菜单循环，输入 0 退出。
2) 写猜数字流程（至少猜一次）。

四、答案与讲解
1) do 中显示菜单并读入选择。
2) 猜中前持续循环。
*/
using System; // 输出库

class Program // 类定义
{
    static void Main() // 主函数
    {
        int x = 3; // 初始化变量
        do // 至少执行一次
        {
            Console.WriteLine($"x={x}"); // 输出当前 x
            x--; // x 递减
        } while (x > 0); // 条件判断
    } // Main 结束
} // 类结束
// 由bhw设计
