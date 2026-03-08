// 由bhw设计
/*
第一部分 第二�?第三�?Java 对象和类

丢�、核心概�?1) 类：对象模板，描述状态（字段）和行为（方法）�?2) 对象：类的实例，通过 new 创建�?3) 丢�个类可创建多个对象，每个对象字段值可不同�?
二��初学��要�?1) 字段写在类中，方法也写在类中�?2) this 代表当前对象�?3) new 后必须接构��方法（默认或自定义）��?
三��练习题
1) 定义 Student 类，包含 name �?score，并打印信息�?2) 创建两个 Student 对象，验证对象状态独立��?*/
class Dog { // 定义 Dog �?    String name; // 字段：名�?    int age; // 字段：年�?
    void bark() { // 行为：叫
        System.out.println(name + " 在叫，年�?" + age); // 输出对象状��?    } // 方法结束
} // Dog类结�?
class ObjectClassDemo { // 测试�?    public static void main(String[] args) { // 主方�?        Dog d1 = new Dog(); // 创建第一个对�?        d1.name = "旺财"; // 给对象字段赋�?        d1.age = 3; // 给对象字段赋�?        d1.bark(); // 调用对象方法

        Dog d2 = new Dog(); // 创建第二个对�?        d2.name = "小黑"; // 赋��?        d2.age = 5; // 赋��?        d2.bark(); // 调用方法
    } // main结束
} // 测试类结�?
/*
练习题答案（注释版）
1) Student 示例�?// class Student { // 学生�?//     String name; // 姓名
//     int score; // 分数
//     void printInfo() { // 打印信息
//         System.out.println(name + ":" + score); // 输出
//     } // 结束
// } // 类结�?*/
// 由bhw设计
