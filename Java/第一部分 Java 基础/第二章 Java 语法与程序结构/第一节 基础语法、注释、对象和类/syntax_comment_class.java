// 由bhw设计
/*
第一部分 第二章 第一节 基础语法、注释、对象和类

一、Java 基础语法规则
1) 大小写敏感：Hello 与 hello 不同。
2) 类名推荐大驼峰，方法名和变量名推荐小驼峰。
3) 语句通常以分号结尾。
4) 程序入口固定签名：
   public static void main(String[] args)

二、注释三种形式
1) 单行注释：//
2) 多行注释：/* ... *\/
3) 文档注释：/** ... *\/，用于 javadoc

三、对象和类
1) 类是模板：定义字段（状态）和方法（行为）。
2) 对象是实例：通过 new 创建。
3) 一个类可创建多个对象，每个对象状态独立。

四、练习题
1) 写一个 Person 类，包含 name、age、sayHello。
2) 创建两个 Person 对象，输出各自信息。
3) 给方法写一段文档注释。
*/
class PersonDemo { // 定义 Person 类
    String name; // 字段：姓名
    int age; // 字段：年龄

    /**
     * 输出自我介绍。
     */
    void sayHello() { // 定义行为方法
        System.out.println("你好，我是" + name + "，年龄" + age); // 输出对象信息
    } // 方法结束
} // PersonDemo 类结束

class SyntaxCommentClassDemo { // 测试类
    public static void main(String[] args) { // 程序入口
        PersonDemo p1 = new PersonDemo(); // 创建对象1
        p1.name = "bhw"; // 设置对象1姓名
        p1.age = 18; // 设置对象1年龄
        p1.sayHello(); // 调用对象1方法

        PersonDemo p2 = new PersonDemo(); // 创建对象2
        p2.name = "小明"; // 设置对象2姓名
        p2.age = 16; // 设置对象2年龄
        p2.sayHello(); // 调用对象2方法
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// class Person { // 练习类
//     String name; // 姓名
//     int age; // 年龄
//     void sayHello() { // 打招呼方法
//         System.out.println(name + ":" + age); // 输出
//     } // 结束
// } // 类结束
*/
// 由bhw设计
