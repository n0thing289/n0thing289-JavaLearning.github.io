package jdbc.quickstart;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//这是第一个jdbc程序
public class jdbc01 {
    public static void main(String[] args) throws SQLException {
        //前置工作: 创建目录放jar包,如何add as library
        //1. 注册驱动
        Driver driver = new Driver();
        //2. 得到连接
        //老韩解读
        //(1) jdbc:mysql:// 是规定好表示协议,通过jdbc的方式连接mysql
        //(2) localhost 是主机/IP地址
        //(3) 3306 是mysql服务的端口号
        //(4) /hsp_db02 是操作哪个数据库的意思
        //本质还是socket连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        // 将用户名和密码放入到properties对象中
        Properties properties = new Properties();
        // 这个user和passward是规定好了的
        properties.setProperty("user","root");
        properties.setProperty("password", "hsp");

        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
        //3. 执行sql语句
//        String sql = "insert into actor values(1, '刘德华','男','1970-11-11', '110')";
        String sql = "update actor set `name` = 'hwk' where id = 1";
        Statement statement = connect.createStatement();//发送sql语句,并返回生成的结果对象
        int rows = statement.executeUpdate(sql); // 如果是dml语句,返回的就是影响行数
        System.out.println(rows > 0?"成功":"失败");
//4. 关闭连接
        statement.close();
        connect.close();
    }
}
