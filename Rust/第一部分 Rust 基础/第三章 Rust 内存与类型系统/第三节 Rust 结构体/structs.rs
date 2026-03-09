// 由bhw设计
/*
第一部分 第三章 第三节 Rust 结构体

一、结构体作用
1) 用于组合多个相关字段，构建自定义数据类型。
2) 常见三类：命名字段结构体、元组结构体、单元结构体。

二、方法实现
1) impl 为结构体实现方法。
2) &self 表示不可变借用方法。
3) &mut self 表示可变借用方法。

三、练习题
1) 定义 Student 结构体并实现 show 方法。
2) 添加 update_score 方法并更新成绩。
*/
#[derive(Debug)] // 便于调试输出
struct Student {
    name: String, // 姓名字段
    score: i32,   // 分数字段
}

impl Student {
    fn show(&self) { // 不可变借用方法
        println!("name={}, score={}", self.name, self.score); // 输出信息
    }

    fn update_score(&mut self, new_score: i32) { // 可变借用方法
        self.score = new_score; // 更新分数
    }
}

fn main() {
    let mut s = Student { // 创建结构体实例
        name: "bhw".to_string(), // 初始化姓名
        score: 88, // 初始化分数
    };
    s.show(); // 输出原始信息
    s.update_score(95); // 更新分数
    s.show(); // 输出更新后信息
    println!("{:?}", s); // Debug 输出
}

/*
练习题答案（注释版）
// struct Point(i32, i32); // 元组结构体
// let p = Point(3, 4); // 创建实例
// println!("{}, {}", p.0, p.1); // 访问字段
*/
// 由bhw设计
