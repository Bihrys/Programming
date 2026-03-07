// 由bhw设计
/*
第二部分 第五章 搜索与回溯算法

一、原理
1) DFS：深度优先，一条路走到底再回退。
2) 回溯：在 DFS 基础上“做选择 -> 递归 -> 撤销选择”。
3) 信息学中常用于全排列、组合、N 皇后等问题。

二、习题
1) 输出 1..n 的全排列。
2) 在回溯中加入剪枝减少搜索量。

三、答案与讲解
1) 用 used[] 记录是否已使用。
2) 提前判断不可能成立的分支并 return。
*/
using System; // 输出库
using System.Collections.Generic; // List

class Program
{
    static void Dfs(int n, List<int> path, bool[] used) // 回溯函数
    {
        if (path.Count == n) // 到达一个完整解
        {
            Console.WriteLine(string.Join("", path)); // 输出当前排列
            return; // 返回上一层
        }

        for (int i = 1; i <= n; i++) // 尝试每个候选数字
        {
            if (used[i]) continue; // 已用过则跳过
            used[i] = true; // 做选择
            path.Add(i); // 放入路径
            Dfs(n, path, used); // 递归
            path.RemoveAt(path.Count - 1); // 撤销选择
            used[i] = false; // 恢复状态
        }
    }

    static void Main()
    {
        int n = 3; // 目标规模
        Dfs(n, new List<int>(), new bool[n + 1]); // 启动搜索
    }
}
// 由bhw设计
