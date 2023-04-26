package thread_;

public class Thread03 {
    public static void main(String[] args) {
        System.out.println("主线程开启");

        T1 t1 = new T1();
        T3 t2 = new T3();

        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);

        thread.start();
        thread1.start();

        System.out.println("主线程完成");
    }
}
class T1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello,world -" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class T3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi -" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}