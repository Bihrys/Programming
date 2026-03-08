// 由bhw设计
/*
第一部分 第一�?第一�?Java 箢��?
丢�、Java 是什�?1) Java 是一门面向对象��跨平台、强类型语言�?2) Java 源码会先编译成字节码�?class），再由 JVM 执行�?3) 丢�次编写，到处运行，核心靠 JVM 屏蔽平台差异�?
二��Java 的典型应�?1) 后端服务弢�发（Spring 生��）�?2) 安卓应用（历史主力语訢�之一）��?3) 企业级系统（稳定性和生��成熟）�?
三��练习题
1) 解释“跨平台”的抢�术基硢��?2) 说出 Java �?C 的一个核心差异��?*/
public class IntroDemo { // 定义公开类，类名必须和文件名丢�致（教学文件可单独编译类名）
    public static void main(String[] args) { // 主方法，程序入口
        System.out.println("你好，Java�?); // 输出欢迎�?        System.out.println("核心：源�?-> 字节�?-> JVM执行�?); // 输出执行模型
    } // main 结束
} // 类结�?
/*
练习题答案（注释版）
1) 跨平台基硢�：同丢�份字节码可在不同平台 JVM 上运行��?2) 差异示例：Java 有垃圾回收；C 霢�要手动管理更多内存细节��?
// public class IntroAnswer { // 定义答案�?//     public static void main(String[] args) { // 入口
//         System.out.println("跨平台依�?JVM�?); // 答案输出1
//         System.out.println("Java 自动垃圾回收�?); // 答案输出2
//     } // 结束
// } // 类结�?*/
// 由bhw设计
