package jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils_USE {
    //土方法实现DBUtils的封装结果集的代码
    public void testQueryToArrayList() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList<>();
        try {
            connection = JDBCUtilsByDruid.getConnection();
            String sql = "select * from actor;";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
//            connection.close();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                list.add(new Actor(id, name, sex, borndate, phone));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);

            System.out.println(list);
        }
    }

    @Test
    public void testManyQuery() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();

        String sql = "select id,name from actor where id >= ?";

        QueryRunner queryRunner = new QueryRunner();
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for (Actor actor :
                list) {
            System.out.println(actor);
        }
        JDBCUtilsByDruid.close(null, null, connection);
    }
    @Test
    //演示apache + druid 完成返回的结果是单行记录(BeanHandler)，
    public void testQuerySingle() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select id,name from actor where id = ?";
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class),2);
        System.out.println(actor);

        JDBCUtilsByDruid.close(null,null,connection);

    }

    @Test
    //演示apache + druid 完成返回的结果是单行单列(ScalarHandler)，
    public void testScalar() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id = ?";
        Object actor = queryRunner.query(connection, sql, new ScalarHandler(),2);
        System.out.println(actor);

        JDBCUtilsByDruid.close(null,null,connection);

    }
    @Test
    //演示apache + druid 完成dml，
    public void testDML() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "update actor set name = ? where id = ?;";
        int affectedRow = queryRunner.update(connection, sql, "张三丰", 4);
        System.out.println(affectedRow>0?"执行成功":"执行没有影响到表");

        JDBCUtilsByDruid.close(null,null,connection);
    }
}
