package tankgame06;

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
    static int enemyTankSize = 6;
    static int deadEnemyTankSize = -1;
    //定义敌人的tk们
    Vector<EnemyTank> enemyTanks = null;
    //
    Vector<Image> images = new Vector<>(3);
    Image i1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb01.png"));
    Image i2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb02.png"));
    Image i3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb03.png"));

    //
    Vector<Node> nodes = new Vector<>();

    public MyPanel(String key) {
        nodes = Recorder.readRecord();
        if(nodes == null){
            key = "1";
        }
        //初始化一个堂客
        heroTank = new HeroTank(100, 100);
        //给坦克设置速度
        heroTank.setSpeed(5);
        enemyTanks = "1".equals(key) ? new Vector<>(enemyTankSize) : new Vector<>(enemyTankSize - deadEnemyTankSize);
        switch (key){
            case "1":
                //初始化敌人的坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 10);
                    enemyTank.setDirect(2);
                    //将enemyTanks设置给enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTanks.add(enemyTank);
                    new Thread(enemyTank).start();
                }
                break;
            case "2":


                for (int i = 0; i < nodes.size(); i++) {
                    EnemyTank enemyTank = new EnemyTank(nodes.get(i).getX(), nodes.get(i).getY());
                    enemyTank.setDirect(nodes.get(i).getDirect());
                    //将enemyTanks设置给enemyTank
                    enemyTank.setEnemyTanks(enemyTanks);
                    enemyTanks.add(enemyTank);
                    new Thread(enemyTank).start();
                }
                break;
            default:
                System.out.println("输入有误");
        }

        images.add(i3);
        images.add(i2);
        images.add(i1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Recorder.setEnemyTanks(enemyTanks);

        g.setColor(Color.black);
        g.fillRect(0, 0, 1000, 750);

        showInfo(g);

        //初始化敌人
        for (int i = 0; i < enemyTanks.size(); i++) {
            //画敌人的坦克
            EnemyTank enemy = enemyTanks.get(i);

            drawTank(enemy.getX(), enemy.getY(), g, enemy.getDirect(), 0);

            //画出多个子弹的轨迹
            //1. 拿到坦克的弹药数量
            Vector<Bullet> enemyBullets = enemy.getBullets();
            for (int j = 0; j < enemyBullets.size(); j++) {
                Bullet currentBullet = enemyBullets.get(j);
                if (currentBullet.isLive()) {
                    drawBullet(currentBullet, g);
                    //敌人射击英雄，我方会消失的功能
                    //判断英雄是否存在
                    if (!heroTank.isLive()) {
                        continue;
                    }
                    int shotFlag = currentBullet.isShot(heroTank);
                    if (shotFlag == 2) {//说明某个敌人的子弹射中了英雄
                        //就把当前的子弹移除
                        currentBullet.setLive(false);
                        enemyBullets.remove(currentBullet);
                        //把英雄设置成死亡
                        heroTank.setLive(false);
                        for (int k = 0; k < images.size(); k++) {
                            Image currentImage = images.get(k);
                            try {
                                Thread.sleep(1000 / 60);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            g.drawImage(currentImage, heroTank.getX(), heroTank.getY(), 60, 60, this);
                        }
                    }
                } else {//如果子弹状态是死那么就把他移除
                    enemyBullets.remove(currentBullet);
                }
            }
        }


        //绘制英雄的坦克
        if (heroTank.isLive()) {
            drawTank(heroTank.getX(), heroTank.getY(), g, heroTank.getDirect(), 1);
            //画出多个子弹的轨迹
            //1. 拿到坦克的弹药数量
            Vector<Bullet> heroTankBullets = heroTank.getBullets();
            for (int i = 0; i < heroTankBullets.size(); i++) {
                Bullet currentBullet = heroTankBullets.get(i);
                if (currentBullet.isLive()) {
                    drawBullet(currentBullet, g);
                    //敌人消失功能
                    //调用isShot要根据场上敌人遍历，敌人有多少就i遍历几次
                    for (int j = 0; j < enemyTanks.size(); j++) {
                        EnemyTank currentEnemy = enemyTanks.get(j);
                        if (!(currentEnemy.isLive())) {//解决尸体吃子弹的问题
                            return;
                        }
                        int shotFlag = currentBullet.isShot(currentEnemy);
                        if (shotFlag == 2) {//如果返回2说明英雄的子弹击中了敌人的某一个坦克
                            //那么就要把当前子弹移除,
                            currentBullet.setLive(false);
                            heroTankBullets.remove(currentBullet);

                            //把当前敌人移除
                            currentEnemy.setLive(false);
                            enemyTanks.remove(currentEnemy);

                            //播放爆炸效果
                            for (int k = 0; k < images.size(); k++) {
                                Image currentImage = images.get(k);
                                try {
                                    Thread.sleep(1000 / 60);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                g.drawImage(currentImage, currentEnemy.getX(), currentEnemy.getY(), 60, 60, this);
                            }
                            Recorder.addAllEnemyTankNum();

                        }
                    }
                } else {
                    heroTankBullets.remove(currentBullet);
                }
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

    public void drawBullet(Bullet bullet, Graphics g) {
        g.fillOval(bullet.getBulletX(), bullet.getBulletY(), 2, 2);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == 83) {/**KeyEvent.VK_DOWN 就是向下箭头对应的code*/
            //向下
            direct = 2;
            heroTank.setDirect(direct);
//            heroTank.setY(heroTank.getY() + 1);
            if (heroTank.getY() < HspTankGame06.sizeY - 60) {
                heroTank.moveDown();
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == 87) {/**KeyEvent.VK_W KeyEvent.VK_D ...*/
            //向上
            direct = 0;
            heroTank.setDirect(direct);
//            heroTank.setY(heroTank.getY() + 1);
            if (heroTank.getY() > 0) {
                heroTank.moveUp();
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == 65) {
            //向左
            direct = 3;
            heroTank.setDirect(direct);
//            heroTank.setX(heroTank.getX() - 1);
            if (heroTank.getX() > 0) {
                heroTank.moveLeft();
            }

        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == 68) {
            //向右
            direct = 1;
            heroTank.setDirect(direct);
//            heroTank.setX(heroTank.getX() + 1);
            if (heroTank.getX() < HspTankGame06.sizeX - 60) {
                heroTank.moveRight();
            }

        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            //因为炮管头的坐标是随方向变化的,所以我先判断方向再拿到对应的桌标
            if (heroTank.isLive()) {
                heroTank.shot();
            }
//            enemyTanks.get(1).shot();

        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();

        }
    }

    public void showInfo(Graphics g) {
        g.setColor(Color.black);
        //设置字体
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("您累计击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);
        g.setColor(Color.black);
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1090, 100);
    }

    public Vector<EnemyTank> getEnemyTanks() {
        return enemyTanks;
    }

    public static void setDeadEnemyTankSize(int deadEnemyTankSize) {
        MyPanel.deadEnemyTankSize = deadEnemyTankSize;
    }
}

/**
 * 思路分析：
 * 1. 实现监听实现KeyListener，以及方法
 * 2. 键盘处理方法：改变坐标,然后设置方向 最后面板重绘
 * 3. 让JFrame监听我的键盘事件 this.addKeyListener(mp)
 */