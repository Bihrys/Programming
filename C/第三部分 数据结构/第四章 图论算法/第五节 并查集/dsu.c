// 由bhw设计
/*
第三部分 第四章 第五节 并查集
核心: 支持快速合并与查询是否同集合。

习题:
1) 统计连通块数量。
2) 加入按秩合并优化。

答案与讲解:
1) 合并所有边后统计根节点数。
2) 小树挂到大树减少高度。
*/
#include <stdio.h> 

int fa[6]; // 父节点数组

int find_root(int x) { return fa[x] == x ? x : (fa[x] = find_root(fa[x])); } // 带路径压缩查找

void unite(int a, int b) { int ra = find_root(a), rb = find_root(b); if (ra != rb) fa[ra] = rb; } // 合并集合

int main(void) { 
    for (int i = 1; i <= 5; ++i) fa[i] = i; // 初始化每个点自成集合
    unite(1, 2); // 合并1和2
    unite(2, 3); // 合并2和3
    printf("%d\n", find_root(1) == find_root(3)); // 输出1和3是否连通
    return 0; 
} 
// 由bhw设计
