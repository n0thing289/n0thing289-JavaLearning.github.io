package thread_.thread_safety.SellTicket;

public class SellTicket01 {
    public static void main(String[] args) {
        SellSystem01 sellSystem01 = new SellSystem01();
        SellSystem01 sellSystem02 = new SellSystem01();
        SellSystem01 sellSystem03 = new SellSystem01();
//        sellSystem01.start();
//        sellSystem02.start();
//        sellSystem03.start();

        new Thread(new SellSystem02()).start();
        new Thread(new SellSystem02()).start();
        new Thread(new SellSystem02()).start();
    }
}

class SellSystem01 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket <=0){
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


class SellSystem02 implements Runnable{
    private static int ticket = 100;

    @Override
    public void run() {
        while (true){
            if (ticket <=0){
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