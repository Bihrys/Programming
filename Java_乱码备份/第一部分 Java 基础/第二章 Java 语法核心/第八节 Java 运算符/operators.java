// 由bhw设计
/*
第一部分 第二�?第八�?Java 运算�?
丢�、运算符分类
1) 算术�? - * / %
2) 关系�? < >= <= == !=
3) 逻辑�?& || !
4) 赋��：= += -= *= /= %=
5) 自增自减�?+ --

二��易错点
1) 整数除法会截断小数��?2) == 比较对象地址，字符串内容应用 equals�?3) 逻辑短路�?& 前面�?false 时后面不再计算��?
三��练习题
1) 输入长宽，输出面积和周长�?2) 比较两个字符串，分别�?== �?equals 观察结果�?*/
class OperatorsDemo { // 运算符演示类
    public static void main(String[] args) { // 主方�?        int a = 17; // 变量a
        int b = 5; // 变量b
        System.out.println("a+b=" + (a + b)); // 加法
        System.out.println("a/b=" + (a / b)); // 整数除法
        System.out.println("a%b=" + (a % b)); // 取余
        System.out.println("a>b ? " + (a > b)); // 关系比较
        System.out.println("(a>0 && b>0) ? " + (a > 0 && b > 0)); // 逻辑�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// int length = 8; // �?// int width = 3; // �?// int area = length * width; // 面积
// int perimeter = 2 * (length + width); // 周长
// System.out.println(area + "," + perimeter); // 输出
*/
// 由bhw设计
