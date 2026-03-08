// 由bhw设计
/*
第一部分 第六章 第一节 数组、日期时间、正则、方法、构造

一、数组
1) 同类型元素有序集合，下标从0开始。
2) 长度固定：arr.length。

二、日期时间（Java 8+）
1) 推荐 java.time 包。
2) 常用：LocalDate、LocalDateTime、DateTimeFormatter。

三、正则表达式
1) 快速校验：String.matches。
2) 提取匹配：Pattern + Matcher。

四、方法与构造方法
1) 方法：封装重复逻辑。
2) 构造方法：创建对象时初始化状态。

五、练习题
1) 计算数组平均值。
2) 格式化当前时间为 yyyy-MM-dd。
3) 校验手机号是否为 1 开头 11 位数字。
*/
import java.time.LocalDateTime; // 日期时间类
import java.time.format.DateTimeFormatter; // 时间格式类
import java.util.regex.Pattern; // 正则模式类

class StudentTopic { // 构造方法演示类
    String name; // 成员变量
    StudentTopic(String name) { // 构造方法
        this.name = name; // 初始化成员变量
    } // 构造结束
}

class SyntaxTopicsDemo { // 专题演示类
    static double avg(int[] arr) { // 方法：计算平均值
        int sum = 0; // 累加器
        for (int v : arr) sum += v; // 遍历求和
        return (double) sum / arr.length; // 返回平均值
    } // 方法结束

    public static void main(String[] args) { // 主方法
        int[] nums = {80, 90, 100}; // 数组示例
        System.out.println("avg=" + avg(nums)); // 调用方法输出平均值

        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // 格式化当前日期
        System.out.println("today=" + now); // 输出日期

        String phone = "13812345678"; // 手机号示例
        boolean ok = Pattern.matches("^1\\d{10}$", phone); // 正则校验
        System.out.println("phone ok? " + ok); // 输出校验结果

        StudentTopic s = new StudentTopic("bhw"); // 构造创建对象
        System.out.println("student=" + s.name); // 输出对象字段
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// int[] a = {1,2,3,4}; // 数组
// int sum = 0; // 和
// for (int x : a) sum += x; // 累加
// System.out.println((double) sum / a.length); // 平均值
*/
// 由bhw设计
