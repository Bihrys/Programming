// 由bhw设计
/*
第二部分 第七章 分治算法

一、原理
1) 分治三步：分解 -> 递归求解 -> 合并。
2) 归并排序是分治经典模板。
3) 复杂度通常由递归树分析得到 O(n log n)。

二、习题
1) 实现归并排序。
2) 在归并过程中统计逆序对。

三、答案与讲解
1) 分到单元素后回溯合并。
2) 当左元素 > 右元素时可累加逆序对数量。
*/
using System; // 输出库

class Program
{
    static void MergeSort(int[] a, int l, int r, int[] tmp) // 归并排序函数
    {
        if (l >= r) return; // 终止条件
        int m = (l + r) / 2; // 中点
        MergeSort(a, l, m, tmp); // 排左半
        MergeSort(a, m + 1, r, tmp); // 排右半

        int i = l, j = m + 1, k = l; // 合并指针
        while (i <= m && j <= r) // 两段都未结束
        {
            tmp[k++] = a[i] <= a[j] ? a[i++] : a[j++]; // 取较小值放入
        }
        while (i <= m) tmp[k++] = a[i++]; // 拷贝左段剩余
        while (j <= r) tmp[k++] = a[j++]; // 拷贝右段剩余
        for (int p = l; p <= r; p++) a[p] = tmp[p]; // 回写原数组
    }

    static void Main()
    {
        int[] a = { 8, 3, 6, 1, 9, 2 }; // 测试数组
        int[] tmp = new int[a.Length]; // 辅助数组
        MergeSort(a, 0, a.Length - 1, tmp); // 执行归并排序
        Console.WriteLine(string.Join(" ", a)); // 输出排序结果
    }
}
// 由bhw设计
