package jdbc.myjdbc;

public interface JdbcInterface {
    public Object getConnection();

    //crud
    public void crud();

    //关闭连接
    public void close();
}
