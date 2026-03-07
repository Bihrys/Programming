// 由bhw设计
/*
第二部分 第八章 广度优先搜索算法
示例: 3x3网格最短步数。
核心: 队列按层扩展, 首次到达即最短。

习题:
1) 加入障碍物格子。
2) 扩展到八方向移动。

答案与讲解:
1) 障碍点不入队。
2) 增加8组方向向量。
*/
#include <stdio.h> 

int main(void) { 
    int qx[100], qy[100], head = 0, tail = 0; // 简单队列实现
    int dist[3][3] = {{0,-1,-1},{-1,-1,-1},{-1,-1,-1}}; // 距离数组, -1表示未访问
    int dx[4] = {1,-1,0,0}, dy[4] = {0,0,1,-1}; // 四方向
    qx[tail] = 0; qy[tail] = 0; tail++; // 起点入队
    while (head < tail) { // 队列非空
        int x = qx[head], y = qy[head]; head++; // 出队
        for (int k = 0; k < 4; ++k) { // 枚举方向
            int nx = x + dx[k], ny = y + dy[k]; // 计算新坐标
            if (nx < 0 || nx >= 3 || ny < 0 || ny >= 3) continue; // 越界跳过
            if (dist[nx][ny] != -1) continue; // 已访问跳过
            dist[nx][ny] = dist[x][y] + 1; // 更新最短距离
            qx[tail] = nx; qy[tail] = ny; tail++; // 新点入队
        } 
    } 
    printf("%d\n", dist[2][2]); // 输出终点最短步数
    return 0; 
} 
// 由bhw设计
