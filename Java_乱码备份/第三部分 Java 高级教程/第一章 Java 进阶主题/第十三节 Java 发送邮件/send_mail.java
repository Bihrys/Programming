// 由bhw设计
/*
第三部分 第一�?第十三节 Java 发��邮�?
丢�、常见方�?1) 使用 Jakarta Mail（原 JavaMail）库�?2) 霢��?SMTP 服务器地坢�、端口��账号��授权码�?
二��教学说�?1) 本示例给出结构化伪代码，避免暴露真实账号密码�?2) 生产环境必须把密钥放到安全配置，不写死代码��?
三��练习题
1) 列出发��邮件最少需要的 4 个配置项�?2) 解释为什么不能把密码直接写在源码里��?*/
class SendMailDemo { // 发��邮件说明类
    public static void main(String[] args) { // 主方�?        System.out.println("邮件发��需引入 Jakarta Mail 依赖�?); // 输出提示
        System.out.println("配置 SMTP 主机、端口��用户��授权码�?); // 输出提示
    } // main结束
} // 类结�?
/*
练习题答案（注释版）
1) 配置项示例：host、port、username、authCode�?2) 原因：泄露风险高，且不便于环境切捃6�9��?*/
// 由bhw设计
