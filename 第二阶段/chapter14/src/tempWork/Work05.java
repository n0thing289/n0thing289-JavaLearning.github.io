package tempWork;

public class Work05 {

    public static void main(String[] args) {
        Bill bill = new Bill(200, 1000);
        while (!(bill.benefit < 200)) {
            bill.showPrice();
            bill.showBenefit();
            bill.showAmount();
        }
    }
}

class Bill {
    double price = 200;
    double benefit = 1000;

    public Bill() {
    }

    public Bill(double price, double benefit) {
        this.price = price;
        this.benefit = benefit;
    }

    public void showPrice() {
        System.out.println("票价: " + price);
    }

    public void showBenefit() {
        System.out.println("余额: " + benefit);
    }

    public void showAmount() {
        if (!(benefit >= price)) {
            System.out.println("你还差 " + (price - benefit) + " ￥");
        }

        //出票
        benefit -= price;
        System.out.println("出票成功!");
    }


}
