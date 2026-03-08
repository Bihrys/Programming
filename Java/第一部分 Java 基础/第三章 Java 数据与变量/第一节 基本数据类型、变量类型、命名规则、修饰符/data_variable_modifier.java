// 由bhw设计
/*
第一部分 第三章 第一节 基本数据类型、变量类型、命名规则、修饰符

一、Java 基本数据类型（8种）
1) 整数：byte short int long
2) 浮点：float double
3) 字符：char
4) 布尔：boolean

二、变量类型
1) 局部变量：方法内定义，必须初始化后使用。
2) 成员变量：类中方法外定义，属于对象。
3) 类变量（static）：属于类，全体对象共享。

三、命名规则
1) 不能以数字开头，不能用关键字。
2) 变量与方法用小驼峰，类名用大驼峰。
3) 常量用全大写下划线，如 MAX_SIZE。

四、修饰符核心
1) 访问修饰符：public、protected、default、private。
2) 非访问修饰符：static、final、abstract。

五、练习题
1) 定义三种变量并输出。
2) 写一个 private 字段 + public getter/setter。
3) 定义一个 final 常量并说明其作用。
*/
class DataVariableModifierDemo { // 演示类
    static int totalCount = 0; // 类变量：共享计数
    private String name; // 私有成员变量
    public final int maxSize = 100; // final常量字段

    DataVariableModifierDemo(String name) { // 构造方法
        this.name = name; // 给成员变量赋值
        totalCount++; // 每创建对象计数+1
    } // 构造结束

    public String getName() { // getter方法
        return name; // 返回私有字段
    } // 方法结束

    public void setName(String name) { // setter方法
        this.name = name; // 修改私有字段
    } // 方法结束

    public static void main(String[] args) { // 主方法
        byte b = 10; // 基本类型：byte
        int i = 100; // 基本类型：int
        double d = 3.14; // 基本类型：double
        boolean ok = true; // 基本类型：boolean
        System.out.println(b + "," + i + "," + d + "," + ok); // 输出基本类型值

        DataVariableModifierDemo a = new DataVariableModifierDemo("A"); // 创建对象A
        DataVariableModifierDemo c = new DataVariableModifierDemo("C"); // 创建对象C
        System.out.println(a.getName() + "," + c.getName()); // 输出成员变量
        System.out.println("totalCount=" + totalCount + ", maxSize=" + a.maxSize); // 输出类变量与常量
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// private int age; // 私有字段
// public int getAge() { return age; } // getter
// public void setAge(int age) { this.age = age; } // setter
*/
// 由bhw设计
