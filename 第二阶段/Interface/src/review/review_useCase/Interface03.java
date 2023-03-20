package review.review_useCase;

public class Interface03 {
    public static void t(DBInterface dbInterface) {
        dbInterface.connect();
        dbInterface.stop();
    }
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        OracleDB oracleDB = new OracleDB();

        t(mysql);
        t(oracleDB);
    }
}
//接口的用法
//先规定一个接口
//让设备去各自实现接口
//再写一个方法，去接收这个接口的引用

