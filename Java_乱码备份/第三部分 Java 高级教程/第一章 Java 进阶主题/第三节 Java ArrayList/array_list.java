// 由bhw设计
/*
第三部分 第一�?第三�?Java ArrayList

丢�、特�?1) 底层动��数组��?2) 随机访问快，插入删除中间元素相对慃6�9��?3) 允许重复元素�?
二��练习题
1) �?ArrayList 添加 5 个整数并遍历输出�?2) 删除下标 2 的元素并再次输出�?*/
import java.util.ArrayList; // 动��数组类
import java.util.List; // List接口

class ArrayListDemo { // ArrayList演示�?    public static void main(String[] args) { // 主方�?        List<Integer> list = new ArrayList<>(); // 创建列表
        for (int i = 1; i <= 5; i++) list.add(i); // 添加1�?
        System.out.println(list); // 输出原列�?        list.remove(2); // 删除下标2元素（第三个�?        System.out.println(list); // 输出删除后列�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// for (Integer x : list) { System.out.print(x + " "); } // 遍历输出
*/
// 由bhw设计
