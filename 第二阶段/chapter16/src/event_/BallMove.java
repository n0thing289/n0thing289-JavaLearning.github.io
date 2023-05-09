package event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{
    public MyPanel mp = null;
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);

        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**JFrame对象可以监听键盘事件，但是要用addKeyListener（）把实现了KeyListener的对象传进去*/
        this.addKeyListener(mp);
    }
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
}

//面板
//KeyListener 是监听器，可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /**监听键盘有字符输出，（按下按键时就会被触发）*/
    }

    @Override
    public void keyPressed(KeyEvent e) {
        /**当某个建按下，方法触发*/
//        System.out.println((char)e.getKeyCode() + "被按下");
        //target: 根据用户按下的不同键，来处理小球的移动
        if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == 83){/**KeyEvent.VK_DOWN 就是向下箭头对应的code*/
            y++;
        }
        if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == 87){
            y--;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() ==65){
            x--;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == 68){
            x++;
        }
        this.repaint();
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /**当某个建松开，方法触发*/

    }
}
