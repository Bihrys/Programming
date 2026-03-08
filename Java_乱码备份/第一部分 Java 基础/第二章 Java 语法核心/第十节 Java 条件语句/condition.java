// 由bhw设计
/*
第一部分 第二�?第十�?Java 条件语句

丢�、if 基本形��?1) if
2) if-else
3) if-else if-else

二��边界意�?1) 成绩分段要从高到低判断，避免覆盖�?2) 条件表达式建议写清楚边界符号�?=�?）��?
三��练习题
1) 输入分数输出等级 A/B/C/D�?2) 输入整数判断正数、负数��零�?*/
class ConditionDemo { // 条件语句演示�?    public static void main(String[] args) { // 主方�?        int score = 86; // 测试分数
        if (score >= 90) { // 第一�?            System.out.println("A"); // 输出A
        } else if (score >= 80) { // 第二�?            System.out.println("B"); // 输出B
        } else if (score >= 60) { // 第三�?            System.out.println("C"); // 输出C
        } else { // 其余
            System.out.println("D"); // 输出D
        } // 分支结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int x = -3; // 测试�?// if (x > 0) System.out.println("正数"); // 分支1
// else if (x < 0) System.out.println("负数"); // 分支2
// else System.out.println("�?); // 分支3
*/
// 由bhw设计
