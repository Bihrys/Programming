// 由bhw设计
/*
第三部分 第一�?第十六节 Java 文档注释

丢�、Javadoc 作用
1) 从源码注释自动生�?API 文档�?2) 让团队成员快速理解类和方法用途��?
二��常用标�?1) @param 参数说明
2) @return 返回值说�?3) @throws 异常说明

三��练习题
1) �?add 方法补完整文档注释��?2) 运行 javadoc 生成文档目录�?*/
class JavaDocDemo { // 文档注释演示�?    /**
     * 计算两个整数和��?     * @param a 加数a
     * @param b 加数b
     * @return a+b
     */
    static int add(int a, int b) { // 方法定义
        return a + b; // 返回求和结果
    } // 方法结束

    public static void main(String[] args) { // 主方�?        System.out.println(add(2, 3)); // 调用方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// javadoc -d docs javadoc.java // 生成文档命令示例
*/
// 由bhw设计
