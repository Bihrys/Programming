// 由bhw设计
/*
第一部分 第二�?第九�?Java 循环结构

丢�、循环类�?1) for：次数明确时优先�?2) while：条件控制型循环�?3) do-while：先执行后判断，至少执行丢�次��?
二��循环控�?1) break：跳出循环��?2) continue：跳过本轮��?
三��练习题
1) for 计算 1~100 的和�?2) while 输出 1~n 的偶数��?*/
class LoopDemo { // 循环演示�?    public static void main(String[] args) { // 主方�?        int sum = 0; // 累加�?        for (int i = 1; i <= 100; i++) { // for循环
            sum += i; // 累加
        } // for结束
        System.out.println("sum=" + sum); // 输出�?
        int k = 1; // while计数�?        while (k <= 10) { // 条件循环
            if (k % 2 == 0) { // 判断偶数
                System.out.print(k + " "); // 输出偶数
            } // if结束
            k++; // 更新计数�?        } // while结束
        System.out.println(); // 换行
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int n = 20; // 上限
// int i = 1; // 计数�?// while (i <= n) { // 循环条件
//     if (i % 2 == 0) System.out.print(i + " "); // 输出偶数
//     i++; // 更新
// } // 循环结束
*/
// 由bhw设计
