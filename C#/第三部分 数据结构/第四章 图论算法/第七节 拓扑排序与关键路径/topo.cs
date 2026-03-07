// 由bhw设计
/*
第三部分 第四章 第七节 拓扑排序与关键路径

一、原理
1) 拓扑排序只适用于有向无环图（DAG）。
2) 入度为 0 的点先输出，再删除其出边。
3) 若最终输出点数 < n，说明图中有环。

二、习题
1) 课程依赖判断是否可完成。
2) 输出一种合法拓扑序。

三、答案与讲解
1) Kahn 算法即可。
2) 用队列维护当前入度为 0 的点。
*/
using System; // 输出

class Program
{
    static void Main()
    {
        int[] order = { 0, 1, 2, 3 }; // 示例拓扑序
        Console.WriteLine(string.Join(" ", order)); // 输出结果
    }
}
// 由bhw设计
