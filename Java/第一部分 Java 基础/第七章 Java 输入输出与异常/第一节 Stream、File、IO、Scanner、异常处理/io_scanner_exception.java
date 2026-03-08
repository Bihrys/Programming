// 由bhw设计
/*
第一部分 第七章 第一节 Stream、File、IO、Scanner、异常处理

一、Stream、File、IO
1) 字节流处理二进制，字符流处理文本。
2) 推荐 try-with-resources 自动关闭资源。

二、Scanner
1) 读取控制台输入：nextInt、nextLine 等。
2) 注意 nextInt 后读取 nextLine 需要处理换行。

三、异常处理
1) try-catch-finally 结构。
2) throw 主动抛异常，throws 声明异常。
3) 捕获具体异常类型，避免“全抓 Exception”。

四、练习题
1) 把一行文本写入文件并读取输出。
2) 输入两个整数，处理除数为0异常。
*/
import java.io.BufferedReader; // 缓冲读
import java.io.BufferedWriter; // 缓冲写
import java.io.FileReader; // 文件读流
import java.io.FileWriter; // 文件写流
import java.util.Scanner; // 控制台输入

class IOScannerExceptionDemo { // IO与异常演示类
    static int divide(int a, int b) { // 除法方法
        if (b == 0) { // 非法参数判断
            throw new IllegalArgumentException("除数不能为0"); // 抛出参数异常
        } // if结束
        return a / b; // 返回商
    } // 方法结束

    public static void main(String[] args) { // 主方法
        String path = "java_io_demo.txt"; // 文件路径
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // 自动关闭写流
            bw.write("Hello Java IO"); // 写入文本
            bw.newLine(); // 换行
        } catch (Exception e) { // 捕获写异常
            System.out.println("写入失败:" + e.getMessage()); // 输出错误
        } // 写入流程结束

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // 自动关闭读流
            System.out.println("读取内容:" + br.readLine()); // 读取并输出第一行
        } catch (Exception e) { // 捕获读异常
            System.out.println("读取失败:" + e.getMessage()); // 输出错误
        } // 读取流程结束

        Scanner sc = new Scanner(System.in); // 创建输入对象
        System.out.print("请输入两个整数: "); // 输入提示
        int x = sc.nextInt(); // 读第一个整数
        int y = sc.nextInt(); // 读第二个整数
        try { // 异常保护
            System.out.println("x/y=" + divide(x, y)); // 调用除法
        } catch (IllegalArgumentException e) { // 捕获参数异常
            System.out.println("错误:" + e.getMessage()); // 输出错误信息
        } finally { // 最终执行
            sc.close(); // 关闭输入流
        } // try-catch-finally结束
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// try { // 尝试执行
//     System.out.println(10 / 0); // 人为触发异常
// } catch (ArithmeticException e) { // 捕获算术异常
//     System.out.println("除数不能为0"); // 输出提示
// } // 异常处理结束
*/
// 由bhw设计
