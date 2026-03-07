// 由bhw设计
/*
第4章 第3节 do-while语句
do-while语法:
do { 循环体 } while(条件);
特点: 先执行一次再判断条件。

习题:
1) 写菜单程序, 输入0退出。
2) 实现猜数字循环。

答案与讲解:
1) do里显示菜单并读入选择。
2) 每次输入后判断是否猜中。
*/
#include <stdio.h> // 使用printf输出

int main(void) { // 主函数开始
    int x = 3; // 初始化计数变量
    do { // do块保证至少执行一次
        printf("x=%d\n", x); // 输出当前x
        x--; // 每次循环把x减1
    } while (x > 0); // 条件成立则继续循环
    return 0; // 正常结束
} // main结束
// 由bhw设计
