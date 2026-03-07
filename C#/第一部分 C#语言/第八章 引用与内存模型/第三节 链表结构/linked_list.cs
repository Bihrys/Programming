// 由bhw设计
/*
第8章 第3节 链表结构

一、原理
1) 链表由节点构成，每个节点保存“值 + 下一个节点引用”。
2) 相比数组，链表插入删除更灵活，但随机访问慢。
3) 信息学里常用于理解指针思想和动态结构。

二、习题
1) 在头部插入一个新节点。
2) 删除值为 x 的第一个节点。

三、答案与讲解
1) newNode.Next = head; head = newNode;
2) 需要处理删除头节点和中间节点两种情况。
*/
using System; // 输出库

class Node // 定义链表节点类
{
    public int Value; // 节点值
    public Node? Next; // 指向下一个节点
}

class Program
{
    static void Main()
    {
        Node a = new Node { Value = 1 }; // 创建节点 a
        Node b = new Node { Value = 2 }; // 创建节点 b
        Node c = new Node { Value = 3 }; // 创建节点 c
        a.Next = b; // a 指向 b
        b.Next = c; // b 指向 c

        Node? p = a; // 定义遍历指针
        while (p != null) // 遍历到末尾为止
        {
            Console.Write(p.Value + " "); // 输出当前节点值
            p = p.Next; // 移动到下一个节点
        }
        Console.WriteLine(); // 换行
    }
}
// 由bhw设计
