package jdbc.preparedstatement;


import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.util.Properties;
import java.util.Scanner;

public class PreparedStatementDML {
    public static void main(String[] args) throws Exception {
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
//        String sql = "insert into admin values(?,?)";
        String sql = "update admin set pwd = ? where `name` = ?";
        java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(2, admin_user);
        preparedStatement.setString(1, admin_pwd);
        int rows = preparedStatement.executeUpdate();// 不用写sql
        System.out.println(rows>=0?"ok":"error");

        //4. 执行
        preparedStatement.close();
        connection.close();
    }
}
