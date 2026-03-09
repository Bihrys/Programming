// 由bhw设计
/*
第一部分 第一章 第三节 Cargo 教程

一、Cargo 是什么
1) Cargo 是 Rust 官方构建与包管理工具。
2) 它统一处理：创建项目、依赖管理、编译、测试、发布、文档。

二、常用命令
1) cargo new demo：创建新项目。
2) cargo build：编译项目（调试版）。
3) cargo run：编译并运行。
4) cargo test：执行测试。
5) cargo check：快速语义检查（不生成可执行文件）。
6) cargo build --release：发布版构建。

三、Cargo.toml 核心
1) [package]：项目元信息（name/version/edition）。
2) [dependencies]：第三方依赖。
3) 版本建议使用语义化版本规则。

四、练习题
1) 创建一个 hello_cargo 项目并运行。
2) 在 Cargo.toml 添加 rand 依赖并解释它的用途。
*/
fn main() {
    println!("Cargo 让 Rust 工程化开发非常高效。"); // 输出介绍
    println!("常用命令：new/build/run/test/check。"); // 输出命令集合
}

/*
练习题答案（注释版）
1) 命令流程：
   cargo new hello_cargo
   cd hello_cargo
   cargo run
2) rand 依赖用于随机数生成，常见于模拟、抽样、游戏逻辑。

// fn main() {
//     println!("cargo run 会先编译再执行"); // 答案说明
// }
*/
// 由bhw设计
