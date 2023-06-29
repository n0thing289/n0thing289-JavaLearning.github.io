package jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args) {
        MysqlJdbcImpl mysqlJdbc = new MysqlJdbcImpl();
        mysqlJdbc.getConnection();
        mysqlJdbc.crud();
        mysqlJdbc.close();
    }
}
