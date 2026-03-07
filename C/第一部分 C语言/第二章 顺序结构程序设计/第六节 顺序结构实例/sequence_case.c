// 由bhw设计
/*
第2章 第6节 顺序结构实例
题目: 输入长方形长和宽, 输出面积和周长。
思路:
1) 读取length和width。
2) 计算area与perimeter。
3) 格式化输出结果。

习题:
1) 改成输入圆半径输出面积和周长。
2) 增加输入合法性判断(必须大于0)。

答案与讲解:
1) 圆面积PI*r*r, 周长2*PI*r。
2) if (length<=0 || width<=0) 报错并退出。
*/
#include <stdio.h> // 使用scanf/printf

int main(void) { // 主函数开始
    double length = 0.0; // 定义长
    double width = 0.0; // 定义宽
    if (scanf("%lf%lf", &length, &width) != 2) { // 读取两个浮点数
        printf("输入失败\n"); // 输入失败提示
        return 1; // 异常返回
    } // 输入成功后继续
    double area = length * width; // 面积计算
    double perimeter = 2.0 * (length + width); // 周长计算
    printf("area=%.2f perimeter=%.2f\n", area, perimeter); // 输出结果
    return 0; // 正常结束
} // 主函数结束
// 由bhw设计
