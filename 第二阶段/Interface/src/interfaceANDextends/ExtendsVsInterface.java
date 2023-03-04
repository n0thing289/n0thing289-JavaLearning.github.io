package interfaceANDextends;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        litterMonkey litterMonkey = new litterMonkey("悟空");
        litterMonkey.climb();

        litterMonkey.swimming();
    }
}

class Monkey{
    private String name;
    public Monkey(String name){
        this.name = name;
    }
    public void climb(){
        System.out.println(name + " 会爬树");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class litterMonkey extends Monkey implements Fishable, Birdable{
    public litterMonkey(String name){
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(super.getName() + " 习得了游泳");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " 习得了飞翔");
    }
}

interface Fishable{
    void swimming();
}

interface Birdable{
    void fly();
}