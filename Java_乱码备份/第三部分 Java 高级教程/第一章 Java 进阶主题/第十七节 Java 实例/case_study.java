// 由bhw设计
/*
第三部分 第一�?第十七节 Java 实例

丢�、综合小案例：学生成绩管�?1) �?HashMap 存储 学号 -> 分数�?2) 支持新增、查诃6�9��更新��统计平均分�?
二��练习题
1) 增加“输出最高分学生”功能��?2) 增加“按学号排序输出”功能（可用 TreeMap）��?*/
import java.util.HashMap; // 哈希映射
import java.util.Map; // Map接口

class CaseStudyDemo { // 案例演示�?    public static void main(String[] args) { // 主方�?        Map<String, Integer> score = new HashMap<>(); // 创建成绩�?        score.put("S001", 90); // 添加学生成绩
        score.put("S002", 85); // 添加学生成绩
        score.put("S003", 96); // 添加学生成绩
        int sum = 0; // 总分变量
        for (int v : score.values()) sum += v; // 累加总分
        double avg = (double) sum / score.size(); // 平均�?        System.out.println("成绩�?" + score); // 输出成绩�?        System.out.println("平均�?" + avg); // 输出平均�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int max = -1; String who = ""; // 朢�高分记录
// for (Map.Entry<String,Integer> e : score.entrySet()) { // 遍历
//     if (e.getValue() > max) { max = e.getValue(); who = e.getKey(); } // 更新朢�大��?// } // 结束
*/
// 由bhw设计
