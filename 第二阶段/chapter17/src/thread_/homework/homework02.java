package thread_.homework;

public class homework02 {
    public static void main(String[] args) {
        Card card = new Card(10000);
        Thread user_thread01 = new Thread(new User(card), "用户一");
        Thread user_thread02 = new Thread(new User(card), "用户二");
        user_thread01.start();
        user_thread02.start();

    }
}

class Card {
    private double benefit = 10000;

    public Card() {
    }

    public Card(double benefit) {
        this.benefit = benefit;
    }

    public double getBenefit() {
        return benefit;
    }

    public void setBenefit(double benefit) {
        this.benefit = benefit;
    }
}

class User implements Runnable {
    private Card card;

    public User(Card card) {
        this.card = card;
    }

    public void draw() {
        while (true) {
            synchronized (card) {//这句话的意思就是对card对象上锁,也就是同一时间,能操作card相关的数据的线程只能进一个(因为有两个线程用户在同时对一张卡取钱)
                if (card.getBenefit() < 1000) {
                    System.out.println("余额不足.无法取钱");
                    break;
                }
                double b = card.getBenefit() - 1000;
                card.setBenefit(b);
            }
            System.out.println(Thread.currentThread().getName() + "正在取钱, 取后余额: " + card.getBenefit());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void run() {
        this.draw();
    }
}