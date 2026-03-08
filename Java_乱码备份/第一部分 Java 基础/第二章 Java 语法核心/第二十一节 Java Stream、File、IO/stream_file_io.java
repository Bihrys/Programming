// 由bhw设计
/*
第一部分 第二�?第二十一�?Java Stream、File、IO

丢�、IO 核心分类
1) 字节流：InputStream / OutputStream（处理二进制）��?2) 字符流：Reader / Writer（处理文本）�?3) File 类：文件与目录元信息�?
二��推荐实�?1) 使用 try-with-resources 自动关闭流��?2) 明确字符编码（UTF-8）��?3) 处理异常并给出明确错误信息��?
三��练习题
1) 写入丢�行文本到 demo.txt�?2) 读取 demo.txt 并��行输出�?*/
import java.io.BufferedReader; // 缓冲读取�?import java.io.BufferedWriter; // 缓冲写入�?import java.io.FileReader; // 文件字符输入�?import java.io.FileWriter; // 文件字符输出�?import java.io.IOException; // IO异常

class StreamFileIODemo { // IO演示�?    public static void main(String[] args) { // 主方�?        String path = "demo.txt"; // 文件路径
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // 自动关闭写流
            bw.write("Hello Java IO"); // 写入内容
            bw.newLine(); // 写入换行
        } catch (IOException e) { // 捕获写异�?            System.out.println("写文件失�? " + e.getMessage()); // 输出错误
        } // 写入结束

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // 自动关闭读流
            String line; // 行变�?            while ((line = br.readLine()) != null) { // 逐行读取
                System.out.println("读取�? " + line); // 输出行内�?            } // 循环结束
        } catch (IOException e) { // 捕获读异�?            System.out.println("读文件失�? " + e.getMessage()); // 输出错误
        } // 读取结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// try (BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"))) { // 打开写流
//     bw.write("第一�?); // 写入
// } catch (IOException e) { // 异常处理
//     e.printStackTrace(); // 打印堆栈
// } // 结束
*/
// 由bhw设计
