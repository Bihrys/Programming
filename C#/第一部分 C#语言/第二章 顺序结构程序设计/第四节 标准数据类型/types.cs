// 由bhw设计
/*
第2章 第4节 标准数据类型

一、常见类型
1) int：整数
2) double：双精度浮点
3) char：单字符
4) bool：布尔
5) string：字符串

二、原理
1) C# 是强类型语言，类型不匹配多数会在编译时报错。
2) 不同类型占用内存与取值范围不同。

三、习题
1) 输出 int/double/char/bool/string 示例值。
2) 尝试把 string 直接赋给 int，观察错误并解释原因。

四、答案与讲解
1) 用 Console.WriteLine 打印即可。
2) 需要显式转换且必须可转换，否则抛异常或编译失败。
*/
using System; // 引入控制台

class Program // 定义类
{
    static void Main() // 入口
    {
        int age = 18; // 整型
        double score = 96.5; // 浮点型
        char grade = 'A'; // 字符型
        bool passed = true; // 布尔型
        string name = "bhw"; // 字符串
        Console.WriteLine($"{name}, {age}, {score}, {grade}, {passed}"); // 输出所有变量
    } // Main 结束
} // 类结束
// 由bhw设计
