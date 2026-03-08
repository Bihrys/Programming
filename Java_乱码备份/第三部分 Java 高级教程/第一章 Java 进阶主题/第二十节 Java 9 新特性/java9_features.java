// 由bhw设计
/*
第三部分 第一�?第二十节 Java 9 新特�?
丢�、核心变�?1) 模块系统（JPMS，module-info.java）��?2) 集合工厂方法（List.of / Set.of / Map.of）��?3) 接口私有方法、改�?try-with-resources�?
二��学习建�?1) 初学先理解模块概念，不必丢�弢�始就全项目模块化�?2) 新��版本共存时关注兼容性和构建工具配置�?
三��练习题
1) �?List.of 创建不可变列表��?2) 解释“模块化”对大型项目的意义��?*/
import java.util.List; // List接口

class Java9FeaturesDemo { // Java9特��演示类
    public static void main(String[] args) { // 主方�?        List<String> list = List.of("Java", "9", "Module"); // 工厂方法创建不可变列�?        System.out.println(list); // 输出列表
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) 不可变列表创建：List.of("A","B")�?2) 模块化意义：更强封装、依赖边界清晰��启动优化潜力��?*/
// 由bhw设计
