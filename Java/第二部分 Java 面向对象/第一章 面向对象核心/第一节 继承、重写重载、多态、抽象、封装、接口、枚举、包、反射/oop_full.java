// 由bhw设计
/*
第二部分 第一章 第一节 继承、重写重载、多态、抽象、封装、接口、枚举、包、反射

一、面向对象总览
1) 封装：私有字段 + 公共方法。
2) 继承：子类 extends 父类。
3) 多态：父类引用指向子类对象。
4) 抽象：abstract 类和方法定义规范。
5) 接口：interface 定义行为约束。

二、Override 与 Overload
1) Overload：同类中同名不同参。
2) Override：子类重写父类同名同参方法。

三、枚举、包、反射
1) enum 限定取值范围，降低魔法值错误。
2) package 组织代码结构，避免类名冲突。
3) 反射可在运行时查看并调用类成员。

四、练习题
1) 设计 Animal、Dog、Cat，演示多态。
2) 写一个接口 Flyable，让 Bird 和 Plane 实现。
3) 写一个枚举表示订单状态。
*/
interface Flyable { // 接口定义
    void fly(); // 抽象行为
}

abstract class Animal { // 抽象父类
    private String name; // 私有字段（封装）
    Animal(String name) { this.name = name; } // 构造方法
    public String getName() { return name; } // getter
    abstract void sound(); // 抽象方法
    void intro() { System.out.println("我是" + name); } // 普通方法
}

class Dog extends Animal implements Flyable { // 子类继承并实现接口
    Dog(String name) { super(name); } // 调用父类构造
    @Override
    void sound() { System.out.println("汪汪"); } // 重写父类抽象方法
    @Override
    public void fly() { System.out.println("小狗不会飞，这是接口实现演示"); } // 实现接口
    int add(int a, int b) { return a + b; } // 重载示例1
    int add(int a, int b, int c) { return a + b + c; } // 重载示例2
}

class Cat extends Animal { // 第二个子类
    Cat(String name) { super(name); } // 构造
    @Override
    void sound() { System.out.println("喵喵"); } // 重写
}

enum OrderStatus { // 枚举定义
    CREATED, PAID, CANCELED // 枚举常量
}

class OOPFullDemo { // 综合演示类
    public static void main(String[] args) throws Exception { // 主方法
        Animal a1 = new Dog("旺财"); // 多态：父类引用指向子类
        Animal a2 = new Cat("咪咪"); // 多态：父类引用指向子类
        a1.intro(); // 调用父类普通方法
        a1.sound(); // 动态绑定到 Dog.sound
        a2.sound(); // 动态绑定到 Cat.sound

        Dog d = new Dog("小黄"); // 创建子类对象
        System.out.println(d.add(1, 2)); // 调用重载1
        System.out.println(d.add(1, 2, 3)); // 调用重载2
        d.fly(); // 调用接口实现

        OrderStatus status = OrderStatus.PAID; // 使用枚举
        System.out.println("订单状态=" + status); // 输出枚举值

        Class<?> clazz = Class.forName("Dog"); // 反射获取类对象
        System.out.println("反射类名=" + clazz.getName()); // 输出类名
        System.out.println("包结构请在真实项目中使用 package com.xxx;"); // 包说明
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// Animal[] arr = {new Dog("A"), new Cat("B")}; // 多态数组
// for (Animal x : arr) x.sound(); // 统一调用
*/
// 由bhw设计
