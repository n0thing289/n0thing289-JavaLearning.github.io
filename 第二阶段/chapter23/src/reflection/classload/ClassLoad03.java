package reflection.classload;

/**
 * 演示初始化
 * 初始化阶段要完成静态属性的显式初始化
 */
public class ClassLoad03 {
    public static void main(String[] args) {
        //老韩分析
        //1. 加载B类, 并生成B的Class对象 (加载阶段)
        //2. 静态变量默认初始化并开辟其内存空间 (连接阶段中的准备阶段)
        //3. 依次自动收集类中的所有静态变量的赋值动作和静态代码块中的语句 (初始化阶段)
        //
        /*
        *       clinit(){// 其还有一个线程保护机制,做了线程安全
        *           num = 300;
        *           num = 100;
        *       }
        * */
        //4. 如果new 对象,就还多一个构造器初始化
        System.out.println(B.num);
    }
}

class B{
    //回顾前面学的:静态代码块和静态属性初始化的优先级是一样的,多个就按顺序执行
    //你自己试试把这个顺序换一下,输出就变300了
    static {
        System.out.println("B的静态代码块");
        num = 300;
    }
    static int num = 100;

    public B(){
        System.out.println("B()构造器执行");
    }
}
