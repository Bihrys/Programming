// 由bhw设计
/*
第一部分 第三章 第五节 Rust 组织管理

一、组织管理目标
1) 模块化拆分代码，提高可维护性。
2) 控制可见性，减少不必要暴露。

二、核心语法
1) mod：定义模块。
2) pub：公开可见。
3) use：引入路径，简化调用。
4) crate：当前包根命名空间。

三、工程建议
1) 按“领域”拆模块，不按“技术词”随意分。
2) 公共 API 放 lib.rs 暴露，内部实现尽量私有。

四、练习题
1) 定义 math 模块并公开 add 函数。
2) 在 main 中用 use 导入并调用 add。
*/
mod math {
    pub fn add(a: i32, b: i32) -> i32 { // 公开函数
        a + b // 返回和
    }
}

use crate::math::add; // 从当前 crate 导入 add

fn main() {
    println!("3 + 4 = {}", add(3, 4)); // 调用导入函数
}

/*
练习题答案（注释版）
// mod utils { // 定义模块
//     pub fn hello() { println!("hello"); } // 公开函数
// }
// use crate::utils::hello; // 导入函数
// fn main() { hello(); } // 调用
*/
// 由bhw设计
