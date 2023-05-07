package tanggame;

import javax.swing.*;
import java.awt.*;

public class HspTankGame01 extends JFrame {
    MyPanel mp = null;
    public HspTankGame01(){
        mp = new MyPanel();

        this.add(mp);

        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }
}
