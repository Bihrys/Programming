// 由bhw设计
/*
第2章 第6节 顺序结构实例

题目：输入长方形的长和宽，输出面积和周长。

一、解题思路
1) 读入 length 与 width。
2) 面积 area = length * width。
3) 周长 perimeter = 2 * (length + width)。

二、习题
1) 改成输入圆半径，输出面积和周长。
2) 增加输入合法性判断（长宽必须 > 0）。

三、答案与讲解
1) 圆面积 PI*r*r，周长 2*PI*r。
2) if (length <= 0 || width <= 0) 直接提示并返回。
*/
using System; // 控制台与基础类型

class Program // 程序类
{
    static void Main() // 入口函数
    {
        Console.Write("请输入长和宽（空格分隔）: "); // 提示输入
        string line = Console.ReadLine() ?? ""; // 读取一行
        string[] parts = line.Split(' ', StringSplitOptions.RemoveEmptyEntries); // 按空格拆分

        if (parts.Length != 2) // 校验输入项数量
        {
            Console.WriteLine("输入格式错误"); // 错误提示
            return; // 结束
        }

        if (!double.TryParse(parts[0], out double length) || !double.TryParse(parts[1], out double width)) // 双重解析
        {
            Console.WriteLine("数字格式错误"); // 解析失败提示
            return; // 结束
        }

        double area = length * width; // 计算面积
        double perimeter = 2 * (length + width); // 计算周长
        Console.WriteLine($"area={area:F2}, perimeter={perimeter:F2}"); // 格式化输出
    } // Main 结束
} // 类结束
// 由bhw设计
