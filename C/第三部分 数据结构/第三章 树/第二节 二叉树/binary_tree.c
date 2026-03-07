// 由bhw设计
/*
第三部分 第三章 第二节 二叉树
核心: 每个节点最多两个孩子(left/right)。
遍历: 前序/中序/后序/层序。

习题:
1) 写中序遍历函数。
2) 统计二叉树叶子节点数。

答案与讲解:
1) 递归顺序: left-root-right。
2) 左右都空时计数+1。
*/
#include <stdio.h> 

struct Node { int val; struct Node *left, *right; }; // 二叉树节点

void preorder(struct Node *root) { // 前序遍历函数
    if (root == NULL) return; // 空节点返回
    printf("%d ", root->val); // 访问根
    preorder(root->left); // 访问左子树
    preorder(root->right); // 访问右子树
} 

int main(void) { 
    struct Node a = {1, NULL, NULL}, b = {2, NULL, NULL}, c = {3, NULL, NULL}; // 三个节点
    a.left = &b; a.right = &c; // 连接成一棵二叉树
    preorder(&a); // 前序遍历输出
    printf("\n"); 
    return 0; 
} 
// 由bhw设计
