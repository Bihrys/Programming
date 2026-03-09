// 由bhw设计
/*
第一部分 第三章 第六节 Rust 错误处理

一、两类错误模型
1) 可恢复错误：Result<T, E>。
2) 不可恢复错误：panic!（程序终止）。

二、Option 与 Result
1) Option<T>：值可能存在也可能不存在（Some/None）。
2) Result<T,E>：操作可能成功（Ok）或失败（Err）。

三、常用写法
1) match 显式处理分支。
2) ? 运算符向上返回错误。
3) unwrap/expect 只适合你非常确定不会失败的场景。

四、练习题
1) 写一个除法函数，除数为0返回 Err。
2) 用 Option 实现安全索引访问。
*/
fn divide(a: i32, b: i32) -> Result<i32, String> {
    if b == 0 {
        Err("除数不能为0".to_string()) // 返回错误信息
    } else {
        Ok(a / b) // 返回成功结果
    }
}

fn get_element(index: usize, arr: &[i32]) -> Option<i32> {
    if index < arr.len() {
        Some(arr[index]) // 索引有效
    } else {
        None // 索引越界
    }
}

fn main() {
    match divide(10, 2) {
        Ok(v) => println!("10/2 = {}", v), // 处理成功
        Err(e) => println!("错误：{}", e), // 处理失败
    }

    let nums = [10, 20, 30]; // 测试数组
    println!("index 1 => {:?}", get_element(1, &nums)); // Some
    println!("index 5 => {:?}", get_element(5, &nums)); // None
}

/*
练习题答案（注释版）
// fn safe_div(a: i32, b: i32) -> Result<i32, String> {
//     if b == 0 { Err("zero".to_string()) } else { Ok(a / b) } // 安全除法
// }
*/
// 由bhw设计
