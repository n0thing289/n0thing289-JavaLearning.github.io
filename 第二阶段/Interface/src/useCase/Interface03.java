package useCase;

public class Interface03 {
    public static void main(String[] args) {
        Mysql mysql = new Mysql();
        t(mysql);

        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db){
        db.connect();
        db.close();
    }
}
