package tankgame04;

//多线程流程
//1. 让那个对象实现Runnable接口
//2. 重写实现run方法
//3. 在main中，创建new一个Thread对象
//4. start（）
public class Bullet implements Runnable {
    private int bulletX;
    private int bulletY;
    private int direct = 0;
    private int speed = 2;
    private int fireRange = 400;//射程

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    private boolean isLive = true;

    public Bullet(int bulletX, int bulletY, int direct, int fireRange) {
        this.bulletX = bulletX;
        this.bulletY = bulletY;
        this.direct = direct;
        this.fireRange = fireRange;
    }

    public int getFireRange() {
        return fireRange;
    }

    public void setFireRange(int fireRange) {
        this.fireRange = fireRange;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getBulletX() {
        return bulletX;
    }

    public void setBulletX(int bulletX) {
        this.bulletX = bulletX;
    }

    public int getBulletY() {
        return bulletY;
    }

    public void setBulletY(int bulletY) {
        this.bulletY = bulletY;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direct) {
                case 0:
                    //向上 x + 20, (y + 30 - 50)
                    bulletY -= speed;
                    break;
                case 1:
                    //向右 (x + 30 + 50), y + 20
                    bulletX += speed;
                    break;
                case 2:
                    //向下 x + 20, (y + 30 + 50)
                    bulletY += speed;
                    break;
                case 3:
                    //向左 (x + 30 - 50), y + 20
                    bulletX -= speed;
                    break;
            }
//            System.out.println("x:" + bulletX + " y:" + bulletY);
            if (!(bulletX > 0 && bulletX < fireRange && bulletY < fireRange && bulletY > 0)) {
                isLive = false;
                break;
            }
        }
    }

    public int isShot(Tank tank) {
        /**
         * 判断是否射中了坦克的方法
         * 1. 获取坦克的坐标圈
         * 2. 获取子弹的坐标
         * 3. 子弹飞行过程中不断判断,坦克的坐标和子弹的坐标有无重合,有说明打中了目标
         * 4. 打中目标后,子弹死去,敌人也会死去
         *      4.1子弹从弹药中删去
         *      4.2把敌人在敌人集合中删去,以及把那个敌人不在绘画
         *
         * */
        //1.
        int x = tank.getX();
        int y = tank.getY();
        int tankWidth;
        int tankHeight;
        int tankDirect = tank.getDirect();

        int xAy = 0;
        if (tankDirect == 0 || tankDirect == 2) {
            //说明是上下方向,宽高就是 40 * 60
            tankWidth = 40;
            tankHeight = 60;
            //3.
            //x方向上判断
            for (int i = 1; i <= tankWidth; i++) {
                if (x + i == bulletX) {
                    System.out.println("在x上击中了");
                    xAy++;
                }
            }
            //在y方向上判断,只有两个方向都击中,才是真正打中了敌人
            for (int i = 1; i <= tankHeight; i++) {
                if (y + i == bulletY) {
                    System.out.println("在y上集中了");
                    xAy++;
                }
            }
        } else {
            tankWidth = 60;
            tankHeight = 40;
            //x方向上判断
            for (int i = 1; i <= tankWidth; i++) {
                if (x + i == bulletX) {
                    System.out.println("在x上击中了");
                    xAy++;
                }
            }
            //在y方向上判断,只有两个方向都击中,才是真正打中了敌人
            for (int i = 1; i <= tankHeight; i++) {
                if (y + i == bulletY) {
                    System.out.println("在y上集中了");
                    xAy++;
                }
            }
        }
        return xAy;

    }
}
