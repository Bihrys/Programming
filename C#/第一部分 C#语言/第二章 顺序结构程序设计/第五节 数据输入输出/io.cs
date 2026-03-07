// 由bhw设计
/*
第2章 第5节 数据输入输出

一、输入输出基础
1) 输出：Console.Write / Console.WriteLine
2) 输入：Console.ReadLine() 读取一整行字符串
3) 类型转换：int.Parse / double.Parse / TryParse

二、原理
1) 控制台输入本质是字符串。
2) 你要根据目标类型做解析（例如转 int）。
3) 初学者优先使用 TryParse 处理错误输入。

三、习题
1) 输入姓名和年龄并输出。
2) 输入两个整数并输出和。

四、答案与讲解
1) name = Console.ReadLine();
2) int.TryParse 可避免异常中断。
*/
using System; // 控制台输入输出

class Program // 程序类
{
    static void Main() // 主函数
    {
        Console.Write("请输入姓名: "); // 输出输入提示
        string name = Console.ReadLine() ?? ""; // 读取姓名，防空值
        Console.Write("请输入年龄: "); // 输出年龄提示
        string ageText = Console.ReadLine() ?? "0"; // 读取年龄文本

        if (!int.TryParse(ageText, out int age)) // 尝试把文本转 int
        {
            Console.WriteLine("年龄输入格式错误"); // 解析失败提示
            return; // 结束程序
        }

        Console.WriteLine($"name={name}, age={age}"); // 输出解析结果
    } // Main 结束
} // 类结束
// 由bhw设计
