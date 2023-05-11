package tankgame04;

import javax.swing.*;

public class HspTankGame02 extends JFrame {
    MyPanel mp = null;
    public HspTankGame02(){
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);

        this.setSize(800,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //那边设置好了怎么动后，JFrame要传进去监听谁
        this.addKeyListener(mp);
    }


    public static void main(String[] args) {
        HspTankGame02 hspTankGame01 = new HspTankGame02();
    }
}
