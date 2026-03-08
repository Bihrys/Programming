// 由bhw设计
/*
第一部分 第二�?第十七节 Java 日期时间

丢�、推�?API
1) Java 8+ 推荐 java.time（LocalDate、LocalTime、LocalDateTime）��?2) �?API Date/Calendar 仍可见，但新代码优先 java.time�?
二��常用能�?1) 获取当前时间 now()
2) 格式�?DateTimeFormatter
3) 时间加减 plusDays/plusHours

三��练习题
1) 输出当前日期并格式化�?yyyy-MM-dd�?2) 计算 7 天后的日期��?*/
import java.time.LocalDate; // 本地日期�?import java.time.LocalDateTime; // 本地日期时间�?import java.time.format.DateTimeFormatter; // 格式化类

class DateTimeDemo { // 日期时间演示�?    public static void main(String[] args) { // 主方�?        LocalDate today = LocalDate.now(); // 获取今天日期
        LocalDate after7 = today.plusDays(7); // 计算7天后
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 定义格式
        LocalDateTime now = LocalDateTime.now(); // 获取当前日期时间
        System.out.println("today=" + today); // 输出今天
        System.out.println("after7=" + after7); // 输出7天后
        System.out.println("now=" + now.format(fmt)); // 按格式输出当前时�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// LocalDate d = LocalDate.now(); // 当前日期
// System.out.println(d.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); // 格式化输�?*/
// 由bhw设计
