package utils;

import org.junit.Test;

import java.sql.*;

public class use {
    @Test
    public void testQuery(){
        Connection connect = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            connect = JDBCUtils.getConnect();
            String sql = "select * from actor;";
            preparedStatement = connect.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                System.out.println(id +"\t"+ name +"\t"+ sex +"\t"+ borndate +"\t"+ phone);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(resultSet, preparedStatement,connect );
        }



    }
    @Test
    public void testDML(){
        Connection connect = null;

        String sql = "update actor set name = ? where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            connect = JDBCUtils.getConnect();
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1,"周新驰");
            preparedStatement.setInt(2,4);

            int i = preparedStatement.executeUpdate();
            System.out.println(i>=0?"ok":"no");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connect);
        }

    }
}
