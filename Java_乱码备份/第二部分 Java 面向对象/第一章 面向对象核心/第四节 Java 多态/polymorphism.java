// 由bhw设计
/*
第二部分 第一�?第四�?Java 多��?
丢�、多态定�?1) 父类引用指向子类对象�?2) 调用同名方法时执行子类重写版本（运行时绑定）�?
二��优�?1) 统一接口，降低��合�?2) 易扩展：新增子类无需改调用方核心逻辑�?
三��练习题
1) 创建 Shape 父类�?Circle/Rectangle 子类�?2) 用父类数组统丢�调用 draw�?*/
class AnimalPoly { // 父类
    void sound() { // 父类方法
        System.out.println("动物发声"); // 默认行为
    } // 方法结束
}

class DogPoly extends AnimalPoly { // 子类1
    @Override
    void sound() { // 重写
        System.out.println("汪汪"); // 子类行为
    } // 结束
}

class CatPoly extends AnimalPoly { // 子类2
    @Override
    void sound() { // 重写
        System.out.println("喵喵"); // 子类行为
    } // 结束
}

class PolymorphismDemo { // 测试�?    public static void main(String[] args) { // 主方�?        AnimalPoly a1 = new DogPoly(); // 父类引用指向子类对象
        AnimalPoly a2 = new CatPoly(); // 父类引用指向子类对象
        a1.sound(); // 动��绑定到DogPoly.sound
        a2.sound(); // 动��绑定到CatPoly.sound
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// AnimalPoly[] arr = {new DogPoly(), new CatPoly()}; // 多��数�?// for (AnimalPoly a : arr) a.sound(); // 统一调用
*/
// 由bhw设计
