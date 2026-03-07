// 由bhw设计
/*
第3章 第2节 if选择结构
结构:
if (...) { ... }
else if (...) { ... }
else { ... }

习题:
1) 输入分数输出A/B/C/D。
2) 输入整数判断奇偶与正负。

答案与讲解:
1) 区间判断从高到低写, 防止条件重叠。
2) 先判正负, 再判奇偶。
*/
#include <stdio.h> // 输入输出

int main(void) { // 主函数
    int score = 0; // 定义分数变量
    if (scanf("%d", &score) != 1) { // 读取分数
        printf("输入错误\n"); // 错误提示
        return 1; // 异常退出
    } // 输入成功
    if (score >= 90) { // 第一分支: A
        printf("A\n"); // 输出A
    } else if (score >= 60) { // 第二分支: 及格
        printf("Pass\n"); // 输出Pass
    } else { // 其余分支: 不及格
        printf("Fail\n"); // 输出Fail
    } // 分支结束
    return 0; // 正常结束
} // main结束
// 由bhw设计
