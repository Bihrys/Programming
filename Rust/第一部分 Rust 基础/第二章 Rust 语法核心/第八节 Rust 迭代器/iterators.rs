// 由bhw设计
/*
第一部分 第二章 第八节 Rust 迭代器

一、迭代器思想
1) 迭代器是“惰性计算”，直到消费才真正执行。
2) 常见方法：map、filter、fold、collect、sum。
3) 迭代器链式调用可读性高且性能好。

二、三种遍历方式
1) iter()：不可变借用遍历。
2) iter_mut()：可变借用遍历。
3) into_iter()：获取所有权遍历。

三、练习题
1) 过滤偶数后求和。
2) 把字符串数组转成大写新数组。
*/
fn main() {
    let nums = vec![1, 2, 3, 4, 5, 6]; // 创建向量
    let even_sum: i32 = nums // 对向量创建迭代器链
        .iter() // 不可变借用遍历
        .filter(|&&x| x % 2 == 0) // 保留偶数
        .sum(); // 求和消费
    println!("偶数和 = {}", even_sum); // 输出结果

    let words = vec!["rust", "is", "fast"]; // 字符串切片向量
    let uppers: Vec<String> = words // 迭代转换
        .iter()
        .map(|s| s.to_uppercase()) // 转大写
        .collect(); // 收集为 Vec<String>
    println!("大写结果 = {:?}", uppers); // 输出结果
}

/*
练习题答案（注释版）
// let arr = vec![10, 11, 12, 13];
// let odds: Vec<i32> = arr.iter().copied().filter(|x| x % 2 == 1).collect();
// println!("{:?}", odds);
*/
// 由bhw设计
