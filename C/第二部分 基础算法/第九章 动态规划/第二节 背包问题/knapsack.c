// 由bhw设计
/*
第二部分 第九章 第二节 背包问题
示例: 0/1背包一维DP。
核心: 容量逆序遍历防止同物品重复使用。

习题:
1) 改为二维DP版本。
2) 改成完全背包(容量正序遍历)。

答案与讲解:
1) dp[i][w]表示前i件物品容量w的最优值。
2) 完全背包允许重复取同一物品。
*/
#include <stdio.h> 

int max(int a, int b) { return a > b ? a : b; } // 返回较大值

int main(void) { 
    int W = 7; // 背包容量
    int weight[3] = {3, 4, 2}; // 物品重量
    int value[3] = {4, 5, 3}; // 物品价值
    int dp[8] = {0}; // 一维DP数组
    for (int i = 0; i < 3; ++i) { // 遍历每件物品
        for (int w = W; w >= weight[i]; --w) { // 容量逆序
            dp[w] = max(dp[w], dp[w - weight[i]] + value[i]); // 状态转移
        } 
    } 
    printf("%d\n", dp[W]); // 输出容量W的最大价值
    return 0; 
} 
// 由bhw设计
