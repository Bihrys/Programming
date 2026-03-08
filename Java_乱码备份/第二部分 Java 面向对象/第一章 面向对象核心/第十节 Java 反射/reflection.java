// 由bhw设计
/*
第二部分 第一�?第十�?Java 反射

丢�、反射是仢��?1) 运行时获取类信息并操作类成员（字段��方法��构造器）��?2) 框架常用：依赖注入��ORM、注解处理等�?
二��反射风�?1) 性能弢�锢�高于直接调用�?2) 破坏封装边界，滥用会让代码难维护�?3) 私有成员反射访问霢�谨慎�?
三��练习题
1) 通过 Class.forName 获取类对象��?2) 反射调用丢�个无参方法��?*/
import java.lang.reflect.Method; // 反射方法�?
class ReflectionTarget { // 目标�?    public void sayHi() { // 被反射调用的方法
        System.out.println("反射调用成功"); // 输出
    } // 方法结束
}

class ReflectionDemo { // 反射演示�?    public static void main(String[] args) throws Exception { // 主方法，抛出异常箢�化演�?        Class<?> clazz = Class.forName("ReflectionTarget"); // 通过类名获取Class对象
        Object obj = clazz.getDeclaredConstructor().newInstance(); // 反射创建实例
        Method m = clazz.getMethod("sayHi"); // 获取公开方法
        m.invoke(obj); // 反射调用方法
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// Class<?> c = ReflectionTarget.class; // 直接拿Class对象
// System.out.println(c.getName()); // 打印类全�?*/
// 由bhw设计
