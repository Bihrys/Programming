// 由bhw设计
/*
第一部分 第二�?第六�?Java 变量命名规则

丢�、标识符规则
1) 首字符可为字母��下划线�?�?2) 后续字符可为字母、数字��下划线�?�?3) 不能以数字开头，不能是关键字�?4) Java 大小写敏感��?
二��命名规范（工程可读性）
1) 变量/方法：小驼峰，如 totalScore�?2) 类名：大驼峰，如 StudentService�?3) 常量：全大写加下划线，如 MAX_SIZE�?
三��练习题
1) 判断以下命名是否合法：_x, 9abc, total$, class�?2) �?bad_name_style 改成推荐风格�?*/
class NamingRulesDemo { // 命名规则演示�?    static final int MAX_SIZE = 100; // 常量命名：全大写+下划�?    int totalScore = 0; // 变量命名：小驼峰

    void addScore(int deltaScore) { // 方法名小驼峰，参数小驼峰
        totalScore += deltaScore; // 更新成员变量
    } // 方法结束

    public static void main(String[] args) { // 主方�?        NamingRulesDemo demo = new NamingRulesDemo(); // 创建对象
        demo.addScore(30); // 调用方法
        System.out.println("totalScore=" + demo.totalScore + ", MAX_SIZE=" + MAX_SIZE); // 输出结果
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) 合法：_x、total$；非法：9abc、class（关键字）��?2) bad_name_style 可改�?badNameStyle �?betterNameStyle�?*/
// 由bhw设计
