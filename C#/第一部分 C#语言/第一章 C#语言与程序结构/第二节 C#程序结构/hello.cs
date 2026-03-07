// 由bhw设计
/*
第1章 第2节 C#程序结构（Hello World 拆解）

一、程序结构核心
1) using：导入命名空间。
2) class：定义类型。
3) static void Main()：程序入口。
4) Console.WriteLine：向控制台输出文本。

二、原理说明
1) C# 代码先编译成 IL（中间语言），再由 .NET 运行时执行。
2) Main 是默认入口方法，程序从这里开始。

三、习题
1) 增加两行输出：你的名字和学习目标。
2) 把 Main 改成带参数形式：static void Main(string[] args)。

四、答案与讲解
1) 连续写 Console.WriteLine 即可。
2) args 用来接收命令行参数，后续会在参数章节讲到。
*/
using System; // 使用系统库

class Program // 定义程序类
{
    static void Main() // 程序主入口
    {
        Console.WriteLine("你好，世界！"); // 输出第一行
        Console.WriteLine("这是我的第一个 C# 程序。"); // 输出第二行
    } // Main 结束
} // 类结束
// 由bhw设计
