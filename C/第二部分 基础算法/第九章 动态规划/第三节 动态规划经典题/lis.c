// 由bhw设计
/*
第二部分 第九章 第三节 动态规划经典题
示例: 最长上升子序列(LIS) O(n^2)。
核心: dp[i]表示以i结尾的LIS长度。

习题:
1) 输出LIS长度和序列。
2) 优化到O(n log n)。

答案与讲解:
1) 记录前驱下标重建路径。
2) 维护最小结尾数组tails。
*/
#include <stdio.h> 

int max(int a, int b) { return a > b ? a : b; } // 返回最大值

int main(void) { 
    int a[8] = {10, 9, 2, 5, 3, 7, 101, 18}; // 输入序列
    int dp[8]; // DP数组
    int ans = 1; // 最终答案
    for (int i = 0; i < 8; ++i) { // 枚举当前结尾位置
        dp[i] = 1; // 至少包含自己
        for (int j = 0; j < i; ++j) { // 枚举前面元素
            if (a[j] < a[i]) dp[i] = max(dp[i], dp[j] + 1); // 状态转移
        } 
        ans = max(ans, dp[i]); // 更新全局最优
    } 
    printf("%d\n", ans); // 输出LIS长度
    return 0; 
} 
// 由bhw设计
