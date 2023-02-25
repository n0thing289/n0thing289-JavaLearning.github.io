public class ChildGame {
    public static void main(String[] args) {
//        int count = 0;

        Child qwe = new Child("qwe");
        qwe.join();
        qwe.count++;

        Child asd = new Child("asd");
        asd.join();
        asd.count++;

        Child zxc = new Child("zxc");
        zxc.join();
        zxc.count++;

        System.out.println("共"+ Child.count + " 个小孩在玩");
        System.out.println("共"+ qwe.count + " 个小孩在玩");
        System.out.println("共"+ asd.count + " 个小孩在玩");
        System.out.println("共"+ zxc.count + " 个小孩在玩");
    }
}

class Child{
    private String name;
    public static int count = 0;
    public Child(String name){
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入了游戏。。");
    }
}
