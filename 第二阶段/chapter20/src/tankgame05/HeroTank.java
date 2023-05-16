package tankgame05;

import java.util.Vector;

public class HeroTank extends Tank {
    private Bullet bullet;
    private Thread bulletThread;
    private Vector<Bullet> bullets = new Vector<>(10);



    public HeroTank(int x, int y) {
        super(x, y);
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

    //发射子弹方法
    public void shot() {
        //只有5颗打完了才能再打，限制在5颗
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
        //实现了可以多次点j，发射多个子弹

        bullets.add(bullet);
        bulletThread = new Thread(bullet);
        bulletThread.start();

        System.out.println(bullets.size());
    }

}
