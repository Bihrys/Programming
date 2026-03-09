// 由bhw设计
/*
第一部分 第四章 第六节 Rust 智能指针

一、常见智能指针
1) Box<T>：把数据放到堆上。
2) Rc<T>：单线程引用计数共享所有权。
3) Arc<T>：多线程安全引用计数。
4) RefCell<T>：运行时借用检查（单线程内部可变性）。

二、使用建议
1) 能用普通引用就不用智能指针。
2) 需要共享所有权再考虑 Rc/Arc。
3) 需要可变共享时配合 Mutex/RefCell。

三、练习题
1) 用 Box 包装一个整数并输出。
2) 用 Rc 共享同一字符串并输出引用计数。
*/
use std::rc::Rc; // 单线程引用计数指针

fn main() {
    let b = Box::new(123); // Box 把值放堆上
    println!("Box value = {}", b); // 解引用输出

    let s = Rc::new(String::from("shared")); // 创建 Rc 字符串
    let s1 = Rc::clone(&s); // 增加一个共享引用
    let s2 = Rc::clone(&s); // 再增加一个共享引用
    println!("s1={}, s2={}", s1, s2); // 输出共享值
    println!("Rc strong_count = {}", Rc::strong_count(&s)); // 输出强引用计数
}

/*
练习题答案（注释版）
// let x = Rc::new(10); // 创建 Rc
// let y = Rc::clone(&x); // 克隆 Rc 指针
// println!("{}", Rc::strong_count(&x)); // 输出计数
*/
// 由bhw设计
