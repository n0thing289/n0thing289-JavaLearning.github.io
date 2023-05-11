package tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * version 1.0
 */
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的tk
    HeroTank heroTank = null;
    int direct = 0;
    int enemyTankSize = 3;
    //定义敌人的tk
    Vector<EnemyTank> enemyTanks = new Vector<>(enemyTankSize);
    //
    int type = 0;

    public MyPanel() {
        //初始化一个堂客
        heroTank = new HeroTank(100, 100);
        //给坦克设置速度
        heroTank.setSpeed(5);

        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 10);
            enemyTank.setDirect(2);
            enemyTanks.add(enemyTank);
//            System.out.println("ok");
        }
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        drawTank(heroTank.getX(), heroTank.getY(), g, heroTank.getDirect(), 1);

        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemy = enemyTanks.get(i);
            drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 0);
        }


        if (heroTank.getBullet() != null && heroTank.getBullet().isLive()) {
            try {
                drawBullet(heroTank.getBullet(), g);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


}

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {//  根据坦克设置不同的颜色
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }

        //根据方向画坦克
        switch (direct) {// 0向上 1向右 2向下 3向左
            case 0://向上
                //第一条履带
                g.fill3DRect(x, y, 10, 60, false);
                //第二条履带
                g.fill3DRect(x + 30, y, 10, 60, false);
                //中间坦克本体
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                //坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                //坦克炮管
                g.drawLine(x + 20, y + 30, x + 20, (y + 30 - 50));
                break;
            case 1://向右
                //第一条履带
                g.fill3DRect(x, y, 60, 10, false);
                //第二条履带
                g.fill3DRect(x, y + 30, 60, 10, false);
                //中间坦克本体
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                //坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                //坦克炮管
                g.drawLine(x + 30, y + 20, (x + 30 + 50), y + 20);
                break;
            case 2://向下
                //第一条履带
                g.fill3DRect(x, y, 10, 60, false);
                //第二条履带
                g.fill3DRect(x + 30, y, 10, 60, false);
                //中间坦克本体
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                //坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                //坦克炮管
                g.drawLine(x + 20, y + 30, x + 20, (y + 30 + 50));
                break;
            case 3://向左
                //第一条履带
                g.fill3DRect(x, y, 60, 10, false);
                //第二条履带
                g.fill3DRect(x, y + 30, 60, 10, false);
                //中间坦克本体
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                //坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                //坦克炮管
                g.drawLine(x + 30, y + 20, (x + 30 - 50), y + 20);
                break;
            default:
                System.out.println("暂时不处理");
        }
    }

    public void drawBullet(Bullet bullet, Graphics g) throws InterruptedException {
        g.fillOval(bullet.getBulletX(), bullet.getBulletY(), 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == 83) {/**KeyEvent.VK_DOWN 就是向下箭头对应的code*/
            //向下
            direct = 2;
            heroTank.setDirect(direct);
//            heroTank.setY(heroTank.getY() + 1);
            heroTank.moveDown();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == 87) {/**KeyEvent.VK_W KeyEvent.VK_D ...*/
            //向上
            direct = 0;
            heroTank.setDirect(direct);
//            heroTank.setY(heroTank.getY() + 1);
            heroTank.moveUp();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == 65) {
            //向左
            direct = 3;
            heroTank.setDirect(direct);
//            heroTank.setX(heroTank.getX() - 1);
            heroTank.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == 68) {
            //向右
            direct = 1;
            heroTank.setDirect(direct);
//            heroTank.setX(heroTank.getX() + 1);
            heroTank.moveRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            //因为炮管头的坐标是随方向变化的,所以我先判断方向再拿到对应的桌标
            int bulletDirect = -1;
            int bulletX = -1;
            int bulletY = -1;
            switch (heroTank.getDirect()) {
                case 0:
                    //向上 x + 20, (y + 30 - 50)
                    bulletDirect = 0;
                    bulletX = (heroTank.getX() + 20);
                    bulletY = (heroTank.getY() + 30 - 50);
                    break;
                case 1:
                    //向右 (x + 30 + 50), y + 20
                    bulletDirect = 1;
                    bulletX = (heroTank.getX() + 30 + 50);
                    bulletY = (heroTank.getY() + 20);
                    break;
                case 2:
                    //向下 x + 20, (y + 30 + 50)
                    bulletDirect = 2;
                    bulletX = ((heroTank.getX() + 20));
                    bulletY = (heroTank.getY() + 30 + 50);
                    break;
                case 3:
                    //向左 (x + 30 - 50), y + 20
                    bulletDirect = 3;
                    bulletX = ((heroTank.getX() + 30 - 50));
                    bulletY = (heroTank.getY() + 20);
                    break;
            }
            heroTank.shot(bulletX, bulletY, bulletDirect);
            System.out.println("ok");
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();
        }
    }
}

/**
 * 思路分析：
 * 1. 实现监听实现KeyListener，以及方法
 * 2. 键盘处理方法：改变坐标,然后设置方向 最后面板重绘
 * 3. 让JFrame监听我的键盘事件 this.addKeyListener(mp)
 */