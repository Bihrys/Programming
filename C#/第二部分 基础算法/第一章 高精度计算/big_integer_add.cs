// 由bhw设计
/*
第二部分 第一章 高精度计算

一、原理
1) 普通整数有范围上限，超范围会溢出。
2) C# 可用 BigInteger 直接支持大整数运算。
3) 信息学里也常自己写“字符串高精度”，用于训练位运算思维。

二、习题
1) 用 BigInteger 做超大整数加法。
2) 尝试实现“字符串模拟高精度加法”。

三、答案与讲解
1) BigInteger.Parse + 运算符即可。
2) 手写版本要从低位到高位处理进位。
*/
using System; // 控制台
using System.Numerics; // BigInteger 所在命名空间

class Program
{
    static void Main()
    {
        BigInteger a = BigInteger.Parse("123456789123456789123456789"); // 读取大整数 a
        BigInteger b = BigInteger.Parse("999999999999999999999999999"); // 读取大整数 b
        BigInteger sum = a + b; // 大整数加法
        Console.WriteLine(sum); // 输出结果
    }
}
// 由bhw设计
