// 由bhw设计
/*
第一部分 第一章 第二节 Rust 环境搭建

一、安装方式
1) 推荐使用 rustup 安装 Rust 工具链。
2) rustup 可管理稳定版、beta、nightly 多工具链。
3) 安装完成后自动包含 rustc、cargo、rustfmt 等常用工具。

二、Windows 常见步骤
1) 下载并运行 rustup-init 安装程序。
2) 默认安装完成后重启终端。
3) 验证命令：
   rustc --version
   cargo --version
   rustup --version

三、工具链和目标平台
1) rustup show：查看当前工具链。
2) rustup default stable：切换默认稳定版。
3) rustup target add x86_64-unknown-linux-gnu：添加目标平台。

四、编码与编辑器建议
1) 推荐 VS Code + rust-analyzer。
2) 开启保存时格式化（rustfmt）。
3) 初学阶段尽量让编译器报错驱动学习。

五、练习题
1) 写出你本机 rustc、cargo 的版本命令。
2) 解释 rustup 和 cargo 的职责差异。
*/
fn main() {
    println!("Rust 环境搭建章节示例程序"); // 输出提示信息
    println!("请在终端执行 rustc --version 和 cargo --version"); // 输出验证命令
}

/*
练习题答案（注释版）
1) 版本命令：rustc --version、cargo --version。
2) rustup 负责工具链管理；cargo 负责项目构建和依赖管理。

// fn main() {
//     println!("rustup: 管理工具链"); // 答案要点1
//     println!("cargo: 管理项目和依赖"); // 答案要点2
// }
*/
// 由bhw设计
