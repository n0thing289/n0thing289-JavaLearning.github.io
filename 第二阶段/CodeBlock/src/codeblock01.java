public class codeblock01 {
    public static void main(String[] args) {
        Moive m1 = new Moive("你好");
        Moive moive = new Moive("唐探", 100, "陈思成");
    }
}

class Moive{
    private String name;
    private double price;
    private String director;


    {// 当我们不管调用那个构造器,创建对象都会先调用代码块的内容
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }
    public Moive(String name) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("Moive(String name) 被调用");
        this.name = name;
    }
    public Moive(String name, double price) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        this.name = name;
        this.price = price;
    }
    public Moive(String name, double price, String director) {
//        System.out.println("电影屏幕打开...");
//        System.out.println("广告开始...");
//        System.out.println("电影正式开始...");
        System.out.println("Moive(String name, double price, String director) 被调用");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
