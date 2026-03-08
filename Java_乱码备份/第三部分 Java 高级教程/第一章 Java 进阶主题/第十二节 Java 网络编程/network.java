// 由bhw设计
/*
第三部分 第一�?第十二节 Java 网络编程

丢�、核心类
1) Socket：客户端套接字��?2) ServerSocket：服务端监听�?3) URL/HttpURLConnection：HTTP 访问�?
二��学习路�?1) 先学 TCP 客户�?服务端文本��信�?2) 再学 HTTP 请求�?JSON 处理�?
三��练习题
1) 写一�?TCP 客户端连接本地端口��?2) 发��一行文本给服务端��?*/
import java.net.Socket; // 套接字类

class NetworkDemo { // 网络编程演示�?    public static void main(String[] args) { // 主方�?        try (Socket s = new Socket("127.0.0.1", 9000)) { // 连接本机9000端口
            System.out.println("连接成功: " + s.isConnected()); // 输出连接状��?        } catch (Exception e) { // 捕获连接异常
            System.out.println("连接失败: " + e.getMessage()); // 输出错误信息
        } // 结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// Socket client = new Socket("127.0.0.1", 9000); // 创建连接
*/
// 由bhw设计
