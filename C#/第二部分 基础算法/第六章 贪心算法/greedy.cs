// 由bhw设计
/*
第二部分 第六章 贪心算法

一、原理
1) 贪心：每一步都做当前看起来最优的选择。
2) 关键难点不是实现，而是证明“局部最优 -> 全局最优”。
3) 经典例子：区间调度（按结束时间排序）。

二、习题
1) 实现区间不重叠最大数量。
2) 输出被选中的区间。

三、答案与讲解
1) 先排序，再尽量选结束早的区间。
2) 记录选中区间下标或内容即可。
*/
using System; // 控制台
using System.Linq; // 排序

class Program
{
    static void Main()
    {
        (int l, int r)[] segs = { (1, 3), (2, 4), (3, 5), (0, 7), (5, 9) }; // 区间集合
        var sorted = segs.OrderBy(s => s.r).ToArray(); // 按结束时间升序排序

        int count = 0; // 可选区间计数
        int lastEnd = int.MinValue; // 上一个选中区间结束点
        foreach (var s in sorted) // 遍历排序后区间
        {
            if (s.l >= lastEnd) // 若与上个区间不冲突
            {
                count++; // 计数增加
                lastEnd = s.r; // 更新结束点
            }
        }
        Console.WriteLine(count); // 输出最大数量
    }
}
// 由bhw设计
