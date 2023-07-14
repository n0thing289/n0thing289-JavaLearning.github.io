package jdbc.preparedstatement;

import java.io.FileReader;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Quiz {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        //1. 注册驱动
        Class.forName(driver);

        //2. 获得链接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. dml、query
        PreparedStatement preparedStatement = null;
//        for (int i = 0; i<5;i++){
//            String sql02 = "insert into admin values(?,?);";
//            preparedStatement = connection.prepareStatement(sql02);
//            preparedStatement.setString(1, i + 100 + "");
//            preparedStatement.setString(2, i + 200 + "");
//            int rows = preparedStatement.executeUpdate();
//            System.out.println(rows>=0?"ok":"error");
//        }
        //3
//        String sql = "update admin set `name` = ? where `name` = ?";
//        preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "king");
//        preparedStatement.setString(2, "tom");
//        int rows = preparedStatement.executeUpdate();
//        System.out.println(rows>=0?"ok":"error");
        //4
//        String sql = "delete from admin where `name` = ?";
//        preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, "100");
//        int rows = preparedStatement.executeUpdate();
//        System.out.println(rows>=0?"ok":"error");
        //
        String sql = "select * from admin";
        preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String u = resultSet.getString(1);
            String pwd = resultSet.getString(2);
            System.out.println(u + "\t" + pwd);
        }
        //4. 关闭
        preparedStatement.close();
        connection.close();
    }
}

class ReviewPreparedStatement {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "hsp";

        //1. 注册驱动
        Class.forName(driver);

        //2. 注册连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. dml/query
//        String querySql = "select * from emp where sal >= ?;";
//        /*  传统写法
//        Statement statement = connection.createStatement();
//        statement.executeQuery(querySql)
//        */
//        PreparedStatement preparedStatement = connection.prepareStatement(querySql);
//        preparedStatement.setInt(1, 2000);
//
//        ResultSet resultSet = preparedStatement.executeQuery();// 不用传querySql，
//        while (resultSet.next()) {
//            System.out.println(
//                    resultSet.getInt(1) + "\t" +
//                            resultSet.getString(2) + "\t" +
//                            resultSet.getString(3) + "\t" +
//                            resultSet.getInt(4) + "\t" +
//                            resultSet.getDate(5) + "\t" +
//                            resultSet.getDouble(6) + "\t" +
//                            resultSet.getDouble(7) + "\t" +
//                            resultSet.getInt(8));
//        }
        String dmlSql = "insert into actor values(?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(dmlSql);

        int id = 201;
        String name = "test";
        String sex = "男";
        Date borndate = Date.valueOf("2001-1-1");
        String phone = "12123";

        preparedStatement.setInt(1, id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,sex);
        preparedStatement.setDate(4, borndate);
        preparedStatement.setString(5, phone);

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows>0?"":"error");
        //4. 关闭资源
//        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
