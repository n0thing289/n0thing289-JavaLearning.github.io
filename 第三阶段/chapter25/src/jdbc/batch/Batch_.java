package jdbc.batch;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    @Test
    public void noBatch() throws SQLException {
        long start = System.currentTimeMillis();
        Connection connect = JDBCUtils.getConnect();
        String sql = "insert into admin2 values(null, ?,?);";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666" + i);
            preparedStatement.executeUpdate();
        }
        JDBCUtils.close(null, preparedStatement, connect);
        long over = System.currentTimeMillis();
        System.out.println("time: " + (over - start) + "s");//time: 136354s
    }

    @Test
    public void batch() throws SQLException {
        long start = System.currentTimeMillis();
        Connection connect = JDBCUtils.getConnect();
        connect.setAutoCommit(false);
        String sql = "insert into admin2 values(null, ?,?);";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666" + i);
//            preparedStatement.executeUpdate();
            //将sql语句加入到批处理包中
            preparedStatement.addBatch();
            //当有一千条记录时再批量执行
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }
        }
        connect.commit();
        JDBCUtils.close(null, preparedStatement, connect);
        long over = System.currentTimeMillis();
        System.out.println("time: " + (over - start) + "s");
    }

    /**
     * 批处理步骤
     * 1. 修改配置文件,url后面 ?rewriteBatchedStatements=true
     * 2. 关闭自动提交, 操作sql完后再手动commit
     * 3. addBatch()
     * 4. 设定缓存区间,比如满1000条批量执行一次, executeBatch()
     * 5. 清空一批, clearBatch()
     */
    @Test
    public void reNoBatch() throws SQLException {
        //获得连接
        Connection connect = JDBCUtils.getConnect();
        PreparedStatement preparedStatement = null;

        long start = System.currentTimeMillis();
        //执行sql
        String sql = "insert into admin2 values(null, ?,?);";
        for (int i = 0; i < 5000; i++) {
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, "jack");
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

        //关闭连接
        JDBCUtils.close(null, preparedStatement, connect);
    }
    @Test
    public void reBatch() throws SQLException {
        //1. 获得连接
        Connection connect = JDBCUtils.getConnect();
        connect.setAutoCommit(false);
        //2. sql
        /*
        //1. 修改配置文件 ?rewriteBatchedStatements=true
        //2. 关闭自动提交， 写完后手动提交
        //3. addBatch()
        //4. executeBatch() + clearBatch()
         */
        String sql = "insert into admin2 values(null, ?, ?);";
        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack");
            preparedStatement.setString(2, "666");

            preparedStatement.addBatch();
            if((i+1) % 1000 == 0){
                System.out.println("批量处理ing");
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
        connect.commit();
        JDBCUtils.close(null, preparedStatement,connect);
    }

}
