// 由bhw设计
/*
第一部分 第二�?第十丢��?Java switch case

丢�、��用场景
1) 离散值分支判断（如菜单编号��星期编号）�?2) 可读性��常好于多重 if-else�?
二��注意事�?1) 记得�?break，避免贯穿��?2) default 作为兜底逻辑�?3) 新版�?Java 支持 switch 表达式（后续可扩展）�?
三��练习题
1) 输入 1~7 输出星期�?2) 输入运算符执行简单计算��?*/
class SwitchCaseDemo { // switch演示�?    public static void main(String[] args) { // 主方�?        int day = 3; // 测试输入
        switch (day) { // 分支匹配
            case 1: System.out.println("星期丢�"); break; // case1
            case 2: System.out.println("星期�?); break; // case2
            case 3: System.out.println("星期�?); break; // case3
            case 4: System.out.println("星期�?); break; // case4
            case 5: System.out.println("星期�?); break; // case5
            case 6: System.out.println("星期�?); break; // case6
            case 7: System.out.println("星期�?); break; // case7
            default: System.out.println("输入无效"); break; // 兜底
        } // switch结束
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// char op = '+'; // 运算�?// int a = 6, b = 2; // 两个�?// switch (op) { // 分支
//     case '+': System.out.println(a + b); break; // �?//     case '-': System.out.println(a - b); break; // �?//     case '*': System.out.println(a * b); break; // �?//     case '/': System.out.println(b == 0 ? "除数不能�?" : a / b); break; // �?//     default: System.out.println("未知运算�?); // 兜底
// } // 结束
*/
// 由bhw设计
