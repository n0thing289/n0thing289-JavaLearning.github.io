package jdbc.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils_USE {
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
}
