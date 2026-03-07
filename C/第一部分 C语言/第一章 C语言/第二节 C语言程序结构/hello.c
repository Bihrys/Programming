// 由bhw设计
/*
第1章 第2节 C语言程序结构
程序结构:
1) 预处理指令: #include
2) 主函数: int main(void)
3) 语句与分号: 每条语句通常以;结束

习题:
1) 把输出改成两行。
2) 再加一行输出你的名字。

答案与讲解:
1) 连续写两个printf即可。
2) 例如: printf("I am bhw.\n");
*/
#include <stdio.h> // 提供printf函数声明

int main(void) { // C程序默认入口
    printf("Hello, world!\n"); // 第一行输出
    printf("This is my first C program.\n"); // 第二行输出
    return 0; // 正常退出
} // 主函数结束
// 由bhw设计
