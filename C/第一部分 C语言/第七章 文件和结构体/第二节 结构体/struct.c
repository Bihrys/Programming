// 由bhw设计
/*
第7章 第2节 结构体
核心点:
1) struct把多个字段组合成一个类型。
2) 适合描述“一个对象”的多属性信息。
3) 可配合数组管理多条记录。

习题:
1) 定义Student并保存3名学生信息。
2) 按score降序输出学生信息。

答案与讲解:
1) struct Student { ... };
2) 可用冒泡排序按score比较交换。
*/
#include <stdio.h> // 使用printf输出

struct Student { // 定义学生结构体类型
    char name[32]; // 学生姓名
    int age; // 学生年龄
    double score; // 学生成绩
}; // 结构体定义结束

int main(void) { // 主函数开始
    struct Student s = {"bhw", 18, 98.5}; // 定义并初始化一个学生
    printf("%s %d %.1f\n", s.name, s.age, s.score); // 输出结构体字段
    return 0; // 正常结束
} // main结束
// 由bhw设计
