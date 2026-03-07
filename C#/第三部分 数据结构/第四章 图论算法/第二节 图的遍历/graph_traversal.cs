// 由bhw设计
/*
第三部分 第四章 第二节 图的遍历

一、原理
1) DFS：深度优先，偏“走到底”。
2) BFS：广度优先，偏“按层推进”。
3) 都需要 visited 防止重复访问。

二、习题
1) 输出 DFS 访问序列。
2) 输出 BFS 访问序列。

三、答案与讲解
1) DFS 常用递归。
2) BFS 常用队列。
*/
using System; // 输出
using System.Collections.Generic; // List

class Program
{
    static List<int>[] g = // 构建邻接表
    {
        new List<int>{1,2},
        new List<int>{0,3},
        new List<int>{0,3},
        new List<int>{1,2}
    };
    static bool[] vis = new bool[4]; // 访问标记

    static void Dfs(int u) // DFS 函数
    {
        vis[u] = true; // 标记已访问
        Console.Write(u + " "); // 输出节点
        foreach (int v in g[u]) // 遍历邻接点
        {
            if (!vis[v]) Dfs(v); // 递归访问未访问节点
        }
    }

    static void Main()
    {
        Dfs(0); // 从 0 号点开始 DFS
        Console.WriteLine(); // 换行
    }
}
// 由bhw设计
