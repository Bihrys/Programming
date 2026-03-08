// 由bhw设计
/*
第一部分 第二�?第十九节 Java 方法

丢�、方法四要素
1) 访问修饰�?2) 返回类型
3) 方法�?4) 参数列表

二��参数传�?1) Java 只有值传递��?2) 对象参数传��的是��引用的副本”��?
三��练习题
1) �?max(a,b) 返回较大值��?2) �?sumToN(n) 返回 1 �?n 的和�?*/
class MethodDemo { // 方法演示�?    static int max(int a, int b) { // 返回较大�?        return (a > b) ? a : b; // 三目表达�?    } // 方法结束

    static int sumToN(int n) { // �?到n�?        int s = 0; // 累加�?        for (int i = 1; i <= n; i++) s += i; // 循环累加
        return s; // 返回结果
    } // 方法结束

    public static void main(String[] args) { // 主方�?        System.out.println("max=" + max(7, 9)); // 调用max
        System.out.println("sumToN=" + sumToN(10)); // 调用sumToN
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// static int min(int a, int b) { // 朢�小��函�?//     return (a < b) ? a : b; // 返回更小�?// } // 方法结束
*/
// 由bhw设计
