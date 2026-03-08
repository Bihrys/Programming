// 由bhw设计
/*
第一部分 第二�?第十六节 Java 数组

丢�、数组基硢�
1) 数组是同类型元素的有序集合��?2) 数组长度固定：创建后 length 不可变��?3) 下标�?0 弢�始��?
二��常见操�?1) 声明与初始化
2) 遍历（for、增�?for�?3) 求和、求朢�大��?
三��练习题
1) 计算数组元素总和与平均����?2) 在数组中查找指定值并输出下标�?*/
class ArrayDemo { // 数组演示�?    public static void main(String[] args) { // 主方�?        int[] arr = {3, 8, 2, 9, 5}; // 定义并初始化数组
        int sum = 0; // 求和变量
        int max = arr[0]; // 假设第一个最�?        for (int v : arr) { // 增强for遍历
            sum += v; // 累加
            if (v > max) max = v; // 更新朢�大��?        } // 循环结束
        double avg = (double) sum / arr.length; // 计算平均�?        System.out.println("sum=" + sum + ", avg=" + avg + ", max=" + max); // 输出结果
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int target = 9; // 目标�?// int idx = -1; // 默认未找�?// for (int i = 0; i < arr.length; i++) { // 下标遍历
//     if (arr[i] == target) { idx = i; break; } // 找到就记录并逢��?// } // 循环结束
// System.out.println(idx); // 输出下标�?1
*/
// 由bhw设计
