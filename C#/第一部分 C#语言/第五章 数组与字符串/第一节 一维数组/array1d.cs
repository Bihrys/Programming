// 由bhw设计
/*
第5章 第1节 一维数组

一、原理
1) 数组是“同类型、连续索引”的数据结构。
2) 下标从 0 开始，到 Length-1 结束。
3) 越界访问会抛 IndexOutOfRangeException。

二、习题
1) 求数组最大值和最小值。
2) 统计数组中偶数个数。

三、答案与讲解
1) 一次遍历同时更新 max/min。
2) arr[i] % 2 == 0 时计数 +1。
*/
using System; // 基础库

class Program // 类定义
{
    static void Main() // 入口
    {
        int[] arr = { 2, 4, 1, 9, 7 }; // 定义一维整型数组
        int mx = arr[0]; // 初始化最大值
        int mn = arr[0]; // 初始化最小值
        for (int i = 1; i < arr.Length; i++) // 遍历剩余元素
        {
            if (arr[i] > mx) mx = arr[i]; // 更新最大值
            if (arr[i] < mn) mn = arr[i]; // 更新最小值
        }
        Console.WriteLine($"max={mx}, min={mn}"); // 输出结果
    }
}
// 由bhw设计
