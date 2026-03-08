// 由bhw设计
/*
第一部分 第二�?第十二节 Java Number �?Math �?
丢�、Number 包装�?1) Integer、Double、Long 等用于基本类型对象化�?2) 常见场景：集合中存数值��工具方法转捃6�9��?
二��Math 常用方法
1) Math.abs(x)：绝对��?2) Math.max(a,b)：最大��?3) Math.pow(a,b)：幂
4) Math.sqrt(x)：平方根
5) Math.random()�?~1随机�?
三��练习题
1) 生成 1~100 的随机整数��?2) 计算 2 �?10 次方和根�?81�?*/
class NumberMathDemo { // Number和Math演示
    public static void main(String[] args) { // 主方�?        Integer x = 42; // 装箱示例
        Double y = 3.5; // 装箱示例
        System.out.println("x+y=" + (x + y)); // 自动拆箱参与运算
        System.out.println("abs(-7)=" + Math.abs(-7)); // 绝对�?        System.out.println("max(8,13)=" + Math.max(8, 13)); // 朢�大��?        System.out.println("pow(2,10)=" + Math.pow(2, 10)); // �?        System.out.println("sqrt(81)=" + Math.sqrt(81)); // 平方�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int r = (int) (Math.random() * 100) + 1; // 1�?00随机整数
// System.out.println(r); // 输出随机�?*/
// 由bhw设计
