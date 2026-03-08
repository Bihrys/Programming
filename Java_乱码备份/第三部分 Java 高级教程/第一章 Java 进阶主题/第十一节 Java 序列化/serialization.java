// 由bhw设计
/*
第三部分 第一�?第十丢��?Java 序列�?
丢�、序列化用��?1) 对象持久化到文件或网络传输��?2) 典型接口：Serializable�?
二��注意点
1) 建议定义 serialVersionUID�?2) transient 字段不会被序列化�?
三��练习题
1) 序列化一�?User 对象到文件��?2) 再反序列化并输出字段�?*/
import java.io.*; // IO与序列化�?
class UserSer implements Serializable { // 可序列化�?    private static final long serialVersionUID = 1L; // 版本�?    String name; // 字段
    int age; // 字段
    UserSer(String n, int a) { name = n; age = a; } // 构��?}

class SerializationDemo { // 序列化演示类
    public static void main(String[] args) throws Exception { // 主方�?        UserSer u = new UserSer("bhw", 18); // 创建对象
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.bin"))) { // 输出�?            oos.writeObject(u); // 写对�?        } // 关闭�?        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.bin"))) { // 输入�?            UserSer x = (UserSer) ois.readObject(); // 读对象并强转
            System.out.println(x.name + ":" + x.age); // 输出对象
        } // 关闭�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// transient String password; // 敏感字段不序列化
*/
// 由bhw设计
