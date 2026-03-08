// 由bhw设计
/*
第三章 第一节 if选择结构

一、if结构作用
1) 根据条件真假决定是否执行某段代码。
2) 常见形式：if、if-else、if-else if-else。

二、逻辑思维要点
1) 先写“条件是什么”，再写“满足后做什么”。
2) 多分支判断按“互斥且完整”组织。
3) 注意边界值，比如>=还是>。

三、练习题
1) 输入一个整数，判断奇偶。
2) 输入分数，按90/80/60分段输出等级A/B/C/D。
*/
#include <iostream> // 输入输出
using namespace std; // 标准命名空间

int main() // 主函数
{
    int num = 0; // 存储要判断的整数
    cout << "请输入一个整数: "; // 提示输入
    cin >> num; // 读取整数

    if (num % 2 == 0) // 判断是否能被2整除
    {
        cout << num << " 是偶数" << endl; // 条件成立时输出
    }
    else // 否则执行这里
    {
        cout << num << " 是奇数" << endl; // 条件不成立时输出
    }

    int score = 0; // 分数变量
    cout << "请输入分数: "; // 提示输入分数
    cin >> score; // 读入分数

    if (score >= 90) // 第一档
    {
        cout << "等级A" << endl; // 输出A
    }
    else if (score >= 80) // 第二档
    {
        cout << "等级B" << endl; // 输出B
    }
    else if (score >= 60) // 第三档
    {
        cout << "等级C" << endl; // 输出C
    }
    else // 最后一档
    {
        cout << "等级D" << endl; // 输出D
    }

    return 0; // 结束
} // main结束

/*
练习题答案（注释版）
1) 奇偶判断同上核心：num % 2 == 0。
2) 分级同上核心：从高分段到低分段依次判断，防止覆盖。

// int x; // 定义变量
// cin >> x; // 输入
// if (x % 2 == 0) cout << "偶数" << endl; // 偶数
// else cout << "奇数" << endl; // 奇数
*/
// 由bhw设计
