package afterpoly;

public class test01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog wangcai = new Dog("wangcai");
        Cat lihuamao = new Cat("lihuamao");

        Bone bone = new Bone("bone");

        Fish hhy = new Fish("黄花鱼");


//        tom.feed(wangcai, bone);
//        tom.feed(lihuamao, hhy);

        tom.feed(wangcai, bone);

        //给小花猪喂食
        Pig pig = new Pig("pig");
        Rice rice = new Rice("rice");
        tom.feed(pig, rice);
    }
}
