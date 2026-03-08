// 由bhw设计
/*
第二部分 第一�?第一�?Java 面向对象

丢�、四大特�?1) 封装：隐藏细节，暴露必要接口�?2) 继承：复用父类能力��?3) 多��：同一调用呈现不同实现�?4) 抽象：提炼共性，约束行为�?
二��建模��路
1) 先找对象（名词），再找行为（动词）��?2) 识别共��放父类，个性放子类�?3) 优先组合，其次继承��?
三��练习题
1) 把��学生管理��抽象出 Student 类��?2) 思������师”和“学生��哪些字段可以放父类�?*/
class PersonOOP { // 抽象出人物共性类
    String name; // 姓名
    int age; // 年龄
    void introduce() { // 自我介绍方法
        System.out.println("我是" + name + "，年�? + age); // 输出介绍
    } // 方法结束
} // 类结�?
class OOPIntroDemo { // 测试�?    public static void main(String[] args) { // 主方�?        PersonOOP p = new PersonOOP(); // 创建对象
        p.name = "bhw"; // 设置状��?        p.age = 18; // 设置状��?        p.introduce(); // 调用行为
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// class Student extends PersonOOP { // 学生继承人物
//     int score; // 分数字段
// } // 类结�?*/
// 由bhw设计
