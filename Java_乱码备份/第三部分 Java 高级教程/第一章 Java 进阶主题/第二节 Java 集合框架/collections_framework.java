// 由bhw设计
/*
第三部分 第一�?第二�?Java 集合框架

丢�、三大接口族
1) List：可重复、有序��?2) Set：不重复�?3) Map：键值对�?
二����型口诀
1) 要随机访问：ArrayList�?2) 要频繁头尾插入：LinkedList�?3) 要快速查找键：HashMap�?
三��练习题
1) 列出 List/Set/Map 各一个实现类�?2) 说明 HashMap �?TreeMap 的区别��?*/
import java.util.*; // 引入集合�?
class CollectionsFrameworkDemo { // 集合框架演示�?    public static void main(String[] args) { // 主方�?        List<Integer> list = new ArrayList<>(); // List实现
        Set<String> set = new HashSet<>(); // Set实现
        Map<String, Integer> map = new HashMap<>(); // Map实现
        list.add(1); // 添加元素
        set.add("Java"); // 添加元素
        map.put("score", 100); // 添加键��对
        System.out.println(list + " | " + set + " | " + map); // 输出结构内容
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) List: ArrayList；Set: HashSet；Map: HashMap�?2) HashMap 无序、平�?O(1)；TreeMap 有序、O(log n)�?*/
// 由bhw设计
