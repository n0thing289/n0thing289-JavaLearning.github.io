package thread_.synchronized_;

/**
 * 模拟线程死锁
 */
public class DeadLock_ {
    public static void main(String[] args) {
        new Thread(new DeadLockDemo(true), "A线程").start();
        new Thread(new DeadLockDemo(false), "B线程").start();
    }
}
class DeadLockDemo implements Runnable{
    //保证多个对象用同一把锁，new一个静态的对象，加入到互斥锁中
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (o1){//对象互斥锁-通过synchronized关键字来实现
                System.out.println(Thread.currentThread().getName() + "进入1");

                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        }
        else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}