// 由bhw设计
/*
第二章 第三节 标准输入输出

一、输入输出对象
1) cout：标准输出，向屏幕打印信息。
2) cin：标准输入，从键盘读取数据。
3) endl：换行并刷新缓冲区。

二、输入注意事项
1) 按空格分隔时，cin会按变量类型依次读取。
2) 类型不匹配会导致读取失败。
3) 对字符串整行输入可用getline（后续章节展开）。

三、练习题
1) 输入姓名和年龄并输出自我介绍。
2) 输入两个整数，输出它们的和与差。
*/
#include <iostream> // 输入输出头文件
#include <string> // 字符串头文件
using namespace std; // 标准命名空间

int main() // 主函数
{
    string name; // 定义字符串变量存姓名
    int age = 0; // 定义整型变量存年龄
    int x = 0; // 定义第一个整数
    int y = 0; // 定义第二个整数

    cout << "请输入姓名和年龄（如 bhw 18）: "; // 提示用户输入
    cin >> name >> age; // 读取姓名和年龄
    cout << "你好，" << name << "，你今年" << age << "岁。" << endl; // 输出问候

    cout << "请输入两个整数: "; // 提示输入两个整数
    cin >> x >> y; // 读取x和y
    cout << "和 = " << x + y << endl; // 输出和
    cout << "差 = " << x - y << endl; // 输出差

    return 0; // 程序结束
} // main结束

/*
练习题答案（注释版）
1) 自我介绍：
// string name; // 姓名
// int age; // 年龄
// cin >> name >> age; // 读入
// cout << "我叫" << name << "，今年" << age << "岁。" << endl; // 输出

2) 和与差：
// int a, b; // 定义两个变量
// cin >> a >> b; // 输入
// cout << (a + b) << endl; // 输出和
// cout << (a - b) << endl; // 输出差
*/
// 由bhw设计
