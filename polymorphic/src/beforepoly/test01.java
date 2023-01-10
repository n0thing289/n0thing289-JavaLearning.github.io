package beforepoly;

public class test01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog wangcai = new Dog("wangcai");
        Cat lihuamao = new Cat("lihuamao");

        Bone bone = new Bone("bone");

        Fish hhy = new Fish("黄花鱼");


        tom.feed(wangcai, bone);
        tom.feed(lihuamao, hhy);
    }
}
