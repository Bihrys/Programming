// 由bhw设计
/*
第一部分 第一�?第二�?Java 弢�发环境配�?
丢�、需要安装什�?1) JDK（建�?17 �?21，长期支持版本）�?2) 代码编辑器（VS Code / IntelliJ IDEA）��?3) 命令行工具（用于 javac �?java）��?
二��如何验证安装成�?1) 打开终端执行：java -version
2) 再执行：javac -version
3) 两个命令都返回版本号即环境可用��?
三��编译运行流�?1) javac 文件�?java
2) java 类名
3) 若中文乱码，可用 javac -encoding UTF-8 文件�?java

四��练习题
1) 在你的电脑上验证 java �?javac 版本�?2) 把本文件改名�?HelloEnv.java 并成功运行��?*/
class EnvironmentSetup { // 演示环境棢�查输�?    public static void main(String[] args) { // 主方�?        System.out.println("请在终端执行：java -version"); // 输出命令提示
        System.out.println("请在终端执行：javac -version"); // 输出命令提示
        System.out.println("若输出版本号，说明环境配置成功��?); // 输出结论
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) 版本示例：openjdk version "21.x.x"�?2) 改名后要同步改类名，避免“类名与文件名不丢�致����?
// class HelloEnv { // 改名后的�?//     public static void main(String[] args) { // 主方�?//         System.out.println("环境配置成功�?); // 输出
//     } // 结束
// } // 类结�?*/
// 由bhw设计
