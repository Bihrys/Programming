// 由bhw设计
/*
第三部分 第一�?第七�?Java Iterator

丢�、Iterator 作用
1) 统一遍历集合�?2) 支持安全删除当前迭代元素（iterator.remove）��?
二��练习题
1) 遍历列表并删除偶数��?2) 比较 for-each �?Iterator 的删除差异��?*/
import java.util.ArrayList; // ArrayList�?import java.util.Iterator; // 迭代器接�?import java.util.List; // List接口

class IteratorDemo { // Iterator演示�?    public static void main(String[] args) { // 主方�?        List<Integer> list = new ArrayList<>(); // 创建列表
        for (int i = 1; i <= 6; i++) list.add(i); // 添加元素
        Iterator<Integer> it = list.iterator(); // 获取迭代�?        while (it.hasNext()) { // 还有元素就继�?            int v = it.next(); // 取当前元�?            if (v % 2 == 0) it.remove(); // 删除偶数
        } // 遍历结束
        System.out.println(list); // 输出剩余元素
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// 直接�?for-each �?remove 可能触发并发修改异常；Iterator.remove 更安全��?*/
// 由bhw设计
