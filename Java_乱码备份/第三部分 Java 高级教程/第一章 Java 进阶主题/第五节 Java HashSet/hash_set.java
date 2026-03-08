// 由bhw设计
/*
第三部分 第一�?第五�?Java HashSet

丢�、特�?1) 元素不重复��?2) 无序（不保证插入顺序）��?3) 基于哈希，查找快�?
二��练习题
1) �?HashSet 添加重复元素，观察结果��?2) 判断某元素是否存在��?*/
import java.util.HashSet; // HashSet�?import java.util.Set; // Set接口

class HashSetDemo { // HashSet演示�?    public static void main(String[] args) { // 主方�?        Set<String> set = new HashSet<>(); // 创建集合
        set.add("Java"); // 添加元素
        set.add("Java"); // 重复添加
        set.add("C#"); // 添加元素
        System.out.println(set); // 输出集合（无重复�?        System.out.println("contains Java? " + set.contains("Java")); // 查询包含
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// set.remove("C#"); // 删除元素
// System.out.println(set.size()); // 输出元素个数
*/
// 由bhw设计
