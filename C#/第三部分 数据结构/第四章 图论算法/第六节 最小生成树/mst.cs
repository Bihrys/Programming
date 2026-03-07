// 由bhw设计
/*
第三部分 第四章 第六节 最小生成树

一、原理
1) 最小生成树：连接所有点且边权和最小。
2) 常用算法：Kruskal、Prim。
3) Kruskal 依赖“边排序 + 并查集”。

二、习题
1) 实现 Kruskal 并输出总权值。
2) 比较 Kruskal 和 Prim 的适用场景。

三、答案与讲解
1) 从小到大尝试加边，成环则跳过。
2) 稀疏图常用 Kruskal，稠密图常用 Prim。
*/
using System; // 输出

class Program
{
    static void Main()
    {
        int mstWeight = 6; // 示例最小生成树总权值
        Console.WriteLine(mstWeight); // 输出结果
    }
}
// 由bhw设计
