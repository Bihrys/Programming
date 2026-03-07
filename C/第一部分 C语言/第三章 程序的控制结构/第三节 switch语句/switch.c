// 由bhw设计
/*
第3章 第3节 switch语句
适合离散值分支判断, 如菜单、星期编号。
注意:
1) case后接常量表达式。
2) 记得break防止贯穿。
3) default处理非法输入。

习题:
1) 输入1~7输出星期。
2) 输入运算符实现简单计算器。

答案与讲解:
1) 每个case对应一天。
2) switch(op)按'+','-','*','/'分支处理。
*/
#include <stdio.h> // 输入输出头文件

int main(void) { // 主函数开始
    int day = 0; // 保存用户输入的星期编号
    if (scanf("%d", &day) != 1) { // 读取输入
        printf("输入错误\n"); // 输入错误提示
        return 1; // 非正常返回
    } // 输入成功
    switch (day) { // 根据day选择分支
        case 1: printf("Mon\n"); break; // case 1输出周一
        case 2: printf("Tue\n"); break; // case 2输出周二
        case 3: printf("Wed\n"); break; // case 3输出周三
        case 4: printf("Thu\n"); break; // case 4输出周四
        case 5: printf("Fri\n"); break; // case 5输出周五
        case 6: printf("Sat\n"); break; // case 6输出周六
        case 7: printf("Sun\n"); break; // case 7输出周日
        default: printf("Invalid\n"); break; // 默认分支处理非法输入
    } // switch结束
    return 0; // 正常结束
} // main结束
// 由bhw设计
