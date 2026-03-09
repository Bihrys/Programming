// 由bhw设计
/*
第一部分 第二章 第三节 Rust 数据类型

一、标量类型
1) 整数：i8/i16/i32/i64/i128/isize 与 u8/u16/u32/u64/u128/usize
2) 浮点：f32/f64
3) 布尔：bool（true/false）
4) 字符：char（单个 Unicode 标量值）

二、复合类型
1) 元组 tuple：固定长度，可不同类型。
2) 数组 array：固定长度，同类型。

三、练习题
1) 定义一个 tuple，包含姓名、年龄、是否在读。
2) 定义一个长度为5的整数数组并输出第3个元素。
*/
fn main() {
    let x: i32 = 42; // 有符号 32 位整数
    let y: u32 = 100; // 无符号 32 位整数
    let pi: f64 = 3.1415926; // 64 位浮点数
    let is_ok: bool = true; // 布尔值
    let ch: char = 'R'; // 字符
    println!("x={}, y={}, pi={}, is_ok={}, ch={}", x, y, pi, is_ok, ch); // 输出标量

    let person: (&str, u8, bool) = ("bhw", 18, true); // 定义元组
    println!("tuple = ({}, {}, {})", person.0, person.1, person.2); // 按索引访问元组

    let arr: [i32; 5] = [10, 20, 30, 40, 50]; // 定义长度5的整型数组
    println!("arr[2] = {}", arr[2]); // 输出数组第3个元素（下标2）
}

/*
练习题答案（注释版）
// let info = ("小明", 16u8, false); // 姓名、年龄、是否在读
// println!("{:?}", info); // 调试输出元组
// let nums = [1, 2, 3, 4, 5]; // 整数数组
// println!("{}", nums[2]); // 输出第3个元素
*/
// 由bhw设计
