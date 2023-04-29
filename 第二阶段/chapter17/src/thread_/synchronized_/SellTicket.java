package thread_.synchronized_;

public class SellTicket {
    public static void main(String[] args) {
        SellSystem03 S03 = new SellSystem03();
        new Thread(S03).start();
        new Thread(S03).start();
        new Thread(S03).start();
    }
}

class SellSystem01 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + "剩余:" + --ticket);
        }
    }
}


class SellSystem02 implements Runnable {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + "剩余:" + --ticket);
        }
    }
}

class SellSystem03 implements Runnable {
    private static int ticket = 100;
    private static boolean loop = true;
    //1.老汉说明
    //1. public synchronized void sell()是一个同步方法
    //2. 也可以在代码块上写synchronized，同步代码块
    public /*synchronized*/ void sell() {//在同一时刻只能有一个线程进入此方法
        synchronized (this){//普通方法里写同步代码块，锁要加在对象身上this
            if (ticket <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }

            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + " 售出一张票" + "剩余:" + --ticket);


        }
    }

    //同步方法静态的锁为类本身
    public synchronized static void m1(){}
    public static void m2(){
        synchronized (SellSystem03.class){//静态方法里写同步代码块，锁要加在类名.class
            System.out.println("m2");
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}


