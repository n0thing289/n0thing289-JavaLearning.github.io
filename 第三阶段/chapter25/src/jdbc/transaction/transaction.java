package jdbc.transaction;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class transaction {
    /**
     * 执行一句就自动提交一句dml操作,如果中间有异常,下面的dml操作不会执行,但之前的dml提交了,那么数据就变得不完整了
     * */
    @Test
    public void noTransaction(){
        Connection connect = null;

        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance +100 where id = 2";
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        try {
            connect = JDBCUtils.getConnect();

            preparedStatement = connect.prepareStatement(sql);
            int i = preparedStatement.executeUpdate();
            i=i/0;
            preparedStatement2 = connect.prepareStatement(sql2);
            int i2 = preparedStatement2.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connect);
        }
    }
    @Test
    public void useTransaction(){
        Connection connect = null;

        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance +100 where id = 2";
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement2 = null;
        try {
            connect = JDBCUtils.getConnect();
            //将connection设置为不自动提交
            connect.setAutoCommit(false);
            preparedStatement = connect.prepareStatement(sql);
            int i = preparedStatement.executeUpdate();
            i=i/0;
            preparedStatement2 = connect.prepareStatement(sql2);
            int i2 = preparedStatement2.executeUpdate();

            //commit
            try {
                connect.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            try {
                System.out.println("执行发送异常,撤销操作");
                connect.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connect);
        }
    }
    /**
     * 在jdbc里面使用事务的三部曲
     * 1. 获得链接后，设置为不自动提交，setAutoCommit()
     * 2. 编写业务sql语句并执行,在末尾connect.commit()
     * 3. 在catch块中, connect.rollback()
     * */
}
