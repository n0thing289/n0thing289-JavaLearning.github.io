package tankgame03;

import javax.swing.*;
import java.awt.*;

public class DrawTank {
    public static void main(String[] args) {
        new TankFrame();
    }
}

class TankPanel extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.drawRect(100,100, 10, 50);
        g.drawRect(130,100,10,50);
        g.drawRect(105,105,30,40);
        g.drawOval(110,115, 20,20);
        g.drawLine(120,125-10,120, 80);
    }
}

class TankFrame extends JFrame{
    public TankPanel tp = null;
    public TankFrame(){
        tp = new TankPanel();

        this.add(tp);

        this.setSize(400,400);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
