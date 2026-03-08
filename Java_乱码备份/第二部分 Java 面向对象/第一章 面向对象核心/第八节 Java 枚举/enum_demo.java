// 由bhw设计
/*
第二部分 第一�?第八�?Java 枚举

丢�、枚举是仢��?1) 枚举用于限定取��范围，避免魔法字符串��?2) 枚举可有字段、构造方法��成员方法��?
二��常见场�?1) 订单状����支付状态��星期��权限等级��?2) 通过 switch 配合枚举更安全清晰��?
三��练习题
1) 定义订单状��枚举：CREATED、PAID、CANCELLED�?2) 为枚举增加中文描述字段��?*/
enum JuiceSize { // 枚举类型
    SMALL, MEDIUM, LARGE // 三个固定取��?}

class EnumDemo { // 测试�?    public static void main(String[] args) { // 主方�?        JuiceSize size = JuiceSize.MEDIUM; // 使用枚举�?        switch (size) { // 按枚举分�?            case SMALL: System.out.println("小杯"); break; // 分支1
            case MEDIUM: System.out.println("中杯"); break; // 分支2
            case LARGE: System.out.println("大杯"); break; // 分支3
            default: System.out.println("未知"); // 兜底
        } // switch结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// enum OrderStatus { CREATED, PAID, CANCELLED } // 订单状��枚�?*/
// 由bhw设计
