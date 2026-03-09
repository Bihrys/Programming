// 由bhw设计
/*
第一部分 第四章 第五节 Rust 宏

一、宏的作用
1) 在编译期展开代码，减少重复模板。
2) println!、vec! 都是常见宏。
3) 宏与函数不同：宏可接收可变参数和语法片段。

二、声明宏（macro_rules!）
1) 通过模式匹配描述输入格式。
2) 通过展开模板生成代码。

三、练习题
1) 自定义一个 say_hello! 宏。
2) 写一个接收表达式并打印结果的宏。
*/
macro_rules! say_hello {
    () => {
        println!("Hello from macro!"); // 展开后的代码
    };
}

macro_rules! show_expr {
    ($e:expr) => {
        println!("表达式结果 = {}", $e); // 打印表达式求值结果
    };
}

fn main() {
    say_hello!(); // 调用无参宏
    show_expr!(1 + 2 * 3); // 调用表达式宏
}

/*
练习题答案（注释版）
// macro_rules! double {
//     ($x:expr) => { $x * 2 }; // 返回两倍
// }
// fn main() { println!("{}", double!(10)); } // 输出 20
*/
// 由bhw设计
