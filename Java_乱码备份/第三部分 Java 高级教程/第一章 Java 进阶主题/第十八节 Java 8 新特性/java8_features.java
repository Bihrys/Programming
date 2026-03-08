// 由bhw设计
/*
第三部分 第一�?第十八节 Java 8 新特�?
丢�、核心新特��?1) Lambda 表达�?2) Stream 流式处理
3) Optional
4) 新日期时�?API（java.time�?
二��练习题
1) �?Stream 过滤偶数并求和��?2) �?Lambda 对列表排序��?*/
import java.util.Arrays; // 数组工具
import java.util.List; // 列表接口

class Java8FeaturesDemo { // Java8特��演示类
    public static void main(String[] args) { // 主方�?        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6); // 示例数据
        int sum = nums.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum(); // Stream过滤求和
        System.out.println("偶数�?" + sum); // 输出结果
        nums.stream().sorted((a, b) -> b - a).forEach(x -> System.out.print(x + " ")); // Lambda降序输出
        System.out.println(); // 换行
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// List<String> names = Arrays.asList("Tom","Amy","Bob"); // 名单
// names.stream().sorted().forEach(System.out::println); // 升序输出
*/
// 由bhw设计
