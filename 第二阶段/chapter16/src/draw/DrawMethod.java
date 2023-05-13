package draw;

import javax.swing.*;
import java.awt.*;

public class DrawMethod extends JFrame{

    public static void main(String[] args) {
        new Frame();
    }

}


class MyPanel2 extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
//        g.drawLine(10,10,100,100);
//        g.drawRect(10,10,100,100);
//        System.out.println("paint被调用");
//        g.setColor(Color.pink);
//        g.fillRect(10,10,100,100);
//
//        g.fillOval(10,10,100,100);
//
//        //1.获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.jpg"));
        g.drawImage(image,10,10,940,940, this);
        g.setColor(Color.pink);
        g.setFont(new Font("隶书", Font.BOLD,50));
        g.drawString("北京你好", 100,100);// 坐标是在左下角(比较特殊的细节)


    }
}

class Frame extends JFrame{
    public MyPanel2 mp = null;
    public Frame(){
        mp = new MyPanel2();

        this.add(mp);

        this.setSize(400,400);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
