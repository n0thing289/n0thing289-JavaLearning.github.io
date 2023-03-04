package useCase;

public class OracleDB implements DBInterface{
    public void connect(){
        System.out.println("链接OracleDB");
    }
    public void close(){
        System.out.println("关闭OracleDB");
    }
}
