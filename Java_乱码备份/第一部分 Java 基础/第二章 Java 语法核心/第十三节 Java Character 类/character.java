// 由bhw设计
/*
第一部分 第二�?第十三节 Java Character �?
丢�、Character 类用�?1) 判断字符类型：字母��数字��空白等�?2) 大小写转捃6�9��?3) 在文本处理��词法分析中很常用��?
二��常用方�?1) Character.isDigit(c)
2) Character.isLetter(c)
3) Character.isWhitespace(c)
4) Character.toUpperCase(c)

三��练习题
1) 判断字符是否为英文大写字母��?2) 把小写字母转为大写并输出�?*/
class CharacterDemo { // Character演示�?    public static void main(String[] args) { // 主方�?        char c1 = 'a'; // 测试字符1
        char c2 = '8'; // 测试字符2
        System.out.println(Character.isLetter(c1)); // 是否字母
        System.out.println(Character.isDigit(c2)); // 是否数字
        System.out.println(Character.toUpperCase(c1)); // 转大�?    } // main结束
} // 类结�?
/*
练习题答案（注释版）
// char x = 'G'; // 测试字符
// boolean ok = (x >= 'A' && x <= 'Z'); // 是否大写字母
// System.out.println(ok); // 输出
*/
// 由bhw设计
