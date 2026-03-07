// 由bhw设计
/*
第二部分 第八章 广度优先搜索算法

一、原理
1) BFS 按“层”扩展，天然适合无权图最短步数。
2) 队列是核心数据结构。
3) 访问标记必须及时设置，避免重复入队。

二、习题
1) 网格最短路（四方向）。
2) 增加障碍物和八方向扩展。

三、答案与讲解
1) dist 初始 -1，起点置 0。
2) 新点合法且未访问才入队。
*/
using System; // 输出
using System.Collections.Generic; // Queue

class Program
{
    static void Main()
    {
        int n = 3, m = 3; // 网格大小
        int[,] dist = new int[n, m]; // 距离数组
        for (int i = 0; i < n; i++) // 初始化 dist 为 -1
            for (int j = 0; j < m; j++)
                dist[i, j] = -1;

        int[] dx = { 1, -1, 0, 0 }; // 四方向 x 偏移
        int[] dy = { 0, 0, 1, -1 }; // 四方向 y 偏移
        Queue<(int x, int y)> q = new Queue<(int x, int y)>(); // BFS 队列
        q.Enqueue((0, 0)); // 起点入队
        dist[0, 0] = 0; // 起点距离为 0

        while (q.Count > 0) // 队列非空
        {
            var (x, y) = q.Dequeue(); // 出队
            for (int k = 0; k < 4; k++) // 枚举四方向
            {
                int nx = x + dx[k], ny = y + dy[k]; // 新坐标
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue; // 越界跳过
                if (dist[nx, ny] != -1) continue; // 已访问跳过
                dist[nx, ny] = dist[x, y] + 1; // 更新距离
                q.Enqueue((nx, ny)); // 入队
            }
        }

        Console.WriteLine(dist[2, 2]); // 输出终点最短步数
    }
}
// 由bhw设计
