// 由bhw设计
/*
第5章 第3节 字符串与字符

一、原理
1) char 表示单个字符。
2) string 是字符序列，C# 中字符串不可变（immutable）。
3) 字符串常用操作：Length、索引、Contains、Replace。

二、习题
1) 统计字符串中的数字字符个数。
2) 判断字符串是否回文（忽略大小写）。

三、答案与讲解
1) 遍历字符并判断 c >= '0' && c <= '9'。
2) 双指针从两端向中间比较。
*/
using System; // 使用基础库

class Program // 类定义
{
    static void Main() // 主函数
    {
        string s = "CSharp123"; // 定义字符串
        int digitCount = 0; // 数字字符计数
        foreach (char c in s) // 逐字符遍历
        {
            if (c >= '0' && c <= '9') // 判断是否数字
            {
                digitCount++; // 计数加一
            }
        }
        Console.WriteLine($"digitCount={digitCount}"); // 输出统计结果
    }
}
// 由bhw设计
