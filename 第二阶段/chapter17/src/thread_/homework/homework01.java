package thread_.homework;

import javax.sql.rowset.BaseRowSet;
import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        Thread printer = new Thread(new Printer(), "打印线程");
        Thread exiter = new Thread(new Exiter(), "控制退出线程");
//        exiter.setDaemon(true);
        printer.start();
        exiter.start();
        System.out.println("主线程结束");
    }
}

class Printer implements Runnable{
    public static boolean loop = true;
    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            if (!loop){
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i = " + i);
        }
    }
}

class Exiter implements Runnable{
    static final Scanner scan = new Scanner(System.in);
    static char flag;
    @Override
    public void run() {
        while(true){
            System.out.println("输入Q标识退出:");
            if(scan.next().charAt(0) == 'Q'){
                Printer.loop = false;
                break;
            }
        }

    }
}
