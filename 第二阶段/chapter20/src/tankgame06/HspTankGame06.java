package tankgame06;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class HspTankGame06 extends JFrame {
    public static final int sizeX = 1000;
    public static final int sizeY = 750;
    MyPanel mp = null;
    public HspTankGame06(){
        System.out.println("请输入选择1：新游戏，2：继续上局");
        Scanner scan = new Scanner(System.in);
        String next = scan.next();
        mp = new MyPanel(next);

        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);

        this.setSize(sizeX,sizeY);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //那边设置好了怎么动后，JFrame要传进去监听谁
        this.addKeyListener(mp);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);

            }
        });
    }


    public static void main(String[] args) {
        HspTankGame06 hspTankGame01 = new HspTankGame06();
    }
}
