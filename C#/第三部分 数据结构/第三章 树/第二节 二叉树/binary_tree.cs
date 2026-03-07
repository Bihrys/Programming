// 由bhw设计
/*
第三部分 第三章 第二节 二叉树

一、原理
1) 每个节点最多两个孩子：Left / Right。
2) 三种深度遍历：前序、中序、后序。
3) 递归写法最直观。

二、习题
1) 写中序遍历函数。
2) 统计叶子节点数量。

三、答案与讲解
1) 中序：Left -> Root -> Right。
2) 左右都为空即叶子。
*/
using System; // 输出

class Node // 二叉树节点
{
    public int Value; // 节点值
    public Node? Left; // 左孩子
    public Node? Right; // 右孩子
}

class Program
{
    static void Preorder(Node? root) // 前序遍历函数
    {
        if (root == null) return; // 空节点返回
        Console.Write(root.Value + " "); // 访问根节点
        Preorder(root.Left); // 递归左子树
        Preorder(root.Right); // 递归右子树
    }

    static void Main()
    {
        Node a = new Node { Value = 1 }; // 创建根节点
        Node b = new Node { Value = 2 }; // 创建左节点
        Node c = new Node { Value = 3 }; // 创建右节点
        a.Left = b; // 连接左子树
        a.Right = c; // 连接右子树
        Preorder(a); // 执行前序遍历
        Console.WriteLine(); // 换行
    }
}
// 由bhw设计
