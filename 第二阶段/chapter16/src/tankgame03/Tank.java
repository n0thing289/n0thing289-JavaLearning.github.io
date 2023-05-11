package tankgame03;

public class Tank {
    private int x;
    private int y;
    private int direct;//// 0向上 1向右 2向下 3向左
    private int speed = 1;
    private Bullet bullet;
    private Thread bulletThread;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //在面板中修改坐标setX getY不如写过一个方法
    public void moveUp() {
        y -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    //发射子弹方法
    public void shot(int x, int y, int direct) {
        //接收炮管头的坐标，和方向
//        bullet.setBulletX(x);
//        bullet.setBulletY(y);
//        bullet.setDirect(direct);
        bullet = new Bullet(x, y, direct,400);
        bulletThread = new Thread(bullet);
        bulletThread.start();

    }
}
