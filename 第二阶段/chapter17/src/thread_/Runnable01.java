package thread_;

public class Runnable01 {
    /**
     * 如果Thread被继承了一次,Thread就不能在被继承了(java单继承机制)
     * 所以通过Runnable接口时开发线程
     */
    public static void main(String[] args) {
        T2 t2 = new T2();
//        t2.run();//但发现没有t2.start()!
        //把实现了Runnable接口的对象传给Thread构造器,然后在调用start()
        Thread thread = new Thread(t2);
        thread.start();
    }
}
class T2 implements Runnable{
    int count = 0;
    @Override
    public void run() {//单独调用其实是普通方法
        while(true){
            System.out.println("小狗哇哇叫 hi" + count++ + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count == 10){
                break;
            }
        }
    }
}

class ThreadProxy implements Runnable{//模拟Thread接收实现了Runnable类的参数-静态代理模式
    private Runnable target = null;
    @Override
    public void run() {
        if(target != null){
            target.run();// 动态绑定
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start(){
        start0();
    }
    public void start0(){
        run();
    }
}