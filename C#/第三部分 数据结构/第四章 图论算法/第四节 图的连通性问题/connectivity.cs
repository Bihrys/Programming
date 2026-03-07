// 由bhw设计
/*
第三部分 第四章 第四节 图的连通性问题

一、原理
1) 连通分量：互相可达的点集合。
2) 统计连通分量常用 DFS/BFS。
3) 无向图中每次从未访问点启动 DFS，计数 +1。

二、习题
1) 判断图是否全连通。
2) 输出连通分量个数。

三、答案与讲解
1) 只要有点未访问，即非全连通。
2) 启动 DFS 的次数就是分量数。
*/
using System; // 输出

class Program
{
    static int[,] g = // 邻接矩阵示例
    {
        {0,1,0,0,0},
        {1,0,0,0,0},
        {0,0,0,1,0},
        {0,0,1,0,0},
        {0,0,0,0,0}
    };
    static bool[] vis = new bool[5]; // 访问标记

    static void Dfs(int u) // 深搜函数
    {
        vis[u] = true; // 标记访问
        for (int v = 0; v < 5; v++) // 枚举邻点
        {
            if (g[u, v] == 1 && !vis[v]) Dfs(v); // 递归未访问邻点
        }
    }

    static void Main()
    {
        int comp = 0; // 连通分量计数
        for (int i = 0; i < 5; i++) // 枚举每个点
        {
            if (!vis[i]) // 未访问点
            {
                comp++; // 新分量
                Dfs(i); // 扩展该分量
            }
        }
        Console.WriteLine(comp); // 输出分量数
    }
}
// 由bhw设计
