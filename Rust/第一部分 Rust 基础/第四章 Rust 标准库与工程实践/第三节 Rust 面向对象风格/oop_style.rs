// 由bhw设计
/*
第一部分 第四章 第三节 Rust 面向对象风格

一、Rust 不是传统 OOP，但支持 OOP 风格
1) 用 struct 表达数据。
2) 用 impl 表达方法。
3) 用 trait 表达接口抽象（类似“能力契约”）。

二、组合优于继承
1) Rust 没有传统类继承体系。
2) 更常用组合 + trait 多态实现复用。

三、练习题
1) 定义 Animal trait，让 Dog 和 Cat 实现 speak。
2) 用 Vec<Box<dyn Animal>> 统一调用多态行为。
*/
trait Animal {
    fn speak(&self); // 定义行为接口
}

struct Dog; // 狗类型
struct Cat; // 猫类型

impl Animal for Dog {
    fn speak(&self) {
        println!("Dog: 汪汪"); // 狗叫
    }
}

impl Animal for Cat {
    fn speak(&self) {
        println!("Cat: 喵喵"); // 猫叫
    }
}

fn main() {
    let animals: Vec<Box<dyn Animal>> = vec![Box::new(Dog), Box::new(Cat)]; // trait 对象多态集合
    for a in animals {
        a.speak(); // 动态分发调用
    }
}

/*
练习题答案（注释版）
// struct Person { name: String } // 数据
// impl Person { fn hello(&self) { println!("{}", self.name); } } // 方法
*/
// 由bhw设计
