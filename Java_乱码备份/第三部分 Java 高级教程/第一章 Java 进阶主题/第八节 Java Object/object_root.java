// 由bhw设计
/*
第三部分 第一�?第八�?Java Object

丢�、Object 是所有类的根�?1) 默认继承 Object�?2) 常用方法：toString、equals、hashCode、getClass�?
二��重写建�?1) 领域对象建议重写 equals/hashCode 保证语义正确�?2) toString 便于日志和调试��?
三��练习题
1) 自定义类重写 toString�?2) 重写 equals �?hashCode 做��对象比较��?*/
class UserObj { // 示例对象�?    String name; // 字段
    int age; // 字段
    UserObj(String n, int a) { name = n; age = a; } // 构��?
    @Override
    public String toString() { // 重写toString
        return "UserObj{name='" + name + "', age=" + age + "}"; // 返回描述字符�?    } // 方法结束
}

class ObjectRootDemo { // 测试�?    public static void main(String[] args) { // 主方�?        UserObj u = new UserObj("bhw", 18); // 创建对象
        System.out.println(u.toString()); // 调用toString
        System.out.println(u.getClass().getName()); // 获取运行时类�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// @Override public boolean equals(Object o) { ... } // 重写相等逻辑
// @Override public int hashCode() { ... } // 保持与equals丢��?*/
// 由bhw设计
