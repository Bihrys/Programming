// 由bhw设计
/*
第三部分 第四章 第六节 最小生成树
示例: Kruskal思想(边排序+并查集)。

习题:
1) 完整实现Kruskal并输出边集合。
2) 对比Kruskal和Prim。

答案与讲解:
1) 按权排序后依次尝试合并。
2) 稀疏图常用Kruskal, 稠密图常用Prim。
*/
#include <stdio.h> 

int main(void) { 
    int total_weight = 6; // 示例MST总权值
    printf("%d\n", total_weight); // 输出最小生成树总权值
    return 0; 
} 
// 由bhw设计
