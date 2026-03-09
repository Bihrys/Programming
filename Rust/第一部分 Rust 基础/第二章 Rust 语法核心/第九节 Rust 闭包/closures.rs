// 由bhw设计
/*
第一部分 第二章 第九节 Rust 闭包

一、闭包是什么
1) 闭包是可捕获环境变量的匿名函数。
2) 语法：|参数| 表达式 或 |参数| { 代码块 }。
3) 常用于迭代器、回调、延迟执行。

二、捕获方式
1) 借用捕获：默认尽量借用。
2) 可变借用捕获：修改外部变量。
3) move 捕获：转移所有权到闭包。

三、练习题
1) 定义闭包实现两数求和。
2) 用闭包把向量每个元素加 1。
*/
fn main() {
    let add = |a: i32, b: i32| a + b; // 定义加法闭包
    println!("add(2,3) = {}", add(2, 3)); // 调用闭包

    let mut nums = vec![1, 2, 3]; // 创建可变向量
    nums.iter_mut().for_each(|x| *x += 1); // 闭包修改每个元素
    println!("nums = {:?}", nums); // 输出修改结果

    let text = String::from("Rust"); // 外部变量
    let show = move || println!("move 捕获：{}", text); // move 转移所有权
    show(); // 调用闭包
}

/*
练习题答案（注释版）
// let mul = |x: i32, y: i32| x * y; // 乘法闭包
// println!("{}", mul(4, 5)); // 输出 20
*/
// 由bhw设计
