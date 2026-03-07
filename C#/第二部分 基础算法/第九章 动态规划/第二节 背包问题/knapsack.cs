// 由bhw设计
/*
第二部分 第九章 第二节 背包问题（0/1 背包）

一、原理
1) dp[w]：容量为 w 时可取得的最大价值。
2) 转移：dp[w] = max(dp[w], dp[w-weight] + value)。
3) 0/1 背包要“逆序遍历容量”，防止同一物品重复使用。

二、习题
1) 改成二维 DP 写法。
2) 改成完全背包（容量正序遍历）。

三、答案与讲解
1) dp[i,w] 更直观但空间更大。
2) 完全背包允许重复取同一物品。
*/
using System; // 输出

class Program
{
    static void Main()
    {
        int W = 7; // 背包容量
        int[] weight = { 3, 4, 2 }; // 物品重量
        int[] value = { 4, 5, 3 }; // 物品价值
        int[] dp = new int[W + 1]; // 一维 DP 数组

        for (int i = 0; i < weight.Length; i++) // 遍历每件物品
        {
            for (int w = W; w >= weight[i]; w--) // 容量逆序（0/1背包关键）
            {
                dp[w] = Math.Max(dp[w], dp[w - weight[i]] + value[i]); // 状态转移
            }
        }

        Console.WriteLine(dp[W]); // 输出最大价值
    }
}
// 由bhw设计
