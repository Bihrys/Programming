// 由bhw设计
/*
第一部分 第二�?第十八节 Java 正则表达�?
丢�、正则作�?1) 描述字符串模式��?2) 常用于校验��提取��替捃6�9��?
二��常用类
1) Pattern：编译正�?2) Matcher：执行匹�?3) String.matches：快速校�?
三��练习题
1) 校验手机号（11位数字，�?弢�头）�?2) 提取文本中的扢�有数字片段��?*/
import java.util.regex.Matcher; // 匹配�?import java.util.regex.Pattern; // 模式对象

class RegexDemo { // 正则演示�?    public static void main(String[] args) { // 主方�?        String phone = "13812345678"; // 测试手机�?        boolean ok = phone.matches("^1\\d{10}$"); // 正则校验
        System.out.println("手机号合�? " + ok); // 输出校验结果

        String text = "订单A12，金�?00，编号B89"; // 待提取文�?        Matcher m = Pattern.compile("\\d+").matcher(text); // 匹配丢�个或多个数字
        while (m.find()) { // 逐个查找
            System.out.println("命中数字: " + m.group()); // 输出命中结果
        } // 循环结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// String id = "abc_123"; // 示例字符�?// boolean legal = id.matches("^[a-zA-Z0-9_]+$"); // 只允许字母数字下划线
// System.out.println(legal); // 输出校验结果
*/
// 由bhw设计
