package useCase;

public class Mysql implements DBInterface{
    public void connect(){
        System.out.println("链接Mysql");
    };
    public void close(){
        System.out.println("关闭Mysql");
    }
}
