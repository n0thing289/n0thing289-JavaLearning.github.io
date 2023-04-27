package thread_.method;

public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException{
        Test t = new Test();
        Thread thread = new Thread(t);
        thread.setName("hsp-Thread");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

        for (int i=0;i<5;i++){
//            Thread.sleep(1000);//这里的sleep很重要
            System.out.println("hi " + i);
        }
        thread.interrupt();
    }
}
class Test implements Runnable{
    @Override
    public void run(){
        while(true){
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName() + "吃包子~~~" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中");
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被打断了");

            }
        }
    }
}