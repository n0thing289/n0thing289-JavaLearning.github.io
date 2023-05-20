package tankgame06;

public class Tank {
    private int x;
    private int y;
    private int direct;//// 0向上 1向右 2向下 3向左
    private int speed = 1;
    //判断击中敌人需要用到宽高
    private int width;
    private int height;
    private boolean isLive = true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isLive() {
        return isLive;
    }

    public void setLive(boolean live) {
        isLive = live;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public void isBoundary(String type) {
        //新增功能2,让敌人在规定范围内移动
        //1. 拿到窗口大小
        //2. 拿到坦克坐标
        //3. 每次运动之前就先判断有没有到边界
        //4. 如果到了就立马随机换方向

        int windowWidth = HspTankGame06.sizeX;
        int windowHeight = HspTankGame06.sizeY;
        switch (type) {
            case "hero":
                break;
            case "enemy":
                //1. 要先根据当时的方向,拿到宽高
                //2. 在进行方向判断
                switch (direct) {
                    case 0:
                        //走到了上边界,只能方向是123 右下左
                        if (!(x > 0 && (x + 40) < windowWidth && y > 0 && (y + 60) < windowHeight)) {
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            //到了上边界或者下边界,只能左右或者反方向的上边界或下边界
                            int flag;
                            do {
                                flag = (int) (Math.random() * 4);
                            } while (flag == 0);// 我先试着随机一次,如果还是0,就再次随机
                            setDirect(flag);

                        }
                        break;
                    case 2:
                        //走到了下边界,只能方向是013 左上右
                        if (!(x > 0 && (x + 40) < windowWidth && y > 0 && (y + 60) < windowHeight)) {
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            //到了上边界或者下边界,只能左右或者反方向的上边界或下边界
                            int flag;
                            do {
                                flag = (int) (Math.random() * 4);
                            } while (flag == 2);// 我先试着随机一次,如果还是2,就再次随机
                            setDirect(flag);

                        }
                        break;
                    case 1:
                        //走到了右边界,只能方向是032 左上下
                        if (!(x > 0 && (x + 60) < windowWidth && y > 0 && (y + 40) < windowHeight)) {
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            int flag;
                            do {
                                flag = (int) (Math.random() * 4);
                            } while (flag == 1);// 我先试着随机一次,如果还是2,就再次随机
                            setDirect(flag);

                        }
                        break;
                    case 3:
                        if (!(x > 0 && (x + 60) < windowWidth && y > 0 && (y + 40) < windowHeight)) {
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            int flag;
                            do {
                                flag = (int) (Math.random() * 4);
                            } while (flag == 3);// 我先试着随机一次,如果还是2,就再次随机
                            setDirect(flag);

                        }
                        break;
                }

        }


    }

    public void outOfBoundaryMove() {
        for (int i = 0; i < 30; i++) {
            switch (direct) {
                case 0:
                    moveUp();
                    break;
                case 1:
                    moveRight();
                    break;
                case 2:
                    moveDown();
                    break;
                case 3:
                    moveLeft();
                    break;
            }
        }

    }

//    public void isOverLap(Tank tank) {
//        //不断拿到两个坐标（自己的，和对方的）
//        //每次移动前先计算两个参考点的距离
//        int otherDirect = tank.getDirect();
//        int x1 = tank.getX();
//        int y1 = tank.getY();
//        int x2 = this.getX();
//        int y2 = this.getY();
//        int dx = x2 - x1;
//        int dy = y2 - y1;
//        switch (this.direct) {
//            case 0:
//                if (otherDirect == 0 || otherDirect == 2) {
//                    if (((y2 - y1) <= 60) && (((x2 - x1) < 40 || (x2 - x1) > -40))) {
//                        System.out.println("shuzhi重叠了");
//                    }
//                } else {
//                    if (((y2 - y1) <= 40) && (((x2 - x1) < 60 || (x2 - x1) > -40))) {
//                        System.out.println("水平重叠了");
//                    }
//                }
//                break;
//            case 2:
//                if (otherDirect == 0 || otherDirect == 2) {
//                    if (dy >= -60 && ((x2 - x1) < 40 || (x1 - x2) < 40)) {
//                        System.out.println("333");
//                    }
//                } else {
//                    if (dy >= -60 && ((x2 - x1 < 60 || (x1 - x2) < 40))) {
//                        System.out.println("444");
//                    }
//                }
//                break;
//            case 1:
//                if (otherDirect == 0 || otherDirect == 2) {
//                    if ((x1 - x2) <= 60 && ((y1 - y2) < 40 || (y2 - y1) < 60)) {
//                        System.out.println("555");
//                    }
//                } else {
//                    if ((x1 - x2) <= 60 && ((y1 - y2) < 40 || (y2 - y1) < 40)) {
//                        System.out.println("666");
//                    }
//                }
//                break;
//            case 3:
//                if (otherDirect == 0 || otherDirect == 2) {
//                    if ((x2 - x1) <= 40 && ((y1 - y2) < 40 || (y2 - y1) < 60)) {
//                        System.out.println("777");
//                    }
//                } else {
//                    if ((x2 - x1) <= 60 && ((y1 - y2) < 40 || (y2 - y1) < 40)) {
//                        System.out.println("888");
//                    }
//                }
//                break;
//        }
//    }
}



