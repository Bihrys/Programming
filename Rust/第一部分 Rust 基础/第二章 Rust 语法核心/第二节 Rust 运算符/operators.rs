// 由bhw设计
/*
第一部分 第二章 第二节 Rust 运算符

一、常见运算符
1) 算术：+ - * / %
2) 关系：== != > < >= <=
3) 逻辑：&& || !
4) 赋值：= += -= *= /= %=

二、类型与运算注意
1) Rust 不做隐式类型转换。
2) 整数除法会截断小数。
3) 比较运算返回 bool。

三、练习题
1) 计算矩形面积与周长。
2) 判断一个数是否在 [10, 100] 范围内。
*/
fn main() {
    let a: i32 = 17; // 定义整数 a
    let b: i32 = 5; // 定义整数 b
    println!("a + b = {}", a + b); // 加法
    println!("a - b = {}", a - b); // 减法
    println!("a * b = {}", a * b); // 乘法
    println!("a / b = {}", a / b); // 整数除法
    println!("a % b = {}", a % b); // 取余

    let in_range = a >= 10 && a <= 100; // 逻辑与判断区间
    println!("a 在 [10,100] 范围内吗？{}", in_range); // 输出布尔判断
}

/*
练习题答案（注释版）
// let length = 8; // 长
// let width = 3; // 宽
// let area = length * width; // 面积
// let perimeter = 2 * (length + width); // 周长
// println!("面积={}, 周长={}", area, perimeter); // 输出结果
*/
// 由bhw设计
