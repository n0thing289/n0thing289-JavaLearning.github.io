package jdbc.resultset_;

import com.mysql.jdbc.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.Properties;

public class Re_ResultSet {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, SQLException {
        //1.
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.getDeclaredConstructor().newInstance();
        //2.
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        Connection connection = DriverManager.getConnection(url, user, password);

        //3.
        String sql = "select * from actor where id > ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 1);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");//  获取该行第一列数据
            String name = resultSet.getString("name");
            String sex = resultSet.getString("sex");
            Date date = resultSet.getDate("borndate");
            int phone = resultSet.getInt("phone");
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date + "\t" + phone);
        }

        //4.
        preparedStatement.close();
        resultSet.close();
        connection.close();
    }
}
