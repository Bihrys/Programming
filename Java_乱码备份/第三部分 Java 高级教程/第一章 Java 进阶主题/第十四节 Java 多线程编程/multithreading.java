// 由bhw设计
/*
第三部分 第一�?第十四节 Java 多线程编�?
丢�、线程创建方�?1) 继承 Thread�?2) 实现 Runnable（更推荐）��?3) 使用线程�?ExecutorService（生产推荐）�?
二��并发关键点
1) 共享数据霢�同步（synchronized/Lock）��?2) 避免竞��条件和死锁�?3) 优先无共享或不可变设计��?
三��练习题
1) 创建两个线程分别输出 1~5�?2) �?synchronized 保护共享计数器��?*/
class CounterTask implements Runnable { // 任务�?    private final String name; // 任务名称
    CounterTask(String name) { this.name = name; } // 构��?
    public void run() { // 线程执行�?        for (int i = 1; i <= 5; i++) { // 循环输出
            System.out.println(name + ":" + i); // 打印线程名和计数
        } // 循环结束
    } // run结束
}

class MultithreadingDemo { // 多线程演示类
    public static void main(String[] args) { // 主方�?        Thread t1 = new Thread(new CounterTask("T1")); // 创建线程1
        Thread t2 = new Thread(new CounterTask("T2")); // 创建线程2
        t1.start(); // 启动线程1
        t2.start(); // 启动线程2
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// synchronized(this) { count++; } // 同步更新共享变量
*/
// 由bhw设计
