// 由bhw设计
/*
第一部分 第二�?第二十二�?Java Scanner �?
丢�、Scanner 作用
1) 从标准输入读取用户输入��?2) 支持 nextInt / nextDouble / nextLine 等多种读取方式��?
二��常见坑
1) nextInt 后接 nextLine 会吃掉换行��?2) 输入类型不匹配会�?InputMismatchException�?
三��练习题
1) 输入姓名和年龄并输出�?2) 输入两个整数输出和��?*/
import java.util.Scanner; // 输入扫描�?
class ScannerClassDemo { // Scanner演示�?    public static void main(String[] args) { // 主方�?        Scanner sc = new Scanner(System.in); // 创建扫描�?        System.out.print("请输入姓�? "); // 提示输入姓名
        String name = sc.nextLine(); // 读取整行姓名
        System.out.print("请输入年�? "); // 提示输入年龄
        int age = sc.nextInt(); // 读取整数年龄
        System.out.println("你好�? + name + "，年�?" + age); // 输出结果
        sc.close(); // 关闭扫描�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// Scanner sc = new Scanner(System.in); // 创建输入对象
// int a = sc.nextInt(); // 读第丢�个整�?// int b = sc.nextInt(); // 读第二个整数
// System.out.println(a + b); // 输出�?// sc.close(); // 关闭
*/
// 由bhw设计
