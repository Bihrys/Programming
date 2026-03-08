// 由bhw设计
/*
第一部分 第二�?第十五节 Java StringBuffer

丢�、为仢�么要 StringBuffer / StringBuilder
1) String 不可变，频繁拼接会产生很多临时对象��?2) StringBuffer 可变，线程安全��?3) 单线程场景��常优先 StringBuilder（更快）�?
二��常用方�?1) append()
2) insert()
3) delete()
4) reverse()
5) toString()

三��练习题
1) �?StringBuffer 拼接 "I love Java"�?2) �?"abc123" 反转输出�?*/
class StringBufferDemo { // StringBuffer演示�?    public static void main(String[] args) { // 主方�?        StringBuffer sb = new StringBuffer(); // 创建可变字符串对�?        sb.append("I"); // 追加I
        sb.append(" love"); // 追加空格和love
        sb.append(" Java"); // 追加Java
        System.out.println(sb.toString()); // 输出拼接结果
        System.out.println(new StringBuffer("abc123").reverse()); // 反转输出
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// StringBuffer ans = new StringBuffer("abc123"); // 初始字符�?// ans.reverse(); // 反转
// System.out.println(ans); // 输出321cba
*/
// 由bhw设计
