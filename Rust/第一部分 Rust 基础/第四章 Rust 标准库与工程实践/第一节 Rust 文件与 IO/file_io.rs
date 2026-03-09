// 由bhw设计
/*
第一部分 第四章 第一节 Rust 文件与 IO

一、常见文件 IO API
1) std::fs::read_to_string：读文本文件。
2) std::fs::write：写文本文件。
3) std::fs::File + std::io::Read/Write：更细粒度控制。

二、错误处理
1) 文件操作常返回 Result。
2) 可用 ? 运算符向上传播错误。

三、练习题
1) 写入文件 hello.txt 再读取并输出。
2) 处理文件不存在错误并打印友好提示。
*/
use std::fs; // 引入文件模块

fn main() -> Result<(), Box<dyn std::error::Error>> { // 返回 Result 便于用 ?
    let path = "rust_io_demo.txt"; // 文件路径
    fs::write(path, "Hello Rust File IO!")?; // 写入文本
    let content = fs::read_to_string(path)?; // 读取文本
    println!("读取内容：{}", content); // 输出文件内容
    Ok(()) // 返回成功
}

/*
练习题答案（注释版）
// use std::fs;
// fn main() {
//     let result = fs::read_to_string("not_exist.txt"); // 尝试读取不存在文件
//     match result {
//         Ok(c) => println!("{}", c), // 成功分支
//         Err(e) => println!("读取失败：{}", e), // 失败分支
//     }
// }
*/
// 由bhw设计
