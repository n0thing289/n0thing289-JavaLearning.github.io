package thread_.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        /**
         * 源码解读:
         *      1. public synchronized void start(){
         *          start0();
         *      }
         *
         *      2. 调用本地方法,JVM调用start0()
         *      //真正实现多线程
         *      private native void start0();//
         */
        cat1.start();//启动线程 -> 最终执行Cat的run方法
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 80; i++) {

            System.out.println("主线程 i = " + i);
            Thread.sleep(1000);
        }

    }
}
//老汉解读
//1. 当一个类继承了Thread
//2. Thread实现了Runnable接口的run方法
class Cat extends Thread{
    @Override
    public void run(){//重写run方法（是Thread实现了Runnable接口的run方法）
        int times = 0;
        while(true){
            System.out.println("喵喵~我是"+"小猫咪~" + Thread.currentThread().getName());
            try {//ctrl+alt+t
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            times++;
            if(times == 80){
                break;
            }
        }


    }
}


/**
 * 线程休眠
 * 返回当前线程名字
 * JConsole
 * question:
 *      1. 多线程底层机制
 *      2. 为什么调start(),而不是run()
 */
