// 由bhw设计
/*
第三部分 第四章 第三节 最短路径算法
示例: Dijkstra(适用非负权图)。

习题:
1) 记录前驱数组并恢复最短路径。
2) 比较Dijkstra与Bellman-Ford。

答案与讲解:
1) 更新dist时同步记录pre[v]=u。
2) Bellman-Ford可处理负权边。
*/
#include <stdio.h> 

int main(void) { 
    int dist[5] = {0, 2, 3, 4, 5}; // 简化示例: 假设已算出最短路
    printf("dist_to_4=%d\n", dist[4]); // 输出到目标点最短距离
    return 0; 
} 
// 由bhw设计
