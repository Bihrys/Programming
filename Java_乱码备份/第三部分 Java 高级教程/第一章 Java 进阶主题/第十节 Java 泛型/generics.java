// 由bhw设计
/*
第三部分 第一�?第十�?Java 泛型

丢�、泛型价�?1) 编译期类型检查，减少强转错误�?2) 提升代码复用性和可读性��?
二��常见形�?1) 泛型类：class Box<T>
2) 泛型方法�?T> T echo(T x)
3) 通配符：? extends / ? super

三��练习题
1) 写一个泛型盒子类 Box<T>�?2) 写泛型方法返回传入参数��?*/
class Box<T> { // 泛型类定�?    private T value; // 泛型字段
    void set(T value) { this.value = value; } // 设置�?    T get() { return value; } // 获取�?}

class GenericsDemo { // 泛型演示�?    static <T> T echo(T x) { // 泛型方法
        return x; // 返回参数本身
    } // 方法结束

    public static void main(String[] args) { // 主方�?        Box<Integer> box = new Box<>(); // 指定泛型为Integer
        box.set(123); // 放入整数
        System.out.println(box.get()); // 取出并输�?        System.out.println(echo("泛型方法")); // 调用泛型方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// Box<String> sb = new Box<>(); // 字符串盒�?// sb.set("Java"); // 存��?// System.out.println(sb.get()); // 取��?*/
// 由bhw设计
