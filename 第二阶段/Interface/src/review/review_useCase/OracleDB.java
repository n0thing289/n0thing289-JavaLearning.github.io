package review.review_useCase;


public class OracleDB implements DBInterface {
    @Override
    public void connect() {
        System.out.println("连接Oracle");
    }

    @Override
    public void stop() {
        System.out.println("断开Oracle");
    }
}
