// 由bhw设计
/*
第二部分 第七章 分治算法
示例: 归并排序。
核心: 分解 -> 递归排序 -> 合并。

习题:
1) 统计逆序对数量。
2) 改成非递归归并排序。

答案与讲解:
1) 合并时若左>右, 增加逆序对。
2) 按区间长度逐层合并。
*/
#include <stdio.h> 

void merge_sort(int a[], int l, int r, int tmp[]) { 
    if (l >= r) return; // 递归终止
    int m = (l + r) / 2; // 中点
    merge_sort(a, l, m, tmp); // 排左半部分
    merge_sort(a, m + 1, r, tmp); // 排右半部分
    int i = l, j = m + 1, k = l; // 合并指针
    while (i <= m && j <= r) tmp[k++] = (a[i] <= a[j]) ? a[i++] : a[j++]; // 合并两个有序段
    while (i <= m) tmp[k++] = a[i++]; // 拷贝左段剩余
    while (j <= r) tmp[k++] = a[j++]; // 拷贝右段剩余
    for (int p = l; p <= r; ++p) a[p] = tmp[p]; // 写回原数组
} 

int main(void) { 
    int a[6] = {8, 3, 6, 1, 9, 2}, tmp[6]; // 初始化数组与辅助数组
    merge_sort(a, 0, 5, tmp); // 调用归并排序
    for (int i = 0; i < 6; ++i) printf("%d ", a[i]); // 输出排序结果
    printf("\n"); 
    return 0; 
} 
// 由bhw设计
