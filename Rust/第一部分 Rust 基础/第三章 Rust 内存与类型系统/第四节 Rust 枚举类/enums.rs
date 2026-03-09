// 由bhw设计
/*
第一部分 第三章 第四节 Rust 枚举类

一、枚举用途
1) 一个变量可取“有限个变体”之一。
2) 每个变体可携带不同类型的数据。
3) 常与 match 联用实现安全分支处理。

二、match 特性
1) 必须穷尽所有可能分支（或使用 _）。
2) 编译器帮助检查遗漏分支。

三、练习题
1) 定义 Coin 枚举并返回硬币面值。
2) 定义 Message 枚举并实现处理函数。
*/
enum Coin {
    Penny,   // 1 分
    Nickel,  // 5 分
    Dime,    // 10 分
    Quarter, // 25 分
}

fn value_in_cents(coin: Coin) -> u8 {
    match coin {
        Coin::Penny => 1, // 匹配 Penny
        Coin::Nickel => 5, // 匹配 Nickel
        Coin::Dime => 10, // 匹配 Dime
        Coin::Quarter => 25, // 匹配 Quarter
    }
}

fn main() {
    let c = Coin::Dime; // 创建枚举值
    println!("value = {}", value_in_cents(c)); // 输出面值
}

/*
练习题答案（注释版）
// enum IpAddrKind { V4, V6 } // 简单枚举
// let four = IpAddrKind::V4; // 创建枚举值
// match four {
//     IpAddrKind::V4 => println!("IPv4"), // 分支1
//     IpAddrKind::V6 => println!("IPv6"), // 分支2
// }
*/
// 由bhw设计
