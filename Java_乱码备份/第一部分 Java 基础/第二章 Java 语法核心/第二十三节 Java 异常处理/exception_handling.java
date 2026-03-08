// 由bhw设计
/*
第一部分 第二�?第二十三�?Java 异常处理

丢�、异常处理结�?1) try：放可能出错的代码��?2) catch：捕获并处理异常�?3) finally：无论是否异常都执行（常用于资源释放）��?4) throw / throws：主动抛出��声明异常��?
二��初学��重�?1) 不要吞异常，至少记录错误信息�?2) 区分可恢复异常与不可恢复异常�?3) 优先使用具体异常类型，��不是直�?Exception�?
三��练习题
1) 写除法程序，处理除数�?�?2) 写一个方法，参数为负数时�?IllegalArgumentException�?*/
class ExceptionHandlingDemo { // 异常演示�?    static int divide(int a, int b) { // 定义除法方法
        if (b == 0) { // 非法参数判断
            throw new IllegalArgumentException("除数不能�?"); // 主动抛出异常
        } // if结束
        return a / b; // 返回�?    } // 方法结束

    public static void main(String[] args) { // 主方�?        try { // 尝试执行风险代码
            System.out.println(divide(10, 2)); // 正常调用
            System.out.println(divide(10, 0)); // 触发异常
        } catch (IllegalArgumentException e) { // 捕获特定异常
            System.out.println("参数错误: " + e.getMessage()); // 输出错误信息
        } finally { // 朢�终一定执�?            System.out.println("程序结束�?); // 收尾输出
        } // try-catch-finally结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// static void checkPositive(int x) { // 棢�查方�?//     if (x < 0) throw new IllegalArgumentException("必须是非负数"); // 抛异�?// } // 结束
*/
// 由bhw设计
