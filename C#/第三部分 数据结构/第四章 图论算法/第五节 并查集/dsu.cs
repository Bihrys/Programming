// 由bhw设计
/*
第三部分 第四章 第五节 并查集

一、原理
1) find(x)：找集合代表（根）。
2) union(a,b)：合并两个集合。
3) 路径压缩可显著提升效率。

二、习题
1) 读入边后统计连通块。
2) 判断两点是否连通。

三、答案与讲解
1) 合并所有边后统计根数量。
2) find(a)==find(b) 即连通。
*/
using System; // 输出

class Program
{
    static int[] fa = new int[6]; // 父节点数组

    static int Find(int x) // 查找根节点
    {
        if (fa[x] == x) return x; // 自己是根
        fa[x] = Find(fa[x]); // 路径压缩
        return fa[x]; // 返回根
    }

    static void Union(int a, int b) // 合并集合
    {
        int ra = Find(a); // 找 a 根
        int rb = Find(b); // 找 b 根
        if (ra != rb) fa[ra] = rb; // 根不同则合并
    }

    static void Main()
    {
        for (int i = 1; i <= 5; i++) fa[i] = i; // 初始化
        Union(1, 2); // 合并 1 和 2
        Union(2, 3); // 合并 2 和 3
        Console.WriteLine(Find(1) == Find(3)); // 判断 1 和 3 是否连通
    }
}
// 由bhw设计
