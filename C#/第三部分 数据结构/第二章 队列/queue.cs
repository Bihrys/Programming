// 由bhw设计
/*
第三部分 第二章 队列

一、原理
1) 队列是先进先出（FIFO）结构。
2) 常见操作：Enqueue、Dequeue、Peek。
3) 应用：BFS、任务调度、消息缓存。

二、习题
1) 用数组手写循环队列。
2) 用队列做二叉树层序遍历。

三、答案与讲解
1) 用 head/tail + 取模管理。
2) 每次出队一个节点，把其子节点入队。
*/
using System; // 输出
using System.Collections.Generic; // Queue<T>

class Program
{
    static void Main()
    {
        Queue<int> q = new Queue<int>(); // 创建队列
        q.Enqueue(1); // 入队 1
        q.Enqueue(2); // 入队 2
        q.Enqueue(3); // 入队 3
        Console.WriteLine(q.Peek()); // 查看队头（1）
        q.Dequeue(); // 出队一次
        Console.WriteLine(q.Peek()); // 再看队头（2）
    }
}
// 由bhw设计
