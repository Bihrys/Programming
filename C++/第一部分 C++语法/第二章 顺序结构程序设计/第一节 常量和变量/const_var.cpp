// 由bhw设计
/*
第二章 第一节 常量和变量

一、核心概念
1) 变量：程序运行过程中值可以改变的数据。
2) 常量：定义后值不能再变，常用const修饰。
3) 命名规则：字母、数字、下划线组成，不能以数字开头，不能用关键字。

二、初学者易错点
1) 未初始化变量就使用。
2) 把const变量再次赋值。
3) 混淆“字面量常量”和“符号常量”。

三、练习题
1) 定义一个int变量age和一个const double变量PI并输出。
2) 尝试修改PI，观察编译器报错信息。
*/
#include <iostream> // 输入输出库
using namespace std; // 标准命名空间

int main() // 程序入口
{
    int age = 18; // 定义整型变量age并初始化为18
    const double PI = 3.1415926; // 定义常量PI，后续不能修改
    double score = 95.5; // 定义浮点变量score

    cout << "age = " << age << endl; // 输出age
    cout << "PI = " << PI << endl; // 输出PI
    cout << "score = " << score << endl; // 输出score

    age = 19; // 变量可以重新赋值
    score = score + 1.0; // 变量可以参与计算后再赋值
    cout << "更新后 age = " << age << ", score = " << score << endl; // 输出更新结果

    return 0; // 正常返回
} // main结束

/*
练习题答案（注释版）
1) 完整参考：

// #include <iostream> // 头文件
// using namespace std; // 命名空间
// int main() // 主函数
// {
//     int age = 20; // 定义年龄
//     const double PI = 3.1415926; // 定义圆周率常量
//     cout << "age=" << age << ", PI=" << PI << endl; // 输出变量和常量
//     return 0; // 正常返回
// } // 结束

2) 修改PI会编译报错，说明常量不能被再次赋值。
*/
// 由bhw设计
