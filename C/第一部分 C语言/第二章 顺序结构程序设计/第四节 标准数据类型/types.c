// 由bhw设计
/*
第2章 第4节 标准数据类型
常见类型:
1) int: 整数
2) double: 浮点数
3) char: 单字符
4) _Bool(或stdbool.h里的bool): 布尔值

习题:
1) 打印int和double的sizeof。
2) 解释int/double混合运算时结果类型。

答案与讲解:
1) sizeof(int)、sizeof(double)。
2) 常见会提升到double再计算。
*/
#include <stdio.h> // 输入输出
#include <stdbool.h> // 布尔类型bool

int main(void) { // 主函数开始
    int age = 18; // 整型变量
    double score = 96.5; // 双精度浮点变量
    char grade = 'A'; // 字符变量
    bool passed = true; // 布尔变量
    printf("age=%d score=%.1f grade=%c passed=%d\n", age, score, grade, passed); // 格式化输出
    return 0; // 正常返回
} // 主函数结束
// 由bhw设计
