// 由bhw设计
/*
第三部分 第二章 第一节 NIO、序列化、网络编程、发送邮件、多线程、Applet

一、NIO Files
1) Files.writeString / readString 读写简单文本更方便。
2) Path.of 构造路径，跨平台更统一。

二、序列化
1) 对象实现 Serializable 才能序列化。
2) 建议定义 serialVersionUID。

三、网络编程
1) Socket/ServerSocket 处理 TCP。
2) 先学本地环回测试，再扩展客户端服务端协议。

四、发送邮件
1) 通常使用 Jakarta Mail。
2) 生产环境不要硬编码账号密码。

五、多线程
1) 推荐 Runnable + 线程池。
2) 注意共享变量并发安全。

六、Applet
1) Applet 属历史技术，现代浏览器基本淘汰。

七、练习题
1) 用 NIO 写入并读取 demo 文件。
2) 写一个 Runnable，两个线程并发输出。
*/
import java.io.Serializable; // 序列化接口
import java.nio.charset.StandardCharsets; // 字符集
import java.nio.file.Files; // NIO文件工具
import java.nio.file.Path; // NIO路径

class UserSerDemo implements Serializable { // 可序列化示例类
    private static final long serialVersionUID = 1L; // 序列化版本号
    String name; // 字段
    UserSerDemo(String name) { this.name = name; } // 构造
}

class PrintTask implements Runnable { // 多线程任务类
    private final String tag; // 任务标签
    PrintTask(String tag) { this.tag = tag; } // 构造
    public void run() { // 线程执行体
        for (int i = 1; i <= 3; i++) { // 循环输出
            System.out.println(tag + ":" + i); // 输出线程信息
        } // 循环结束
    } // run结束
}

class NioNetworkThreadDemo { // 综合演示类
    public static void main(String[] args) throws Exception { // 主方法
        Path p = Path.of("nio_demo.txt"); // 创建路径对象
        Files.writeString(p, "NIO 示例", StandardCharsets.UTF_8); // 写入文本
        System.out.println(Files.readString(p, StandardCharsets.UTF_8)); // 读取文本

        Thread t1 = new Thread(new PrintTask("T1")); // 创建线程1
        Thread t2 = new Thread(new PrintTask("T2")); // 创建线程2
        t1.start(); // 启动线程1
        t2.start(); // 启动线程2

        System.out.println("网络编程入门：Socket/ServerSocket。"); // 网络提示
        System.out.println("发送邮件入门：Jakarta Mail + SMTP。"); // 邮件提示
        System.out.println("Applet 已过时，仅作历史了解。"); // Applet提示
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// Path p = Path.of("a.txt"); // 路径
// Files.writeString(p, "hello", StandardCharsets.UTF_8); // 写入
// String s = Files.readString(p, StandardCharsets.UTF_8); // 读取
// System.out.println(s); // 输出
*/
// 由bhw设计
