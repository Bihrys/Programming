// 由bhw设计
/*
第三部分 第一�?第九�?Java NIO Files

丢�、NIO Files 优势
1) API 更现代，路径处理更清晰��?2) 支持丢�次��读写��目录遍历��文件属性读取��?
二��练习题
1) 创建文件并写入文本��?2) 读取文件全部内容并输出��?*/
import java.io.IOException; // IO异常
import java.nio.charset.StandardCharsets; // 字符�?import java.nio.file.Files; // Files工具�?import java.nio.file.Path; // 路径�?
class NioFilesDemo { // NIO文件演示�?    public static void main(String[] args) throws IOException { // 主方�?        Path p = Path.of("nio_demo.txt"); // 创建路径对象
        Files.writeString(p, "NIO 写入示例", StandardCharsets.UTF_8); // 写入文本
        String content = Files.readString(p, StandardCharsets.UTF_8); // 读取文本
        System.out.println(content); // 输出内容
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// boolean exists = Files.exists(Path.of("nio_demo.txt")); // 判断文件存在
// System.out.println(exists); // 输出结果
*/
// 由bhw设计
