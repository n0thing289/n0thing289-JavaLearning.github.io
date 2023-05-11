package tankgame03;

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
            System.out.println("x:" + bulletX + " y:" + bulletY);
            if(!(bulletX > 0 && bulletX < fireRange && bulletY < fireRange && bulletY > 0)){
                isLive = false;
                break;
            }

        }
    }
}
