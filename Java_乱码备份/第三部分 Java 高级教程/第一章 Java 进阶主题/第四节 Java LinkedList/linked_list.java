// 由bhw设计
/*
第三部分 第一�?第四�?Java LinkedList

丢�、特�?1) 双向链表实现�?2) 头尾插入删除效率高��?3) 随机访问效率不如 ArrayList�?
二��练习题
1) 使用 addFirst/addLast 维护队列�?2) 输出首元素和尾元素��?*/
import java.util.LinkedList; // 链表�?
class LinkedListDemo { // LinkedList演示�?    public static void main(String[] args) { // 主方�?        LinkedList<String> q = new LinkedList<>(); // 创建链表
        q.addFirst("A"); // 头插
        q.addLast("B"); // 尾插
        q.addLast("C"); // 尾插
        System.out.println(q); // 输出链表
        System.out.println("first=" + q.getFirst() + ", last=" + q.getLast()); // 输出首尾
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// q.removeFirst(); // 模拟出队
// q.removeLast(); // 删除尾元�?*/
// 由bhw设计
