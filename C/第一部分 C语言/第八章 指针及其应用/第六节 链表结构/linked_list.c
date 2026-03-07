// 由bhw设计
/*
第8章 第6节 链表结构
核心点:
1) 链表节点包含数据域和指针域。
2) 通过next把节点串起来。
3) 插入删除无需整体搬移元素。

习题:
1) 实现头插法创建链表。
2) 删除值为x的第一个节点。

答案与讲解:
1) 新节点next指向原头, 再更新头指针。
2) 遍历时记录前驱节点再断链。
*/
#include <stdio.h> // 输出函数

struct Node { // 定义链表节点结构体
    int val; // 节点值
    struct Node *next; // 指向下一个节点
}; // 结构体定义结束

int main(void) { // 主函数开始
    struct Node a = {1, NULL}; // 定义节点a
    struct Node b = {2, NULL}; // 定义节点b
    struct Node c = {3, NULL}; // 定义节点c
    a.next = &b; // 连接a到b
    b.next = &c; // 连接b到c
    for (struct Node *p = &a; p != NULL; p = p->next) { // 遍历链表
        printf("%d ", p->val); // 输出当前节点值
    } // 遍历结束
    printf("\n"); // 输出换行
    return 0; // 正常结束
} // main结束
// 由bhw设计
