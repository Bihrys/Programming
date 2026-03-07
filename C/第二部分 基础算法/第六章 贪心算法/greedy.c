// 由bhw设计
/*
第二部分 第六章 贪心算法
示例: 区间调度最大不重叠数。
核心: 按结束时间升序优先选。

习题:
1) 输出被选中的区间编号。
2) 证明该策略正确性(交换论证)。

答案与讲解:
1) 选中时记录索引。
2) 先结束给后续留下更多空间。
*/
#include <stdio.h> 

typedef struct { int l, r; } Seg; // 区间结构体

int main(void) { 
    Seg a[5] = {{1,3},{2,4},{3,5},{0,7},{5,9}}; // 示例区间
    for (int i = 0; i < 4; ++i) for (int j = 0; j < 4 - i; ++j) if (a[j].r > a[j+1].r) { Seg t = a[j]; a[j] = a[j+1]; a[j+1] = t; } // 按右端点排序
    int cnt = 0, last = -1; // 计数与上次结束点
    for (int i = 0; i < 5; ++i) if (a[i].l >= last) { cnt++; last = a[i].r; } // 贪心选择
    printf("%d\n", cnt); // 输出最多可选区间数
    return 0; 
} 
// 由bhw设计
