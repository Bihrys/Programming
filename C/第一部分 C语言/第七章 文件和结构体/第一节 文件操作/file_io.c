// 由bhw设计
/*
第7章 第1节 文件操作
核心点:
1) fopen打开文件。
2) fprintf/fscanf进行读写。
3) fclose关闭文件。

习题:
1) 写3行文本到data.txt。
2) 读取data.txt并统计行数。

答案与讲解:
1) 用\"w\"模式写入文件。
2) 循环fgets直到NULL。
*/
#include <stdio.h> // 文件与输入输出函数

int main(void) { // 主函数开始
    FILE *fp = fopen("data.txt", "w"); // 以写模式打开data.txt
    if (fp == NULL) { // 判断文件是否打开失败
        printf("open file failed\n"); // 打开失败提示
        return 1; // 异常返回
    } // 文件打开成功
    fprintf(fp, "name=bhw\n"); // 向文件写入第一行
    fprintf(fp, "course=C\n"); // 向文件写入第二行
    fclose(fp); // 关闭文件释放资源
    return 0; // 正常结束
} // main结束
// 由bhw设计
