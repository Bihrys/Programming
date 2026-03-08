// 由bhw设计
/*
第三部分 第三章 第一节 文档注释、实例、Java8、MySQL、Java9、测验、常用类库

一、Java 文档注释
1) 使用 /** */ 生成 API 文档。
2) 常用标签：@param @return @throws。

二、Java 实例（综合）
1) 小项目建议包含：输入、处理、输出、异常处理、日志。
2) 尽量分层：数据层、业务层、接口层。

三、Java 8 新特性
1) Lambda、Stream、Optional、java.time。

四、Java MySQL 连接
1) JDBC 流程：加载驱动 -> 建立连接 -> 预编译 SQL -> 执行 -> 关闭资源。
2) 强制使用 PreparedStatement 防注入。

五、Java 9 新特性
1) 模块系统 JPMS。
2) 集合工厂方法 List.of / Set.of / Map.of。

六、Java 测验（自测方向）
1) equals 与 == 差别？
2) 重载与重写差别？
3) HashMap 与 HashSet 关系？

七、Java 常用类库
1) 标准库：java.util、java.time、java.nio。
2) 常用三方：JUnit、Jackson、Lombok、Logback。

八、练习题
1) 用 Stream 过滤偶数并求和。
2) 写一段 JDBC 伪代码并标出防注入关键点。
3) 写出 5 个你后续要深入学习的 Java 库。
*/
import java.util.Arrays; // 数组工具
import java.util.List; // 列表接口

class EngineeringPracticeDemo { // 工程实践演示类
    /**
     * 计算两个整数和。
     * @param a 加数a
     * @param b 加数b
     * @return 和
     */
    static int add(int a, int b) { // 文档注释示例方法
        return a + b; // 返回和
    } // 方法结束

    public static void main(String[] args) { // 主方法
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6); // 示例数据
        int evenSum = nums.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum(); // Java8 Stream求和
        System.out.println("evenSum=" + evenSum); // 输出结果
        System.out.println("add(3,5)=" + add(3, 5)); // 调用文档方法
        System.out.println("JDBC 提示：优先 PreparedStatement。"); // MySQL实践提示
        System.out.println("Java9 提示：List.of(\"A\",\"B\") 可创建不可变集合。"); // Java9提示
        System.out.println("常用库：JUnit、Jackson、Lombok、SLF4J、Logback。"); // 类库提示
    } // main结束
} // 类结束

/*
练习题答案（注释版）
// List<Integer> a = Arrays.asList(1,2,3,4,5,6); // 数据
// int s = a.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum(); // 偶数和
// System.out.println(s); // 输出
//
// JDBC 防注入关键：
// String sql = "SELECT * FROM user WHERE id=?"; // 参数化SQL
// PreparedStatement ps = conn.prepareStatement(sql); // 预编译
// ps.setInt(1, id); // 绑定参数
*/
// 由bhw设计
