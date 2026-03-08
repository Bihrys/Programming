// 由bhw设计
/*
第四章 第一节 函数定义与调用

一、为什么要用函数
1) 把重复逻辑封装，减少复制代码。
2) 主程序更清晰，便于调试和维护。
3) 函数可以有参数和返回值。

二、基本结构
返回类型 函数名(参数列表)
{
    函数体;
    return 返回值;
}

三、练习题
1) 写一个函数返回两个整数中的较大值。
2) 写一个函数计算1到n的和。
*/
#include <iostream> // 输入输出
using namespace std; // 标准命名空间

int Add(int a, int b) // 定义加法函数，接收两个int并返回int
{
    int result = a + b; // 计算结果
    return result; // 返回计算值
} // Add函数结束

int Square(int x) // 定义平方函数
{
    return x * x; // 直接返回x的平方
} // Square函数结束

int main() // 主函数
{
    int x = 3; // 定义变量x
    int y = 5; // 定义变量y
    cout << "Add(x, y) = " << Add(x, y) << endl; // 调用Add函数
    cout << "Square(y) = " << Square(y) << endl; // 调用Square函数
    return 0; // 正常结束
} // main结束

/*
练习题答案（注释版）
1) 求较大值：
// int Max2(int a, int b) // 函数定义
// {
//     return (a > b) ? a : b; // 三目运算符返回较大值
// } // 结束

2) 求1到n和：
// int SumN(int n) // 定义函数
// {
//     int s = 0; // 累加器
//     for (int i = 1; i <= n; i++) s += i; // 累加
//     return s; // 返回和
// } // 结束
*/
// 由bhw设计
