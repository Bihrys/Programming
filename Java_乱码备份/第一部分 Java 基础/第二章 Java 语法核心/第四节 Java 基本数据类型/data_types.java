// 由bhw设计
/*
第一部分 第二�?第四�?Java 基本数据类型

丢��?种基本类�?1) 整数：byte、short、int、long
2) 浮点：float、double
3) 字符：char
4) 布尔：boolean

二��常见细�?1) long 字面量建议加 L，例�?10L�?2) float 字面量建议加 F，例�?3.14F�?3) char 使用单引号，例如 'A'�?
三��练习题
1) 定义全部 8 种类型并输出�?2) 比较 int �?long 的取值范围差异（查资料后写��结）��?*/
class DataTypeDemo { // 基本类型演示�?    public static void main(String[] args) { // 主方�?        byte b = 100; // 字节�?        short s = 30000; // 短整�?        int i = 100000; // 整型
        long l = 10000000000L; // 长整�?        float f = 3.14F; // 单精度浮�?        double d = 3.1415926; // 双精度浮�?        char c = 'J'; // 字符
        boolean ok = true; // 布尔

        System.out.println(b + "," + s + "," + i + "," + l); // 输出整数�?        System.out.println(f + "," + d + "," + c + "," + ok); // 输出其他类型
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int age = 18; // 整型
// long population = 1400000000L; // 长整�?// float price = 9.9F; // 单精�?// double pi = 3.1415926; // 双精�?// char grade = 'A'; // 字符
// boolean pass = true; // 布尔
*/
// 由bhw设计
