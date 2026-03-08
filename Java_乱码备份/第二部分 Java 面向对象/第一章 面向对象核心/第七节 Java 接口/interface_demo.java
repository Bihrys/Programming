// 由bhw设计
/*
第二部分 第一�?第七�?Java 接口

丢�、接口用�?1) 定义行为规范，不关心具体实现�?2) 支持“一个类实现多个接口”��?3) 面向接口编程，提升扩展����?
二��练习题
1) 定义接口 Flyable，方�?fly�?2) Bird �?Plane 都实�?Flyable�?*/
interface Flyable { // 定义接口
    void fly(); // 抽象方法
}

class Bird implements Flyable { // 小鸟实现接口
    public void fly() { // 实现接口方法
        System.out.println("小鸟在飞"); // 输出
    } // 方法结束
}

class Plane implements Flyable { // 飞机实现接口
    public void fly() { // 实现接口方法
        System.out.println("飞机在飞"); // 输出
    } // 方法结束
}

class InterfaceDemo { // 测试�?    public static void main(String[] args) { // 主方�?        Flyable f1 = new Bird(); // 接口引用指向实现�?        Flyable f2 = new Plane(); // 接口引用指向实现�?        f1.fly(); // 调用接口方法
        f2.fly(); // 调用接口方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// interface Swimmable { void swim(); } // 定义游泳接口
*/
// 由bhw设计
