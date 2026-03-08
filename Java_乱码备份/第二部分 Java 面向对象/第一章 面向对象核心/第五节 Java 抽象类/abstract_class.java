// 由bhw设计
/*
第二部分 第一�?第五�?Java 抽象�?
丢�、抽象类作用
1) 定义共��字段与共��方法实现��?2) 对关键行为给出抽象方法，要求子类实现�?
二��规�?1) abstract 类不能直�?new�?2) 子类必须实现扢�有抽象方法，或继续声明为 abstract�?
三��练习题
1) 定义抽象�?Shape，含抽象方法 area�?2) 子类 Circle 实现 area�?*/
abstract class ShapeAbs { // 抽象父类
    abstract double area(); // 抽象方法，子类必须实�?
    void printType() { // 普��方法可有实�?        System.out.println("这是丢�个图形对�?); // 输出提示
    } // 方法结束
}

class CircleAbs extends ShapeAbs { // 具体子类
    double r; // 半径
    CircleAbs(double r) { this.r = r; } // 构��初始化
    @Override
    double area() { return Math.PI * r * r; } // 实现抽象方法
}

class AbstractClassDemo { // 测试�?    public static void main(String[] args) { // 主方�?        ShapeAbs s = new CircleAbs(2); // 父类引用指向子类对象
        s.printType(); // 调用父类已实现方�?        System.out.println("area=" + s.area()); // 调用子类实现方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// class RectAbs extends ShapeAbs { // 矩形子类
//     double w, h; // 边长
//     RectAbs(double w, double h) { this.w = w; this.h = h; } // 构��?//     double area() { return w * h; } // 实现面积
// } // 类结�?*/
// 由bhw设计
