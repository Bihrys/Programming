// 由bhw设计
/*
第一部分 第四章 第七节 Rust 异步编程

一、异步核心概念
1) async fn 返回 Future，不会立即执行。
2) await 用于等待 Future 完成。
3) 异步运行需要执行器（runtime），如 tokio/async-std。

二、学习重点
1) 区分“并发”与“并行”。
2) 理解 async/await 只是语法糖，底层是状态机。
3) 网络 IO 场景异步优势明显。

三、练习题
1) 写一个 async 函数返回问候语。
2) 解释为什么仅写 async fn 还不能直接运行。
*/
fn main() {
    println!("本节讲 async 语法与原理，完整运行需 async runtime。"); // 输出说明
    println!("示例：需要 tokio::main 或其他执行器驱动 Future。"); // 输出说明
}

/*
练习题答案（注释版）
// // 以下代码示意，需在 Cargo.toml 加 tokio 依赖才能运行
// // [dependencies]
// // tokio = { version = "1", features = ["full"] }
// //
// // async fn hello() -> String {
// //     "hello async rust".to_string() // 返回异步结果
// // }
// //
// // #[tokio::main]
// // async fn main() {
// //     let msg = hello().await; // 等待 Future 完成
// //     println!("{}", msg); // 输出结果
// // }
*/
// 由bhw设计
