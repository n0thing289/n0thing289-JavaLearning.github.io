package jdbc;


import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn_Re02 {
    public static void main(String[] args) {
        //1.

    }
    @Test
    public void connect01() throws SQLException {
        //1. 注册驱动
        Driver driver = new com.mysql.jdbc.Driver();

        String url = "jdbc:mysql://localhost:3306/hsp_db03";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        //2. 获得链接
        Connection connect = driver.connect(url, properties);

        System.out.println(connect);
        //3. dml
        String sql = "create table connect (id int, `name` varchar(32))";

        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows>=0?"ok":"error");

        //4. 关闭连接
        preparedStatement.close();
        connect.close();
    }
    @Test
    public void connect02() throws SQLException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. 注册驱动
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.getDeclaredConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db03";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        //2. 获得链接
        Connection connect = driver.connect(url, properties);

        System.out.println(connect);
        //3. dml
        String sql = "create table connect (id int, `name` varchar(32))";

        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows>=0?"ok":"error");

        //4. 关闭连接
        preparedStatement.close();
        connect.close();
    }

    public void connect03() throws ClassNotFoundException, NoSuchMethodException, SQLException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. 注册驱动
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.getDeclaredConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db03";

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");

        DriverManager.registerDriver(driver);
        //2. 获得链接
        Connection connect = DriverManager.getConnection(url, properties);

        System.out.println(connect);
        //3. dml
        String sql = "create table connect (id int, `name` varchar(32))";

        PreparedStatement preparedStatement = connect.prepareStatement(sql);

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows>=0?"ok":"error");

        //4. 关闭连接
        preparedStatement.close();
        connect.close();
    }

    public void connect04() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    public void connect05(){

    }
}
