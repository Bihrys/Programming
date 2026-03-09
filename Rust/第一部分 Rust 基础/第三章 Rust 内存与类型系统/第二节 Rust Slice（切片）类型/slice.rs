// 由bhw设计
/*
第一部分 第三章 第二节 Rust Slice（切片）类型

一、切片定义
1) 切片是对连续内存区域的“只读视图”。
2) 字符串切片类型是 &str。
3) 数组切片类型是 &[T]。

二、切片作用
1) 避免复制数据，提升效率。
2) 与所有权系统协作，保证引用安全。

三、练习题
1) 从字符串取出第一个单词切片。
2) 对数组取子区间切片并求和。
*/
fn first_word(s: &str) -> &str {
    let bytes = s.as_bytes(); // 获取字节切片
    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return &s[0..i]; // 遇空格返回前半切片
        }
    }
    s // 没空格则返回整串切片
}

fn main() {
    let text = String::from("rust language"); // 创建 String
    let w = first_word(&text); // 传入字符串切片
    println!("first word = {}", w); // 输出第一个单词

    let arr = [10, 20, 30, 40, 50]; // 定义数组
    let part = &arr[1..4]; // 获取切片 [20,30,40]
    let sum: i32 = part.iter().sum(); // 切片求和
    println!("slice sum = {}", sum); // 输出切片和
}

/*
练习题答案（注释版）
// let s = "hello rust"; // 字符串切片
// let h = &s[0..5]; // 取 "hello"
// println!("{}", h); // 输出
*/
// 由bhw设计
