// 由bhw设计
/*
第三部分 第四章 第二节 图的遍历
核心: DFS深度优先, BFS广度优先。

习题:
1) 输出从1号点开始的DFS序列。
2) 输出从1号点开始的BFS序列。

答案与讲解:
1) DFS可递归实现。
2) BFS用队列实现。
*/
#include <stdio.h> 

int g[4][4] = {{0,1,1,0},{1,0,0,1},{1,0,0,1},{0,1,1,0}}; // 邻接矩阵
int vis[4] = {0}; // 访问标记

void dfs(int u) { // 深度优先遍历
    vis[u] = 1; // 标记已访问
    printf("%d ", u); // 输出当前节点
    for (int v = 0; v < 4; ++v) if (g[u][v] && !vis[v]) dfs(v); // 递归访问邻接点
} 

int main(void) { 
    dfs(0); // 从节点0开始DFS
    printf("\n"); 
    return 0; 
} 
// 由bhw设计
