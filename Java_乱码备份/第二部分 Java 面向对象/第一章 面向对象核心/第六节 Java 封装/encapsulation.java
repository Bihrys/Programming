// 由bhw设计
/*
第二部分 第一�?第六�?Java 封装

丢�、封装��想
1) 字段私有化（private）��?2) 通过 getter/setter 控制访问�?3) �?setter 中做数据校验，保证对象状态合法��?
二��练习题
1) 封装丢��?BankAccount，余额不能为负��?2) 对年龄字段设�?0~150 的合法校验��?*/
class BankAccount { // 银行账户�?    private double balance; // 私有余额字段

    public double getBalance() { // 读接�?        return balance; // 返回余额
    } // 方法结束

    public void deposit(double amount) { // 存款接口
        if (amount > 0) balance += amount; // 校验后更�?    } // 方法结束

    public boolean withdraw(double amount) { // 取款接口
        if (amount > 0 && amount <= balance) { // 合法校验
            balance -= amount; // 扣减余额
            return true; // 表示成功
        } // 条件结束
        return false; // 失败
    } // 方法结束
}

class EncapsulationDemo { // 测试�?    public static void main(String[] args) { // 主方�?        BankAccount acc = new BankAccount(); // 创建账户
        acc.deposit(200); // 存款
        System.out.println(acc.withdraw(50)); // 尝试取款
        System.out.println("balance=" + acc.getBalance()); // 查看余额
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// private int age; // 私有年龄
// public void setAge(int age) { if (age >= 0 && age <= 150) this.age = age; } // 校验设置
*/
// 由bhw设计
