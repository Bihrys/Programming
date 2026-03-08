// 由bhw设计
/*
第三部分 第一章 第一节 数据结构、集合框架、ArrayList、LinkedList、HashSet、HashMap、Iterator、Object、泛型

一、数据结构与集合框架
1) List：有序可重复（ArrayList、LinkedList）。
2) Set：不重复（HashSet）。
3) Map：键值对（HashMap）。

二、ArrayList 与 LinkedList
1) ArrayList：随机访问快。
2) LinkedList：头尾增删快。

三、HashSet 与 HashMap
1) HashSet：快速去重。
2) HashMap：高效键值查找。

四、Iterator、Object、泛型
1) Iterator 可在遍历时安全删除元素。
2) Object 是所有类根类，常重写 toString/equals/hashCode。
3) 泛型让容器类型安全，减少强转错误。

五、练习题
1) 用 HashMap 存 3 个学生成绩并遍历。
2) 用 Iterator 删除列表中的偶数。
3) 写一个 Box<T> 泛型类并存取字符串。
*/
import java.util.ArrayList; // ArrayList类
import java.util.HashMap; // HashMap类
import java.util.HashSet; // HashSet类
import java.util.Iterator; // Iterator接口
import java.util.LinkedList; // LinkedList类
import java.util.List; // List接口
import java.util.Map; // Map接口
import java.util.Set; // Set接口

class Box<T> { // 泛型类
    private T value; // 泛型字段
    void set(T value) { this.value = value; } // 设置值
    T get() { return value; } // 读取值
}

class StudentObj { // Object重写示例类
    String name; // 字段
    StudentObj(String name) { this.name = name; } // 构造
    @Override
    public String toString() { return "StudentObj{name='" + name + "'}"; } // 重写toString
}

class CollectionsAndGenericsDemo { // 综合演示类
    public static void main(String[] args) { // 主方法
        List<Integer> arr = new ArrayList<>(); // ArrayList示例
        arr.add(1); arr.add(2); arr.add(3); // 添加元素
        LinkedList<String> link = new LinkedList<>(); // LinkedList示例
        link.add("A"); link.add("B"); // 添加元素

        Set<String> set = new HashSet<>(); // HashSet示例
        set.add("Java"); set.add("Java"); // 重复添加
        System.out.println("HashSet去重后=" + set); // 输出去重结果

        Map<String, Integer> score = new HashMap<>(); // HashMap示例
        score.put("A", 90); score.put("B", 85); score.put("C", 95); // 添加键值
        for (Map.Entry<String, Integer> e : score.entrySet()) { // 遍历Map
            System.out.println(e.getKey() + ":" + e.getValue()); // 输出键值
        } // 遍历结束

        Iterator<Integer> it = arr.iterator(); // 获取迭代器
        while (it.hasNext()) { // 迭代遍历
            int v = it.next(); // 取元素
            if (v % 2 == 0) it.remove(); // 删除偶数
        } // 循环结束
        System.out.println("删除偶数后=" + arr); // 输出结果

        Box<String> box = new Box<>(); // 泛型类实例
        box.set("泛型安全"); // 赋值
        System.out.println(box.get()); // 取值

        System.out.println(new StudentObj("bhw")); // 输出对象字符串
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// Map<String,Integer> m = new HashMap<>(); // 定义映射
// m.put("Tom", 80); m.put("Amy", 92); m.put("Bob", 88); // 添加数据
// for (Map.Entry<String,Integer> e : m.entrySet()) { // 遍历
//     System.out.println(e.getKey() + ":" + e.getValue()); // 输出
// } // 结束
*/
// 由bhw设计
