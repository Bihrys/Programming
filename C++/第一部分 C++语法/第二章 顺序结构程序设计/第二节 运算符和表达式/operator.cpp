// 由bhw设计
/*
第二章 第二节 运算符和表达式

一、常见运算符
1) 算术运算：+ - * / %
2) 关系运算：> < >= <= == !=
3) 逻辑运算：&& || !
4) 赋值运算：= += -= *= /= %=

二、运算顺序
1) 括号优先级最高。
2) 乘除模高于加减。
3) 关系运算后是逻辑运算。
4) 不确定时加括号，代码可读性更高。

三、练习题
1) 计算长方形面积和周长（已知长宽）。
2) 判断一个数是否在[10, 100]区间内。
*/
#include <iostream> // 输入输出
using namespace std; // 标准命名空间

int main() // 主函数
{
    int a = 17; // 定义a
    int b = 5; // 定义b

    cout << "a + b = " << a + b << endl; // 加法
    cout << "a - b = " << a - b << endl; // 减法
    cout << "a * b = " << a * b << endl; // 乘法
    cout << "a / b = " << a / b << endl; // 整数除法，结果取整
    cout << "a % b = " << a % b << endl; // 取余

    bool bigger = (a > b); // 关系表达式结果是布尔值
    bool inRange = (a >= 10 && a <= 100); // 逻辑与判断区间
    cout << "a > b ? " << bigger << endl; // 输出1表示true
    cout << "a在[10,100]内? " << inRange << endl; // 输出区间判断

    a += 3; // 等价于a = a + 3
    cout << "a += 3 后 a = " << a << endl; // 输出更新后的a

    return 0; // 结束
} // main结束

/*
练习题答案（注释版）
1) 长方形面积和周长：
// int length = 8; // 长
// int width = 3; // 宽
// int area = length * width; // 面积
// int perimeter = 2 * (length + width); // 周长
// cout << "面积=" << area << ", 周长=" << perimeter << endl; // 输出

2) 区间判断：
// int x = 55; // 测试值
// bool ok = (x >= 10 && x <= 100); // 是否在区间内
// cout << ok << endl; // 输出布尔值
*/
// 由bhw设计
