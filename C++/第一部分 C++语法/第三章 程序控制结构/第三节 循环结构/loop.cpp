// 由bhw设计
/*
第三章 第三节 循环结构

一、三种基础循环
1) for：循环次数明确。
2) while：先判断条件再执行。
3) do-while：先执行一次再判断，至少执行一次。

二、循环控制
1) break：立刻退出当前循环。
2) continue：跳过本轮剩余语句，进入下一轮。
3) 死循环通常来自条件永远为真且缺少更新。

三、练习题
1) 用for计算1到100的和。
2) 用while输出1到n所有3的倍数。
*/
#include <iostream> // 输入输出
using namespace std; // 标准命名空间

int main() // 主函数
{
    int sum = 0; // 保存累加和
    for (int i = 1; i <= 100; i++) // i从1到100
    {
        sum += i; // 累加当前i
    }
    cout << "1到100的和 = " << sum << endl; // 输出结果

    int n = 0; // 上限n
    cout << "请输入n: "; // 提示输入
    cin >> n; // 读取n
    int k = 1; // while循环计数器
    while (k <= n) // 条件成立继续循环
    {
        if (k % 3 == 0) // 判断3的倍数
        {
            cout << k << " "; // 输出当前值
        }
        k++; // 计数器更新，避免死循环
    }
    cout << endl; // 换行

    return 0; // 程序结束
} // main结束

/*
练习题答案（注释版）
1) 求和核心：sum += i。
2) 倍数判断核心：x % 3 == 0。

// int s = 0; // 累加器
// for (int i = 1; i <= 100; i++) s += i; // for求和
// cout << s << endl; // 输出
*/
// 由bhw设计
