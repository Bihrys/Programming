// 由bhw设计
/*
第一部分 第三章 第八节 Rust 生命周期

一、生命周期作用
1) 生命周期用于描述引用有效期关系。
2) 编译器借此防止悬垂引用。
3) 大多数场景可由编译器自动推导，复杂场景需显式标注。

二、经典函数
1) longest<'a>(x: &'a str, y: &'a str) -> &'a str
2) 表示返回引用生命周期不超过两个输入中较短者。

三、练习题
1) 写函数返回两个字符串切片中较长者。
2) 解释为何生命周期不改变“活得更久”，只是约束关系。
*/
fn longest<'a>(x: &'a str, y: &'a str) -> &'a str { // 显式生命周期参数
    if x.len() > y.len() { x } else { y } // 返回较长切片
}

fn main() {
    let s1 = String::from("rust"); // 创建字符串1
    let s2 = String::from("language"); // 创建字符串2
    let ans = longest(&s1, &s2); // 借用两个字符串切片
    println!("longest = {}", ans); // 输出结果
}

/*
练习题答案（注释版）
// fn choose<'a>(a: &'a str, b: &'a str) -> &'a str {
//     if a.is_empty() { b } else { a } // 返回某个输入引用
// }
*/
// 由bhw设计
