// 由bhw设计
/*
第三部分 第二章 队列
核心: 先进先出(FIFO)。
应用: BFS、任务调度、消息缓冲。

习题:
1) 实现循环队列。
2) 用队列做层序遍历。

答案与讲解:
1) 用head/tail取模管理下标。
2) 根节点入队, 出队时把孩子入队。
*/
#include <stdio.h> 

int main(void) { 
    int q[10], head = 0, tail = 0; // 数组模拟队列
    q[tail++] = 1; // 入队1
    q[tail++] = 2; // 入队2
    q[tail++] = 3; // 入队3
    printf("%d\n", q[head]); // 读队头
    head++; // 出队一次
    printf("%d\n", q[head]); // 再读队头
    return 0; 
} 
// 由bhw设计
