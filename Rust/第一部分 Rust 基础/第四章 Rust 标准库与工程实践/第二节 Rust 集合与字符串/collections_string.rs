// 由bhw设计
/*
第一部分 第四章 第二节 Rust 集合与字符串

一、常见集合
1) Vec<T>：动态数组。
2) HashMap<K,V>：键值映射。
3) HashSet<T>：去重集合（本节扩展了解）。

二、String 与 &str
1) String：可增长堆字符串，拥有所有权。
2) &str：字符串切片，借用视图。
3) 常见操作：push_str、format!、split、replace。

三、练习题
1) 统计一个字符串中每个单词出现次数。
2) 把 Vec 里的数字转成逗号分隔字符串。
*/
use std::collections::HashMap; // 引入哈希映射

fn main() {
    let mut v = vec![1, 2, 3]; // 创建 Vec
    v.push(4); // 追加元素
    println!("vec = {:?}", v); // 输出向量

    let mut s = String::from("Rust"); // 创建 String
    s.push_str(" language"); // 追加字符串
    println!("string = {}", s); // 输出字符串

    let text = "rust is fast and rust is safe"; // 文本样本
    let mut map: HashMap<&str, i32> = HashMap::new(); // 单词计数表
    for w in text.split_whitespace() { // 按空白分词
        let count = map.entry(w).or_insert(0); // 若不存在则插入0
        *count += 1; // 计数加一
    }
    println!("word count = {:?}", map); // 输出词频
}

/*
练习题答案（注释版）
// let nums = vec![10, 20, 30]; // 数字向量
// let joined = nums.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","); // 拼接
// println!("{}", joined); // 输出 10,20,30
*/
// 由bhw设计
