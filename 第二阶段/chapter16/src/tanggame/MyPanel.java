package tanggame;

import javax.swing.*;
import java.awt.*;


/**
 * version 1.0
 */
public class MyPanel extends JPanel {
    //定义我的tk
    HeroTank heroTank = null;

    public MyPanel(){
        heroTank = new HeroTank(100,100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
//        g.setColor(Color.blue);
//        g.fillRect(100,100, 10, 50);
//        g.fillRect(130,100,10,50);
//        g.fillRect(105,105,30,40);
//        g.fillOval(110,115, 20,20);
//        g.drawLine(120,125-10,120, 80);
        drawTank(heroTank.getX(),heroTank.getY(),g,0,0);
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type){
        switch (type){//  根据坦克设置不同的方向
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //根据方向画坦克
        switch (direct){
            case 0:
                g.fill3DRect(x,y, 10, 50, false);
                g.fill3DRect(x + 30,y,10,50,false);
                g.fill3DRect(x + 5,y + 5,30,40,false);
                g.fillOval(x+10,y+15, 20,20);
                g.drawLine(x+20,y+15,x+20, y-20);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }
}
