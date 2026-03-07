// 由bhw设计
/*
第三部分 第一章 栈

一、原理
1) 栈是后进先出（LIFO）结构。
2) 常见操作：Push、Pop、Peek。
3) 应用：括号匹配、表达式求值、函数调用栈。

二、习题
1) 用栈实现括号匹配。
2) 设计支持最小值查询的栈。

三、答案与讲解
1) 左括号入栈，右括号匹配栈顶。
2) 维护辅助栈记录当前最小值。
*/
using System; // 输出
using System.Collections.Generic; // Stack<T>

class Program
{
    static void Main()
    {
        Stack<int> st = new Stack<int>(); // 创建整型栈
        st.Push(10); // 入栈 10
        st.Push(20); // 入栈 20
        Console.WriteLine(st.Peek()); // 查看栈顶（20）
        st.Pop(); // 出栈一次
        Console.WriteLine(st.Peek()); // 再看栈顶（10）
    }
}
// 由bhw设计
