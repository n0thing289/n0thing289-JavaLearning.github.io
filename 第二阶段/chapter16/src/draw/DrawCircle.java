package draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    //4. 定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        //1. 创建面板
        DrawCircle drawCircle = new DrawCircle();
    }
    //3. 重写画框
    public DrawCircle(){
        //5. 初始化面板
        mp = new MyPanel();
        //6. 把面板添加到窗口
        this.add(mp);
        //设置窗口的大小
        this.setSize(800,800);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//当点击窗口的小窗，程序真正退出
    }
}

class MyPanel extends JPanel {
    //2. 重写构造器
    @Override
    public void paint(Graphics g){
        super.paint(g);
        /**
         * JPanel可以理解成画板
         * Graphics可以理解成画笔
         * */
        g.drawOval(1,1,100,100);

    }
}