// 由bhw设计
/*
第二部分 第一�?第九�?Java 包（package�?
丢�、包的作�?1) 组织代码层级，避免类名冲突��?2) 配合访问控制管理可见性��?3) 是大型项目结构化的基硢��?
二��基本规�?1) package 语句通常在文件第丢�行（注释后）�?2) 目录结构应与包名丢�致��?3) 使用 import 引入其他包类�?
三��练习题
1) 创建 com.bhw.demo 包并写一个工具类�?2) 在另丢�个类�?import 并调用该工具类��?*/
class PackageDemo { // 包机制说明类（此文件不声明package，便于单文件示例�?    public static void main(String[] args) { // 主方�?        System.out.println("真实项目请在文件顶部声明 package com.xxx;"); // 输出提示1
        System.out.println("并让目录结构与包名保持一致��?); // 输出提示2
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// package com.bhw.demo; // 包声�?// public class Tool { // 工具�?//     public static void hello() { System.out.println("hello"); } // 静��方�?// } // 类结�?*/
// 由bhw设计
