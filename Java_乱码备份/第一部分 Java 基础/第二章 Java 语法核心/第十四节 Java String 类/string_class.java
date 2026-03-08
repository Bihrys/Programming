// 由bhw设计
/*
第一部分 第二�?第十四节 Java String �?
丢�、String 核心
1) String 是不可变对象�?2) 字符串拼接可�?+，高频拼接建�?StringBuilder�?3) 比较内容必须�?equals，不要用 ==�?
二��常用方�?1) length()
2) charAt(i)
3) substring(begin, end)
4) indexOf(str)
5) equals(str)

三��练习题
1) 统计字符串长度并取第丢�个字符��?2) 判断 "Java" �?"java" 是否相等（区分大小写）��?*/
class StringClassDemo { // String演示�?    public static void main(String[] args) { // 主方�?        String s = "Hello Java"; // 定义字符�?        System.out.println("length=" + s.length()); // 输出长度
        System.out.println("charAt(0)=" + s.charAt(0)); // 取首字符
        System.out.println("substring(0,5)=" + s.substring(0, 5)); // 截取子串
        System.out.println("\"Java\".equals(\"java\")=" + "Java".equals("java")); // equals比较
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// String a = "Java"; // 字符串a
// String b = "java"; // 字符串b
// System.out.println(a.equals(b)); // false
// System.out.println(a.equalsIgnoreCase(b)); // true
*/
// 由bhw设计
