// 由bhw设计
/*
第一部分 第四章 第一节 运算符、循环、条件、switch

一、运算符
1) 算术：+ - * / %
2) 关系：> < >= <= == !=
3) 逻辑：&& || !
4) 赋值：= += -= *= /=

二、循环结构
1) for：次数明确。
2) while：条件明确。
3) do-while：至少执行一次。

三、条件与分支
1) if / else if / else：范围判断。
2) switch case：离散值分支判断。

四、练习题
1) 计算 1~100 的和。
2) 输入分数输出等级。
3) 输入 1~7 输出星期。
*/
class ControlFlowDemo { // 流程控制演示类
    public static void main(String[] args) { // 主方法
        int sum = 0; // 累加器
        for (int i = 1; i <= 100; i++) { // for循环
            sum += i; // 累加
        } // 循环结束
        System.out.println("1~100和=" + sum); // 输出结果

        int score = 86; // 示例分数
        if (score >= 90) { // 分支1
            System.out.println("A"); // 输出A
        } else if (score >= 80) { // 分支2
            System.out.println("B"); // 输出B
        } else if (score >= 60) { // 分支3
            System.out.println("C"); // 输出C
        } else { // 分支4
            System.out.println("D"); // 输出D
        } // if结束

        int day = 3; // 示例星期编号
        switch (day) { // switch分支
            case 1: System.out.println("星期一"); break; // 分支1
            case 2: System.out.println("星期二"); break; // 分支2
            case 3: System.out.println("星期三"); break; // 分支3
            case 4: System.out.println("星期四"); break; // 分支4
            case 5: System.out.println("星期五"); break; // 分支5
            case 6: System.out.println("星期六"); break; // 分支6
            case 7: System.out.println("星期日"); break; // 分支7
            default: System.out.println("无效输入"); break; // 兜底
        } // switch结束
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// int n = 20; // 上限
// int i = 1; // 计数器
// while (i <= n) { // while循环
//     if (i % 2 == 0) System.out.print(i + " "); // 输出偶数
//     i++; // 更新计数器
// } // 循环结束
*/
// 由bhw设计
