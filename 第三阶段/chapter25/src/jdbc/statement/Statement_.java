package jdbc.statement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * 演示sql注入的问题
 * 结论： statement不会在工作中用到
 */
public class Statement_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员名称：");
        String admin_user = scanner.nextLine();  // 细节：nextLine()不会被单引号, 空格截断
        System.out.println("请输入密码：");
        String admin_pwd = scanner.nextLine();

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
        String sql = "select name, pwd from admin where name = '" + admin_user + "' and pwd = '" + admin_pwd + "';";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()){
            System.out.println("恭喜，登录成功");
        }else{
            System.out.println("对不起登录失败");
        }
    }
}
