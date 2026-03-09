// 由bhw设计
/*
第一部分 第三章 第一节 Rust 所有权

一、所有权三规则
1) Rust 中每个值都有一个所有者。
2) 同一时刻一个值只能有一个所有者。
3) 所有者离开作用域，值被自动释放。

二、移动与克隆
1) 基本类型（实现 Copy）赋值是拷贝。
2) String 等堆数据赋值默认“移动”，原变量失效。
3) 想深拷贝用 clone()。

三、练习题
1) 演示 String 移动后原变量不能再用。
2) 使用 clone 保留两个可用字符串。
*/
fn main() {
    let s1 = String::from("hello"); // 创建堆字符串，s1 拥有它
    let s2 = s1; // 所有权移动到 s2，s1 失效
    println!("s2 = {}", s2); // 可用
    // println!("s1 = {}", s1); // 这一行会编译错误：s1 已失效

    let a = String::from("rust"); // 创建字符串 a
    let b = a.clone(); // 深拷贝，a 和 b 都可用
    println!("a = {}, b = {}", a, b); // 同时输出
}

/*
练习题答案（注释版）
// let x = String::from("abc"); // 创建字符串
// let y = x; // 所有权移动
// // println!("{}", x); // 编译错误：x 已失效
//
// let p = String::from("abc"); // 创建字符串
// let q = p.clone(); // 深拷贝
// println!("{}, {}", p, q); // 都可使用
*/
// 由bhw设计
