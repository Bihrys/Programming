// 由bhw设计
/*
第一部分 第一章 第四节 Rust 输出到命令行

一、基础输出宏
1) println!：输出并换行。
2) print!：输出不换行。
3) eprintln!：输出到标准错误（常用于报错信息）。

二、格式化输出
1) {}：默认格式化。
2) {name}：命名参数。
3) {:?}：调试格式（类型需实现 Debug）。
4) {:.2}：控制浮点精度。

三、练习题
1) 输出你的名字、年龄、学习目标。
2) 输出一个浮点数并保留两位小数。
*/
#[derive(Debug)] // 自动实现 Debug，便于 {:?} 输出
struct User {
    name: String, // 姓名字段
    age: u8,      // 年龄字段
}

fn main() {
    let language = "Rust"; // 定义字符串变量
    let year = 2026; // 定义年份变量
    println!("我正在学习 {}，当前年份是 {}", language, year); // 占位符输出

    let pi = 3.1415926; // 定义浮点变量
    println!("PI 保留两位小数：{:.2}", pi); // 精度控制输出

    let u = User { // 创建结构体实例
        name: "bhw".to_string(), // 初始化 name
        age: 18, // 初始化 age
    };
    println!("调试输出用户：{:?}", u); // Debug 输出
    eprintln!("这是一条标准错误输出示例"); // 标准错误输出
}

/*
练习题答案（注释版）
// fn main() {
//     let name = "bhw"; // 名字
//     let age = 18; // 年龄
//     println!("我叫 {}，今年 {} 岁", name, age); // 基础输出
//     let score = 98.765; // 浮点数
//     println!("成绩：{:.2}", score); // 保留两位小数
// }
*/
// 由bhw设计
