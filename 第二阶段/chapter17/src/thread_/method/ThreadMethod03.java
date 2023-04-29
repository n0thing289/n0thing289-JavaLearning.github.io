package thread_.method;

public class ThreadMethod03 {
    public static void main(String[] args)throws InterruptedException {
        Thread thread = new Thread(new MyDaemonThread());
        //如果我们希望main线程结束后,子线程自动结束
        //只要把子线程设置会守护线程
        thread.setDaemon(true);//细节:先设置在start()
        thread.start();

        for (int i=1;i<=10;i++){
            System.out.println("宝强在工作--" + i);
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread implements Runnable{

    @Override
    public void run() {
        for (;;){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println();
            }
            System.out.println("马蓉和宋jie快乐的聊天");

        }
    }
}