// 由bhw设计
/*
第7章 第1节 文件操作

一、原理
1) 文件 IO 的本质：把内存中的数据和磁盘上的数据互相转换。
2) 最常见操作：写文件、读文件、判断文件是否存在。
3) C# 中可用 File 类快速完成常见文件操作。

二、习题
1) 写入三行文本到 data.txt。
2) 读取 data.txt 并统计行数。

三、答案与讲解
1) File.WriteAllLines(path, lines)。
2) File.ReadAllLines(path).Length。
*/
using System; // 基础库
using System.IO; // 文件操作库

class Program // 类定义
{
    static void Main() // 主函数
    {
        string path = "data.txt"; // 定义文件路径
        string[] lines = { "name=bhw", "course=csharp", "level=beginner" }; // 待写入内容
        File.WriteAllLines(path, lines); // 写入文件

        string[] readBack = File.ReadAllLines(path); // 读取文件
        Console.WriteLine($"lineCount={readBack.Length}"); // 输出行数
    }
}
// 由bhw设计
