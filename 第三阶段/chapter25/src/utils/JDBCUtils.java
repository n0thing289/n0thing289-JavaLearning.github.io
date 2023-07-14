package utils;


import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    static{
        try {
            Properties properties = new Properties();
            properties.load(new FileReader("src\\mysql.properties"));
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        }catch (IOException e){
            // tips
            //1. 把编译异常转为允许异常
            //2. 调用者就可以有选择地捕获异常,还是默认处理异常
            throw new RuntimeException(e);//
        }
    }

    public static Connection getConnect(){

        try {
            Class.forName(driver);
            return DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(ResultSet set, Statement statement, Connection connection){
        try {
            if(set !=null){
                set.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
