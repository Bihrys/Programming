// 由bhw设计
/*
第5章 第2节 二维数组

一、原理
1) 二维数组可视为“行列矩阵”。
2) 访问形式：a[row, col]。
3) 行列边界分别用 GetLength(0) 和 GetLength(1) 获取。

二、习题
1) 计算 3x3 主对角线和。
2) 输出矩阵转置。

三、答案与讲解
1) 累加 a[i, i]。
2) 输出 a[j, i] 即转置访问。
*/
using System; // 控制台库

class Program // 类定义
{
    static void Main() // 主函数
    {
        int[,] a = { { 1, 2, 3 }, { 4, 5, 6 } }; // 定义 2x3 二维数组
        for (int i = 0; i < a.GetLength(0); i++) // 遍历行
        {
            for (int j = 0; j < a.GetLength(1); j++) // 遍历列
            {
                Console.Write(a[i, j] + " "); // 输出当前元素
            }
            Console.WriteLine(); // 行结束换行
        }
    }
}
// 由bhw设计
