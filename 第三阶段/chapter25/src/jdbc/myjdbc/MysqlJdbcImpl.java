package jdbc.myjdbc;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到 mysql的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成 mysql 的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
