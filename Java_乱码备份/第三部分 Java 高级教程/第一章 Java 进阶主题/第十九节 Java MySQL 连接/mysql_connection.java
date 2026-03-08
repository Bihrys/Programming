// 由bhw设计
/*
第三部分 第一�?第十九节 Java MySQL 连接

丢�、基本步�?1) 引入 MySQL JDBC 驱动�?2) 通过 DriverManager 获取连接�?3) 执行 SQL（PreparedStatement 推荐）��?4) 关闭资源（Connection/Statement/ResultSet）��?
二��安全重�?1) 使用 PreparedStatement �?SQL 注入�?2) 连接信息走配置，不写死源码��?
三��练习题
1) 查询 student 表全部数据��?2) �?id 参数查询单条记录�?*/
class MySQLConnectionGuide { // MySQL连接说明�?    public static void main(String[] args) { // 主方�?        System.out.println("示例URL: jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC"); // 输出URL样例
        System.out.println("推荐使用 PreparedStatement 绑定参数�?); // 输出安全建议
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// String sql = "SELECT * FROM student WHERE id=?"; // 参数化SQL
// PreparedStatement ps = conn.prepareStatement(sql); // 预编�?// ps.setInt(1, id); // 绑定参数
*/
// 由bhw设计
