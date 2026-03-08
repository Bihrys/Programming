// 由bhw设计
/*
第一部分 第一章 第一节 Java 简介、环境配置与AI助手

一、Java 简介
1) Java 是面向对象、跨平台、强类型语言。
2) Java 程序先编译为字节码（.class），再由 JVM 执行。
3) “一次编写，到处运行”的核心是 JVM 屏蔽平台差异。

二、开发环境配置（Windows）
1) 安装 JDK（建议 17 或 21）。
2) 配置 JAVA_HOME 到 JDK 安装目录。
3) 把 %JAVA_HOME%\\bin 加入 Path。
4) 终端验证：
   java -version
   javac -version
5) 若编译中文报编码问题：
   javac -encoding UTF-8 文件名.java

三、Java AI 编程助手（正确用法）
1) 先自己写，再让 AI 指出问题。
2) 让 AI 解释“为什么”，不只要“能跑”。
3) 要求 AI 给边界条件和反例测试。
4) 最终以编译通过 + 运行结果正确为准。

四、练习题
1) 说出 Java 跨平台的技术基础。
2) 写出验证 JDK 是否安装成功的两个命令。
3) 写出你准备如何使用 AI 辅助学习 Java。
*/
class IntroEnvAIDemo { // 入门演示类
    public static void main(String[] args) { // 程序入口
        System.out.println("欢迎学习 Java。"); // 输出欢迎语
        System.out.println("执行模型：源码 -> 字节码 -> JVM。"); // 输出执行模型
        System.out.println("终端验证：java -version 与 javac -version。"); // 输出环境验证提示
    } // main 结束
} // 类结束

/*
练习题答案（注释版）
1) Java 跨平台基础：同一字节码在不同 JVM 上运行。
2) 命令：java -version、javac -version。
3) 示例回答：
   - 先独立写代码
   - 让 AI 做代码审查
   - 用 AI 补充边界测试

// class IntroEnvAIAnswer { // 答案演示类
//     public static void main(String[] args) { // 主方法
//         System.out.println("跨平台依赖 JVM。"); // 答案1
//         System.out.println("验证命令：java -version / javac -version"); // 答案2
//         System.out.println("AI 辅助方式：先写后问、追问原理、自己验证。"); // 答案3
//     } // main结束
// } // 类结束
*/
// 由bhw设计
