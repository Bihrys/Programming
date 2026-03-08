// 由bhw设计
/*
第一部分 第二�?第五�?Java 变量类型

丢�、变量三大类�?1) 屢�部变量：定义在方法内，必须初始化后才能用�?2) 成员变量：定义在类中、方法外，属于对象��?3) 类变量（static）：定义在类中并�?static 修饰，属于类本身�?
二��生命周�?1) 屢�部变量随方法调用创建和销毁��?2) 成员变量随对象创建和锢�毁��?3) static 变量随类加载存在，��常全局共享�?
三��练习题
1) 写一个计数器类，使用 static 统计创建对象数量�?2) 比较屢�部变量和成员变量默认值差异��?*/
class VariableTypeDemo { // 变量类型演示�?    static int total = 0; // 类变量：扢�有对象共�?    String name; // 成员变量：每个对象独�?
    VariableTypeDemo(String n) { // 构��方�?        name = n; // 成员变量赋��?        total++; // 每创建一个对象��数�?
    } // 构��结�?
    void printInfo() { // 成员方法
        int local = 10; // 屢�部变量：只在本方法有�?        System.out.println(name + ", local=" + local + ", total=" + total); // 输出三类变量
    } // 方法结束

    public static void main(String[] args) { // 主方�?        VariableTypeDemo a = new VariableTypeDemo("A"); // 创建对象A
        VariableTypeDemo b = new VariableTypeDemo("B"); // 创建对象B
        a.printInfo(); // 输出A信息
        b.printInfo(); // 输出B信息
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) static 可用于统计��对象数�?2) 成员变量有默认��（如int默认0），屢�部变量没有默认����?*/
// 由bhw设计
