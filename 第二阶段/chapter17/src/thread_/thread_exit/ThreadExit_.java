package thread_.thread_exit;

/**
 * 通过控制一个loop变量+if或者循环结构, 就可以在main中进行控制--通知方式
 */
public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        new Thread(t).start();

        try {
            Thread.sleep(1000 *10);
            t.flag = false;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class T implements Runnable{
    int c = 0;
    public boolean flag = true;
    @Override
    public void run() {
        while (flag){
            System.out.println(" 运行中" + ++c);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
