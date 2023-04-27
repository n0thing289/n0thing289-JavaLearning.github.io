package thread_.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new Test02());
        thread.start();
        for (int i = 1; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("小弟(主线程)吃了 " + i + "包子");
            if(i == 5){
                System.out.println("小弟吃了5个包子,让子线程先全吃完");
                thread.yield();
                System.out.println("===老大吃完了,现在轮到我吃===");
            }
        }

    }
}
class Test02 implements Runnable{
    @Override
    public void run(){

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("大哥(子线程)吃了 " + i + "包子");
        }


    }

}
