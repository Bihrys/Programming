// 由bhw设计
/*
第一部分 第二�?第七�?Java 修饰�?
丢�、访问修饰符
1) public：任何位置可访问�?2) protected：同�?+ 子类可访问��?3) default（不写）：同包可访问�?4) private：仅当前类内部可访问�?
二��非访问修饰�?1) static：属于类，不属于对象�?2) final：��不可改、方法不可重写��类不可继承（视场景）��?3) abstract：抽象类或抽象方法，强调“约束接口����?
三��练习题
1) 定义丢��?private 字段�?public getter�?2) �?static 统计方法调用次数�?*/
class ModifierDemo { // 修饰符演示类
    private String name = "bhw"; // private 字段，只能类内部访问
    public static int callCount = 0; // static 变量，所有对象共�?    public final int id = 1001; // final 字段，赋值后不可�?
    public String getName() { // public 方法，对外暴露访问入�?        callCount++; // 每调用一次计数加1
        return name; // 返回私有字段
    } // 方法结束

    public static void main(String[] args) { // 主方�?        ModifierDemo demo = new ModifierDemo(); // 创建对象
        System.out.println(demo.getName()); // 调用公开方法访问私有字段
        System.out.println("callCount=" + callCount + ", id=" + demo.id); // 输出静��与final�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// private int age = 18; // 私有字段
// public int getAge() { return age; } // 对外只读访问
*/
// 由bhw设计
