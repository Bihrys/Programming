// 由bhw设计
/*
第三章 第二节 switch语句

一、适用场景
1) 一个变量有多个“离散值”分支时，switch通常比多重if更清晰。
2) case后面一般是常量表达式。

二、关键字含义
1) switch(表达式)：根据表达式的值匹配case。
2) case 常量: 对应分支。
3) break: 跳出switch，防止继续向下贯穿。
4) default: 兜底分支，前面都不匹配时执行。

三、练习题
1) 输入1~7输出星期几。
2) 输入运算符(+ - * /)并计算两个整数。
*/
#include <iostream> // 输入输出
using namespace std; // 标准命名空间

int main() // 主函数
{
    int day = 0; // 存储星期编号
    cout << "请输入1~7: "; // 提示输入
    cin >> day; // 读取day

    switch (day) // 开始多分支匹配
    {
    case 1: cout << "星期一" << endl; break; // 匹配1
    case 2: cout << "星期二" << endl; break; // 匹配2
    case 3: cout << "星期三" << endl; break; // 匹配3
    case 4: cout << "星期四" << endl; break; // 匹配4
    case 5: cout << "星期五" << endl; break; // 匹配5
    case 6: cout << "星期六" << endl; break; // 匹配6
    case 7: cout << "星期日" << endl; break; // 匹配7
    default: cout << "输入无效" << endl; break; // 兜底
    }

    return 0; // 程序结束
} // main结束

/*
练习题答案（注释版）
1) 星期映射可直接复用上面switch结构。
2) 运算器示例（注释版）：

// int a, b; // 两个整数
// char op; // 运算符
// cin >> a >> op >> b; // 输入格式如 6 + 2
// switch (op) // 根据运算符分支
// {
// case '+': cout << a + b << endl; break; // 加
// case '-': cout << a - b << endl; break; // 减
// case '*': cout << a * b << endl; break; // 乘
// case '/': if (b != 0) cout << a / b << endl; else cout << "除数不能为0" << endl; break; // 除
// default: cout << "未知运算符" << endl; break; // 兜底
// } // 结束
*/
// 由bhw设计
