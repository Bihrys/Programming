// 由bhw设计
/*
第一部分 第三章 第七节 Rust 泛型与特性

一、泛型（Generics）
1) 用类型参数提高代码复用。
2) 常见写法：fn f<T>(x: T) -> T。

二、特性（Trait）
1) Trait 定义“行为接口”。
2) 不同类型实现同一 Trait，可统一调用。
3) 泛型可通过 trait bound 约束能力。

三、练习题
1) 写泛型函数返回较大值。
2) 定义 Printable trait 并为结构体实现。
*/
use std::fmt::Display; // 引入 Display trait

fn max_of_two<T: PartialOrd + Copy>(a: T, b: T) -> T { // 泛型 + trait 约束
    if a > b { a } else { b } // 返回较大值
}

trait Printable {
    fn print(&self); // 定义行为接口
}

struct User {
    name: String, // 字段
}

impl Printable for User {
    fn print(&self) {
        println!("User: {}", self.name); // 实现打印行为
    }
}

fn show_value<T: Display>(v: T) { // 约束 T 必须可显示
    println!("value = {}", v); // 输出泛型值
}

fn main() {
    println!("max = {}", max_of_two(10, 20)); // 泛型函数示例
    show_value("Rust trait demo"); // Display 约束示例
    let u = User { name: "bhw".to_string() }; // 创建结构体
    u.print(); // 调用 trait 方法
}

/*
练习题答案（注释版）
// trait Area { fn area(&self) -> f64; } // 定义面积特性
// struct Circle { r: f64 } // 圆结构体
// impl Area for Circle { fn area(&self) -> f64 { 3.14 * self.r * self.r } } // 实现特性
*/
// 由bhw设计
