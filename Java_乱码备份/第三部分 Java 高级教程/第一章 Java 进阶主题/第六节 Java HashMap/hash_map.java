// 由bhw设计
/*
第三部分 第一�?第六�?Java HashMap

丢�、特�?1) 键��对存储�?2) 键唯丢�，��可重复�?3) 平均查询效率高��?
二��练习题
1) 存储三名同学成绩并输出��?2) 判断�?key 是否存在�?*/
import java.util.HashMap; // HashMap�?import java.util.Map; // Map接口

class HashMapDemo { // HashMap演示�?    public static void main(String[] args) { // 主方�?        Map<String, Integer> score = new HashMap<>(); // 创建映射
        score.put("Alice", 95); // 添加键��?        score.put("Bob", 88); // 添加键��?        score.put("Cindy", 92); // 添加键��?        System.out.println(score); // 输出映射
        System.out.println("Bob=" + score.get("Bob")); // 按键读取
        System.out.println(score.containsKey("Alice")); // 判断键存�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// for (Map.Entry<String, Integer> e : score.entrySet()) { // 遍历键��对
//     System.out.println(e.getKey() + ":" + e.getValue()); // 输出
// } // 结束
*/
// 由bhw设计
