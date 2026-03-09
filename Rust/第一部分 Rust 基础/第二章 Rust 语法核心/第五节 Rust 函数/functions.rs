// 由bhw设计
/*
第一部分 第二章 第五节 Rust 函数

一、函数定义
1) 用 fn 关键字定义函数。
2) 参数必须标注类型。
3) 返回类型用 -> 指定。

二、返回值规则
1) 最后一行表达式无分号，作为返回值。
2) 也可以显式使用 return。
3) 无返回值时返回类型是 ()（空元组）。

三、练习题
1) 写函数 max2(a,b) 返回较大值。
2) 写函数 sum_to_n(n) 返回 1..=n 的和。
*/
fn add(a: i32, b: i32) -> i32 {
    a + b // 无分号，表达式值作为返回值
}

fn square(x: i32) -> i32 {
    return x * x; // 显式 return 方式
}

fn print_line() {
    println!("这是一个无返回值函数"); // 返回 ()
}

fn main() {
    println!("add(2,3) = {}", add(2, 3)); // 调用 add
    println!("square(6) = {}", square(6)); // 调用 square
    print_line(); // 调用无返回值函数
}

/*
练习题答案（注释版）
// fn max2(a: i32, b: i32) -> i32 {
//     if a > b { a } else { b } // 条件表达式返回值
// }
//
// fn sum_to_n(n: i32) -> i32 {
//     let mut s = 0; // 累加器
//     for i in 1..=n { s += i; } // 累加
//     s // 返回和
// }
*/
// 由bhw设计
