// 由bhw设计
/*
第8章 第1节 引用类型和值类型

一、核心原理
1) 值类型（int/struct）赋值通常复制“值”。
2) 引用类型（class）赋值复制“引用地址”。
3) 理解这个差异能避免很多“为什么改了一个另一个也变了”的问题。

二、习题
1) 分别对值类型和引用类型做赋值后修改，观察差异。
2) 总结“浅拷贝”和“深拷贝”区别。

三、答案与讲解
1) 值类型相互独立；引用类型默认共享同一对象。
2) 浅拷贝复制引用，深拷贝复制对象内容。
*/
using System; // 输出库

class Box // 引用类型示例
{
    public int Value; // 字段
}

class Program
{
    static void Main()
    {
        int a = 10; // 值类型变量 a
        int b = a; // 值复制
        b = 20; // 修改 b 不影响 a
        Console.WriteLine($"a={a}, b={b}"); // 输出值类型结果

        Box x = new Box { Value = 10 }; // 创建对象 x
        Box y = x; // 复制引用
        y.Value = 20; // 通过 y 修改对象
        Console.WriteLine($"x.Value={x.Value}, y.Value={y.Value}"); // 两者都变为20
    }
}
// 由bhw设计
