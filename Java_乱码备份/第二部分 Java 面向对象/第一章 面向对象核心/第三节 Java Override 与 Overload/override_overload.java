// 由bhw设计
/*
第二部分 第一�?第三�?Java Override �?Overload

丢�、Overload（重载）
1) 同一个类中方法名相同，参数列表不同��?2) 返回类型不同不能单独构成重载�?
二��Override（重写）
1) 子类重写父类同名同参方法�?2) 权限不能比父类更严格�?3) 推荐�?@Override，编译期可校验��?
三��练习题
1) 写一�?Calculator �?add 方法重载版本�?2) 子类重写父类�?speak 方法�?*/
class ParentSpeak { // 父类
    void speak() { // 父类方法
        System.out.println("父类发言"); // 输出
    } // 方法结束
}

class ChildSpeak extends ParentSpeak { // 子类
    @Override // 标注重写
    void speak() { // 重写父类方法
        System.out.println("子类发言"); // 输出
    } // 方法结束

    int add(int a, int b) { // 重载方法1
        return a + b; // 返回�?    } // 结束

    int add(int a, int b, int c) { // 重载方法2
        return a + b + c; // 返回�?    } // 结束
} // 类结�?
class OverrideOverloadDemo { // 测试�?    public static void main(String[] args) { // 主方�?        ChildSpeak c = new ChildSpeak(); // 创建对象
        c.speak(); // 调用重写方法
        System.out.println(c.add(1, 2)); // 调用重载1
        System.out.println(c.add(1, 2, 3)); // 调用重载2
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// @Override void speak() { System.out.println("重写成功"); } // 重写示例
*/
// 由bhw设计
