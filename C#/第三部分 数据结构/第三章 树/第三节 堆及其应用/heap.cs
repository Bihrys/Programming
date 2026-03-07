// 由bhw设计
/*
第三部分 第三章 第三节 堆及其应用

一、原理
1) 堆是完全二叉树，满足堆序性质。
2) 小根堆：父节点 <= 子节点；大根堆相反。
3) 应用：优先队列、Top-K、堆排序。

二、习题
1) 用最小堆实现“实时前 K 大”。
2) 对比堆排序与快速排序。

三、答案与讲解
1) 维护容量为 K 的小根堆。
2) 堆排序稳定性较差但最坏复杂度稳定。
*/
using System; // 输出
using System.Collections.Generic; // PriorityQueue

class Program
{
    static void Main()
    {
        PriorityQueue<int, int> minHeap = new PriorityQueue<int, int>(); // 创建最小堆（优先级越小越先出）
        minHeap.Enqueue(5, 5); // 入堆元素 5
        minHeap.Enqueue(2, 2); // 入堆元素 2
        minHeap.Enqueue(8, 8); // 入堆元素 8
        Console.WriteLine(minHeap.Peek()); // 查看堆顶（最小值）
    }
}
// 由bhw设计
