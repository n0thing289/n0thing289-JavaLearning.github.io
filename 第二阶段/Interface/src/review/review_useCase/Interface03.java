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
