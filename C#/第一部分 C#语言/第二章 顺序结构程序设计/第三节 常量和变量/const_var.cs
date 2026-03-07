// 由bhw设计
/*
第2章 第3节 常量和变量

一、概念
1) 变量：值可变。
2) 常量：值不可变（const 修饰）。
3) 好命名能显著降低后续维护成本。

二、原理
1) const 常量在编译期就确定。
2) 变量在运行期可以被重新赋值。

三、习题
1) 定义 PI 并计算半径为 3 的圆面积。
2) 尝试修改 const 变量，观察编译错误。

四、答案与讲解
1) area = PI * r * r。
2) const 不允许再次赋值，这是类型安全的一部分。
*/
using System; // 引入输出库

class Program // 定义类
{
    static void Main() // 入口函数
    {
        const double PI = 3.1415926; // 定义常量 PI
        double radius = 3.0; // 定义变量 radius
        double area = PI * radius * radius; // 计算圆面积
        Console.WriteLine($"area = {area:F2}"); // 保留两位小数输出
    } // Main 结束
} // 类结束
// 由bhw设计
