package jdbc.datasource;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JDBCUtilsByDruid_use {
    @Test
    public void testQuery(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtilsByDruid.getConnection();
            String sql = "select * from actor;";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
//            connection.close();
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
            JDBCUtilsByDruid.close(resultSet, preparedStatement,connection );
        }
    }


    // 用土办法封装到集合中
    public ArrayList<Actor> testQueryToArrayList(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList<>();
        try{
            connection = JDBCUtilsByDruid.getConnection();
            String sql = "select * from actor;";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
//            connection.close();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                list.add(new Actor(id,name, sex, borndate,phone));
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(resultSet, preparedStatement,connection );

            System.out.println(list);
        }
        return list;
    }
}
