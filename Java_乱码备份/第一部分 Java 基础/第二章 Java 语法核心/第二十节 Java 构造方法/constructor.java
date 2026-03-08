// 由bhw设计
/*
第一部分 第二�?第二十节 Java 构��方�?
丢�、构造方法特�?1) 名称与类名相同��?2) 没有返回类型�?3) 创建对象时自动调用��?
二��常见用�?1) 无参构��：给默认初值��?2) 有参构��：按传入参数初始化对象�?3) this(...)：在构��方法间复用初始化��辑�?
三��练习题
1) 写一�?Book 类，含无参和有参构����?2) 创建两个对象，分别用不同构��初始化�?*/
class StudentCtor { // 构��方法演示类
    String name; // 姓名
    int age; // 年龄

    StudentCtor() { // 无参构��?        this("未命�?, 0); // 调用有参构��统丢�初始�?    } // 构��结�?
    StudentCtor(String name, int age) { // 有参构��?        this.name = name; // 初始化字�?        this.age = age; // 初始化字�?    } // 构��结�?
    void printInfo() { // 打印方法
        System.out.println(name + ":" + age); // 输出对象信息
    } // 方法结束
}

class ConstructorDemo { // 测试�?    public static void main(String[] args) { // 主方�?        StudentCtor s1 = new StudentCtor(); // 调用无参构��?        StudentCtor s2 = new StudentCtor("bhw", 18); // 调用有参构��?        s1.printInfo(); // 输出s1信息
        s2.printInfo(); // 输出s2信息
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// class Book { // 图书�?//     String title; // 书名
//     Book() { this("未命名图�?); } // 无参构��?//     Book(String title) { this.title = title; } // 有参构��?// } // 类结�?*/
// 由bhw设计
