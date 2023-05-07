package review.drawTank;

import javax.swing.*;
import java.awt.*;

public class DrawReview {
    //复习画个蛤蟆
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        g.setColor(Color.green);
        g.fillOval(x, y, 100, 70);
        //画上面的眼睛
        g.setColor(Color.black);
        g.fillOval(x + 15, y + 10, 10, 10);
        //画上面的前脚
        g.setColor(Color.yellow);
        g.fillOval(x + 15 - 20 / 2, y + 10 - 14 / 2, 20, 14);
        //画上面的后脚
        g.fillOval(x + (100 - 15) - 20 / 2, y + 10 - 14 / 2, 20, 14);

        //画下面的眼睛
        g.setColor(Color.black);
        g.fillOval(x + 15, y + 50, 10, 10);
        //画下面的前脚
        g.setColor(Color.yellow);
        g.fillOval(x + 15 - 20 / 2, y + (70 - 10) - 14 / 2, 20, 14);
        //画下面的后脚
        g.fillOval(x + (100 - 15) - 20 / 2, y + (70 - 10) - 14 / 2, 20, 14);

    }
}

class MyFrame extends JFrame {
    public MyPanel mp = null;

    public MyFrame() {
        mp = new MyPanel();
        this.add(mp);

        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
