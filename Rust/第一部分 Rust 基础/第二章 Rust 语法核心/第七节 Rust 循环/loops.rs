// 由bhw设计
/*
第一部分 第二章 第七节 Rust 循环

一、Rust 三种循环
1) loop：无限循环，配合 break 退出。
2) while：条件为真时循环。
3) for：遍历区间、数组、迭代器最常用。

二、控制关键字
1) break：退出循环。
2) continue：跳过本轮，进入下一轮。

三、练习题
1) 使用 for 计算 1..=100 的和。
2) 使用 while 输出倒计时 3、2、1。
*/
fn main() {
    let mut counter = 0; // loop 计数器
    loop {
        counter += 1; // 每轮加一
        if counter == 3 {
            break; // 满足条件跳出
        }
    }
    println!("loop 结束，counter={}", counter); // 输出 loop 结果

    let mut number = 3; // while 倒计时变量
    while number != 0 {
        println!("{}!", number); // 输出当前值
        number -= 1; // 更新变量
    }

    let mut sum = 0; // for 求和变量
    for i in 1..=100 {
        sum += i; // 累加
    }
    println!("1..=100 的和是 {}", sum); // 输出求和结果
}

/*
练习题答案（注释版）
// for n in 1..4 {
//     println!("{}!", n); // 输出 1,2,3
// }
*/
// 由bhw设计
