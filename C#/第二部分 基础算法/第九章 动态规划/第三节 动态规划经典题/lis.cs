// 由bhw设计
/*
第二部分 第九章 第三节 动态规划经典题（LIS）

题目：最长上升子序列长度（O(n^2) 版本）

一、原理
1) dp[i] 表示“以 i 位置结尾”的 LIS 长度。
2) 枚举 j < i 且 a[j] < a[i] 时转移。
3) 最终答案是 max(dp[i])。

二、习题
1) 输出 LIS 长度与具体序列。
2) 优化到 O(n log n)。

三、答案与讲解
1) 可记录前驱数组还原路径。
2) 使用 tails + 二分。
*/
using System; // 输出

class Program
{
    static void Main()
    {
        int[] a = { 10, 9, 2, 5, 3, 7, 101, 18 }; // 输入序列
        int n = a.Length; // 序列长度
        int[] dp = new int[n]; // DP数组
        int ans = 1; // 记录全局最优

        for (int i = 0; i < n; i++) // 枚举结尾位置
        {
            dp[i] = 1; // 至少包含自己
            for (int j = 0; j < i; j++) // 枚举前面位置
            {
                if (a[j] < a[i]) // 满足上升条件
                {
                    dp[i] = Math.Max(dp[i], dp[j] + 1); // 状态转移
                }
            }
            ans = Math.Max(ans, dp[i]); // 更新答案
        }

        Console.WriteLine(ans); // 输出 LIS 长度
    }
}
// 由bhw设计
