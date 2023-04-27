package thread_.state_;

public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new T());
        System.out.println(thread.getName() + " 状态" + thread.getState());
        thread.start();

        while(Thread.State.TERMINATED != thread.getState()){
            System.out.println(thread.getName() + " 状态" + thread.getState());
            Thread.sleep(1000);
        }
        System.out.println(thread.getName() + " 状态" + thread.getState());
    }
}
class T implements Runnable{

    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}