// 由bhw设计
/*
第一部分 第二章 第六节 Rust 条件语句

一、if 条件表达式
1) Rust 的 if 是表达式，可直接产生值。
2) 条件必须是 bool，不能用整数替代布尔。

二、常见写法
1) if / else if / else 多分支。
2) let x = if cond { v1 } else { v2 }; 条件赋值。

三、练习题
1) 输入分数输出等级 A/B/C/D（可先写固定值）。
2) 用 if 表达式给变量赋“奇数/偶数”标签。
*/
fn main() {
    let score = 86; // 模拟输入分数
    if score >= 90 {
        println!("等级 A"); // 第一档
    } else if score >= 80 {
        println!("等级 B"); // 第二档
    } else if score >= 60 {
        println!("等级 C"); // 第三档
    } else {
        println!("等级 D"); // 第四档
    }

    let n = 7; // 测试整数
    let tag = if n % 2 == 0 { "偶数" } else { "奇数" }; // if 表达式赋值
    println!("{} 是 {}", n, tag); // 输出结果
}

/*
练习题答案（注释版）
// let x = 12; // 测试值
// let kind = if x % 2 == 0 { "偶数" } else { "奇数" }; // 条件赋值
// println!("{}", kind); // 输出
*/
// 由bhw设计
