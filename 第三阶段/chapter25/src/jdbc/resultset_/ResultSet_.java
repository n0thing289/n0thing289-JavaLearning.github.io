package jdbc.resultset_;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
/**
 *
 * */
public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
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
        String sql = "select * from actor;";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);//executeUpdate适用于dml语句，
        /*
        *
        +----+---------------------+-----+---------------------+-------+
        | id | name                | sex | borndate            | phone |
        +----+---------------------+-----+---------------------+-------+
        |  1 | 蔡徐坤              | 男  | 1970-11-11 00:00:00 | 110   |
        |  2 | 刘德华              | 男  | 1970-11-11 00:00:00 | 110   |
        |  3 | qaz                 | 男  | 1970-01-01 00:00:00 | 110   |
        |  4 | 复习连接方式2       | 男  | NULL                | NULL  |
        |  5 | 复习连接方式3       | 男  | NULL                | NULL  |
        |  6 | 复习连接方式4       | 男  | NULL                | NULL  |
        |  7 | 复习连接方式5       | 男  | NULL                | NULL  |
        +----+---------------------+-----+---------------------+-------+
        * */
        while (resultSet.next()) {  // 控制指针向下移动resultSet对象里的数组的指针
            int id = resultSet.getInt(1);//  获取该行第一列数据
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            int phone = resultSet.getInt(5);
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date + "\t" + phone);
        }
        //4.
        statement.close();
        connection.close();
        resultSet.close();
    }
}
