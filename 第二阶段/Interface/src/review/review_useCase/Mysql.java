package review.review_useCase;



public class Mysql implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }
    public void stop(){
        System.out.println("断开Mysql");
    }
}
