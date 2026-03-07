// 由bhw设计
/*
第7章 第2节 结构化数据建模（class/record）

一、原理
1) 当数据有多个属性时，用类或记录类型建模更清晰。
2) class 更偏可变对象；record 更偏值语义（适合数据载体）。
3) 数据建模是工程开发的核心能力。

二、习题
1) 定义 Student（姓名、年龄、分数）并输出。
2) 创建学生列表并按分数排序输出。

三、答案与讲解
1) class Student { public string Name ... }
2) 可用 LINQ OrderByDescending 排序。
*/
using System; // 控制台库

class Student // 定义学生类
{
    public string Name { get; set; } = ""; // 学生姓名属性
    public int Age { get; set; } // 学生年龄属性
    public double Score { get; set; } // 学生成绩属性
} // 类定义结束

class Program // 程序类
{
    static void Main() // 主函数
    {
        Student s = new Student { Name = "bhw", Age = 18, Score = 98.5 }; // 创建对象并初始化
        Console.WriteLine($"{s.Name} {s.Age} {s.Score:F1}"); // 输出对象字段
    }
}
// 由bhw设计
