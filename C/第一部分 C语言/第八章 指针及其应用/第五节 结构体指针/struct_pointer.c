// 由bhw设计
/*
第8章 第5节 结构体指针
核心点:
1) 结构体指针访问成员用 ->。
2) (*p).field 与 p->field 等价。
3) 常用于链表和动态结构。

习题:
1) 用结构体指针修改学生年龄。
2) 写函数接收结构体指针并打印信息。

答案与讲解:
1) p->age = 新值;
2) void print(const struct Student *p) {...}
*/
#include <stdio.h> // 输出函数

struct Student { // 定义结构体类型
    char name[32]; // 姓名字段
    int age; // 年龄字段
}; // 结构体定义结束

int main(void) { // 主函数开始
    struct Student s = {"bhw", 18}; // 定义结构体变量
    struct Student *p = &s; // 定义结构体指针并指向s
    p->age = 19; // 通过指针修改结构体成员
    printf("%s %d\n", p->name, p->age); // 通过指针读取并输出成员
    return 0; // 正常结束
} // main结束
// 由bhw设计
