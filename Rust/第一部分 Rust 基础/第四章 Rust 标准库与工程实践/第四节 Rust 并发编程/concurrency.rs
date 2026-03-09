// 由bhw设计
/*
第一部分 第四章 第四节 Rust 并发编程

一、并发核心工具
1) std::thread：创建线程。
2) mpsc channel：线程间消息传递。
3) Arc + Mutex：共享状态并发控制。

二、并发安全优势
1) 编译器在编译期限制危险并发用法。
2) 借用规则降低数据竞争概率。

三、练习题
1) 创建两个线程分别输出 1..=3。
2) 用 channel 把子线程消息发给主线程。
*/
use std::sync::mpsc; // 多生产者单消费者通道
use std::thread; // 线程库

fn main() {
    let (tx, rx) = mpsc::channel(); // 创建通道

    let t = thread::spawn(move || { // 创建子线程并 move 捕获发送端
        for i in 1..=3 {
            tx.send(format!("子线程消息 {}", i)).unwrap(); // 发送消息
        }
    });

    for msg in rx { // 主线程接收直到通道关闭
        println!("主线程收到：{}", msg); // 输出消息
    }

    t.join().unwrap(); // 等待子线程结束
}

/*
练习题答案（注释版）
// use std::thread;
// let h = thread::spawn(|| println!("hello from thread")); // 创建线程
// h.join().unwrap(); // 等待线程结束
*/
// 由bhw设计
