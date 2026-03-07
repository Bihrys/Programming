// 由bhw设计
/*
第2章 第3节 常量和变量
核心点:
1) 变量值可变, 常量值固定。
2) const修饰后不允许修改该对象。
3) 命名应体现意义, 便于维护。

习题:
1) 用const定义PI并计算半径为3的圆面积。
2) 尝试修改const变量并观察编译报错。

答案与讲解:
1) area = PI * r * r。
2) const对象修改会触发编译器错误。
*/
#include <stdio.h> // 使用printf打印结果

int main(void) { // 主函数开始
    const double PI = 3.1415926; // 定义常量PI
    double radius = 3.0; // 定义可变变量radius
    double area = PI * radius * radius; // 计算圆面积
    printf("area = %.2f\n", area); // 保留两位小数输出
    return 0; // 正常结束
} // 主函数结束
// 由bhw设计
