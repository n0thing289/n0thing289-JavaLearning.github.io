package tankgame04;

import java.util.Vector;

public class EnemyTank extends Tank implements Runnable {
    private Bullet bullet;
    private Thread bulletThread;
    private Vector<Bullet> bullets = new Vector<>(10);
    private boolean isLive = true;

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Thread getBulletThread() {
        return bulletThread;
    }

    public void setBulletThread(Thread bulletThread) {
        this.bulletThread = bulletThread;
    }

    public Vector<Bullet> getBullets() {
        return bullets;
    }

    public void setBullets(Vector<Bullet> bullets) {
        this.bullets = bullets;
    }

    public EnemyTank(int x, int y) {
        super(x, y);

        //每当创建一个敌人坦克对象,就初始化一个子弹对象,并且启动

    }

    public void shot() {
        if(!(bullets.size() < 5)){
            return;
        }
        int x = this.getX();
        int y = this.getY();
        int direct = this.getDirect();
        switch (direct) {
            case 0:
                //向上 x + 20, (y + 30 - 50)
//                bulletDirect = 0;
//                bulletX = (heroTank.getX() + 20);
//                bulletY = (heroTank.getY() + 30 - 50);
                bullet = new Bullet(x + 20, y + 30 - 50, direct, 400);
                break;
            case 1:
                //向右 (x + 30 + 50), y + 20
//                bulletDirect = 1;
//                bulletX = (heroTank.getX() + 30 + 50);
//                bulletY = (heroTank.getY() + 20);
                bullet = new Bullet(x + 30 + 50, y + 20, direct, 400);
                break;
            case 2:
                //向下 x + 20, (y + 30 + 50)
//                bulletDirect = 2;
//                bulletX = ((heroTank.getX() + 20));
//                bulletY = (heroTank.getY() + 30 + 50);
                bullet = new Bullet(x + 20, y + 30 + 50, direct, 400);
                break;
            case 3:
                //向左 (x + 30 - 50), y + 20
//                bulletDirect = 3;
//                bulletX = ((heroTank.getX() + 30 - 50));
//                bulletY = (heroTank.getY() + 20);
                bullet = new Bullet(x + 30 - 50, y + 20, direct, 400);
                break;
        }


        bullets.add(bullet);
        bulletThread = new Thread(bullet);
        bulletThread.start();

        System.out.println(bullets.size());
    }

    @Override
    public void run() {

        while (true) {
            //新增功能2,让敌人在规定范围内移动
            //1. 拿到窗口大小
            //2. 拿到坦克坐标
            //3. 每次正常运动之前就先判断有没有到边界
            //4. 如果到了就立马随机换方向
            //  4.1 然后原来的正常运动就不要走了按新方向走
            //让敌人随机动
            //1.在一个方向上先动
            switch (this.getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getX() < HspTankGame02.sizeX - 60) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(100);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getY()  < HspTankGame02.sizeY - 60) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    break;
            }

            //2. 休眠一会后就改变方向
            setDirect((int) (Math.random() * 4));
//            shot();
            //3. 做好什么时候结束线程
            if (!isLive) {
                break;
            }

        }


    }
}


/**
 * @Override public void run() {
 * <p>
 * while (true) {
 * //新增功能2,让敌人在规定范围内移动
 * //1. 拿到窗口大小
 * //2. 拿到坦克坐标
 * //3. 每次正常运动之前就先判断有没有到边界
 * //4. 如果到了就立马随机换方向
 * //  4.1 然后原来的正常运动就不要走了按新方向走
 * //让敌人随机动
 * //1.在一个方向上先动
 * switch (this.getDirect()) {
 * case 0:
 * try {
 * for (int i = 0; i < 30; i++) {
 * moveUp();
 * Thread.sleep(100);
 * isBoundary("enemy");
 * }
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * } catch (InBoundaryException e) {
 * outOfBoundaryMove();
 * }
 * break;
 * case 1:
 * try {
 * for (int i = 0; i < 30; i++) {
 * moveRight();
 * Thread.sleep(100);
 * isBoundary("enemy");
 * }
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * } catch (InBoundaryException e) {
 * outOfBoundaryMove();
 * }
 * break;
 * case 2:
 * try {
 * for (int i = 0; i < 30; i++) {
 * moveDown();
 * Thread.sleep(100);
 * isBoundary("enemy");
 * }
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * } catch (InBoundaryException e) {
 * outOfBoundaryMove();
 * }
 * break;
 * case 3:
 * <p>
 * try {
 * for (int i = 0; i < 30; i++) {
 * <p>
 * moveLeft();
 * Thread.sleep(50);
 * isBoundary("enemy");
 * }
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * } catch (InBoundaryException e) {
 * outOfBoundaryMove();
 * }
 * break;
 * }
 * //2. 休眠一会后就改变方向
 * setDirect((int) (Math.random() * 4));
 * //3. 做好什么时候结束线程
 * if (!isLive) {
 * break;
 * }
 * <p>
 * }
 * <p>
 * <p>
 * }
 */