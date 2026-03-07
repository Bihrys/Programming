// 由bhw设计
/*
第三部分 第四章 第四节 图的联通性问题
核心: 用DFS/BFS统计连通块数量。

习题:
1) 判断给定图是否全连通。
2) 统计无向图连通分量个数。

答案与讲解:
1) 从任一点出发遍历后看是否全访问。
2) 对每个未访问点启动一次DFS计数。
*/
#include <stdio.h> 

int g[5][5] = {{0,1,0,0,0},{1,0,0,0,0},{0,0,0,1,0},{0,0,1,0,0},{0,0,0,0,0}}; // 图
int vis[5] = {0}; // 访问标记

void dfs(int u) { vis[u] = 1; for (int v = 0; v < 5; ++v) if (g[u][v] && !vis[v]) dfs(v); } // 深搜函数

int main(void) { 
    int comp = 0; // 连通块计数
    for (int i = 0; i < 5; ++i) if (!vis[i]) { comp++; dfs(i); } // 统计连通块
    printf("%d\n", comp); // 输出连通块数
    return 0; 
} 
// 由bhw设计
