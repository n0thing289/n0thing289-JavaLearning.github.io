package encapExercise;

public class Account {
    private String name;
    private String password;
    private double money;

    public Account() {
    }

    public Account(String name, String  password, double money) {
        setName(name);
        setPassword(password);
        setMoney(money);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            this.name = "undefined name";
            System.out.println("名字不符合规则，已给定你默认值");
        }
    }

    public void setPassword(String  password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            this.password = "123456";
            System.out.println("密码不符合要求，已设置成默认值");
        }
    }

    public void setMoney(double money) {
        if (money > 20) {
            this.money = money;
        } else {
            this.money = 21;
            System.out.println("余额不足，已给定你默认值");
        }
    }


    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public double getMoney() {
        return this.money;
    }

    public String info() {
        return "name: " + name + "  password: " + password + "  余额： " + money;
    }
}
