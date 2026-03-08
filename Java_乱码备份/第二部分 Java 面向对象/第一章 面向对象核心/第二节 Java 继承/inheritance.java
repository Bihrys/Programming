// 由bhw设计
/*
第二部分 第一�?第二�?Java 继承

丢�、继承语�?1) class 子类 extends 父类
2) 子类自动拥有父类非私有成员��?3) super 可访问父类构造和成员�?
二��继承价�?1) 复用代码，减少重复��?2) 建立“is-a”关系（学生是人）��?
三��练习题
1) 定义 Animal 父类�?Dog 子类�?2) 在子类中调用父类方法�?*/
class AnimalBase { // 父类
    void eat() { // 父类行为
        System.out.println("动物在吃东西"); // 输出行为
    } // 方法结束
} // 父类结束

class DogSub extends AnimalBase { // 子类继承父类
    void bark() { // 子类新增行为
        System.out.println("小狗在叫"); // 输出行为
    } // 方法结束
} // 子类结束

class InheritanceDemo { // 测试�?    public static void main(String[] args) { // 主方�?        DogSub d = new DogSub(); // 创建子类对象
        d.eat(); // 调用继承来的父类方法
        d.bark(); // 调用子类方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// class CatSub extends AnimalBase { // 猫类继承
//     void meow() { System.out.println("喵喵"); } // 新增行为
// } // 结束
*/
// 由bhw设计
