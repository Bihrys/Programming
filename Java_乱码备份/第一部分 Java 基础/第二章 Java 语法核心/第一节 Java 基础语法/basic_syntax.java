// 由bhw设计
/*
第一部分 第二�?第一�?Java 基础语法

丢�、最重要�?5 条语法规�?1) Java 大小写敏感，Hello �?hello 不同�?2) 类名建议大驼峰，方法名和变量名建议小驼峰�?3) 每条语句通常以分号结尾��?4) 花括号用于代码块范围�?5) 程序入口�?main 方法�?
二��编译与运行
1) javac basic_syntax.java
2) java BasicSyntaxDemo

三��练习题
1) 把输出语句改成三行不同文本��?2) 故意�?main 写错，观察错误信息��?*/
class BasicSyntaxDemo { // 基础语法演示�?    public static void main(String[] args) { // Java 主入�?        System.out.println("Hello Java"); // 输出第一�?        System.out.println("main 是程序入�?); // 输出第二�?        System.out.println("Java 区分大小�?); // 输出第三�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) 三行输出可直接增�?println�?2) 若写�?Main �?main(String args) 都会导致入口签名不匹配��?
// class BasicSyntaxAnswer { // 答案�?//     public static void main(String[] args) { // 标准入口
//         System.out.println("第一�?); // 输出1
//         System.out.println("第二�?); // 输出2
//         System.out.println("第三�?); // 输出3
//     } // 结束
// } // 类结�?*/
// 由bhw设计
