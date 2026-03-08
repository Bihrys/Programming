// 由bhw设计
/*
第一章 第二节 C++程序结构

一、一个最小可运行C++程序通常包含
1) 头文件：提供库函数声明。
2) main函数：程序入口。
3) 语句：以分号结束。

二、程序执行顺序
1) 进入main函数。
2) 按顺序执行每一行语句。
3) 遇到return结束main并返回状态码。

三、练习题
1) 修改程序，输出你的名字和学习目标。
2) 把return 0改为return 1，思考含义有什么变化。
*/
#include <iostream> // 标准输入输出头文件
using namespace std; // 使用标准命名空间

int main() // 程序入口函数
{
    cout << "Hello, World!" << endl; // 输出经典第一行
    cout << "我叫bhw，我正在系统学习C++语法。" << endl; // 输出学习信息
    return 0; // 0表示程序正常退出
} // main函数结束

/*
练习题答案（注释版）
1) 参考输出：名字 + 目标。
2) return 1通常表示异常退出或非正常状态。

// #include <iostream> // 头文件
// using namespace std; // 命名空间
// int main() // 主函数
// {
//     cout << "我是bhw。" << endl; // 输出名字
//     cout << "目标：掌握C++基础语法。" << endl; // 输出目标
//     return 0; // 正常退出
// } // 结束
*/
// 由bhw设计
