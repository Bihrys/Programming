// 由bhw设计
/*
第一部分 第五章 第一节 Number、Math、Character、String、StringBuffer

一、Number 与 Math
1) Number 包装类：Integer、Double 等。
2) Math 常用：abs、max、pow、sqrt、random。

二、Character
1) 判断字符类型：isDigit、isLetter。
2) 转换大小写：toUpperCase、toLowerCase。

三、String
1) 不可变字符串，常用方法：length、substring、indexOf、equals。
2) 比较内容用 equals，不要用 ==。

四、StringBuffer
1) 可变字符串，适合频繁拼接。
2) 常用方法：append、insert、reverse、toString。

五、练习题
1) 生成 1~100 的随机整数。
2) 判断字符是否为数字。
3) 把 "abc123" 反转输出。
*/
class CoreClassesDemo { // 核心类演示
    public static void main(String[] args) { // 主方法
        Integer a = 12; // Number包装类
        Double b = 3.5; // Number包装类
        System.out.println("a+b=" + (a + b)); // 自动拆箱计算
        System.out.println("pow(2,10)=" + Math.pow(2, 10)); // Math幂运算

        char c = '8'; // 字符示例
        System.out.println("isDigit=" + Character.isDigit(c)); // 判断是否数字

        String s = "Hello Java"; // 字符串示例
        System.out.println("length=" + s.length()); // 字符串长度
        System.out.println("substring=" + s.substring(0, 5)); // 子串
        System.out.println("equals=" + "Java".equals("java")); // 内容比较

        StringBuffer sb = new StringBuffer("abc123"); // 可变字符串
        System.out.println("reverse=" + sb.reverse()); // 反转字符串
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// int r = (int) (Math.random() * 100) + 1; // 1到100随机数
// System.out.println(r); // 输出随机数
*/
// 由bhw设计
