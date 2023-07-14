package jdbc;


import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConn {
    public static void main(String[] args) {

    }
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password", "hsp");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    public void connect02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.getDeclaredConstructor().newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password", "hsp");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    public void connect03() throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.getDeclaredConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";

        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {// 系统帮你注册驱动
        /*
        *   底层源码（反编译com.mysql.jdbc.Driver）
                static {
                    try {
                        DriverManager.registerDriver(new Driver());
                    } catch (SQLException var1) {
                        throw new RuntimeException("Can't register driver!");
                    }
                }
        * */
//        Class.forName("com.mysql.jdbc.Driver");
        // 细节
        //1. Class.forName("com.mysql.jdbc.Driver"); 在高版本的jdk和mysql中也可以不写

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

    }
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class<?> aClass = Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }
    @Test
    @SuppressWarnings({"all"})
    public void TestHomework01() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\fangshiwuWork.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        String createTableSql = "create table news(id int, `title` varchar(32));";

        String content01Sql = "insert into news values(1, '蔡徐坤1'),(2,'蔡徐坤2'),(3, '蔡徐坤3'),(4,'蔡徐坤4'),(5, '蔡徐坤5');";

        String contentUpdate01 = "update news set `title` = '阿珍爱上了阿强' where id = 1;";

        String deleteId3 = "delete from news where id = 3;";
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(deleteId3);
        System.out.println(rows >= 0?"成功 rows:" + rows:"失败");

        statement.close();
        connection.close();
    }

    @Test
    public void Reconnect01() throws SQLException {
        //1. 注册驱动
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "hsp");
        //2. 获得连接
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);

        //3. dml
        String sql = "insert into actor values(3,'qaz','男', '1970-1-1', 110);";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows>0?"ok":"def");

        //4.
        statement.close();
        connect.close();
    }
    @Test
    public void ReConnect02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        //1. 注册驱动
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.getDeclaredConstructor().newInstance();
        //2. 获得连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password","hsp");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);

        //3. dml操作
        String sql = "insert into actor values(4, '复习连接方式2','男',null,null)";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows>0?"ok":"error");

        //4. 关闭
        statement.close();
        connect.close();
    }
    @Test
    public void ReConnect03() throws ClassNotFoundException, IOException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        //1. 注册链接
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.getDeclaredConstructor().newInstance();
        //2. 获得链接
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");

        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. dml操作
        String sql = "insert into actor values(5, '复习连接方式3','男',null,null)";
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows>0?"ok":"error");

        //4.
        statement.close();
        connection.close();
    }
    @Test
    public void ReConnect04() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        //1. 注册链接
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
//        Driver driver = (Driver) aClass.getDeclaredConstructor().newInstance();
        //2. 获得连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "hsp";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. dml操作
        String sql = "insert into actor values(6,'复习连接方式4','男',null,null);";
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows>0?"ok":"error");
        //4.
        statement.close();
        connection.close();

    }
    @Test
    public void ReConnect05() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        //1. 注册驱动
        Class.forName(driver);

        //2. 获得连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. dml语句
        String sql = "insert into actor values(7, '复习连接方式5','男',null,null);";
        Statement statement = connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows>0?"ok":"error");

        //4.
        statement.close();
        connection.close();

    }
}


