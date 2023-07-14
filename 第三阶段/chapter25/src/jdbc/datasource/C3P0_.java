package jdbc.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import utils.JDBCUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {
    @Test
    public void noC3P0() throws SQLException {
        for (int i = 0; i < 5000; i++) {
            Connection connect = JDBCUtils.getConnect();

//            connect.close();
        }
    }
    @Test
    //方式一, 相关参数在程序中指定
    public void testC3P0_01() throws Exception {
        //1. 创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2. 通过配置文件mysql.properties获取相关连接的信息
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        //给数据源 comboPooledDataSource 设置相关参数
        //注意连接管理是由 comboPooledDataSource 来管理的
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        comboPooledDataSource.setMaxPoolSize(50);

        //测试连接5000次操作
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            //取出一个连接
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("ok: " + (end - start));
    }
    @Test
    //方式二, 使用配置文件模板完成
    public void testC3P0_02() throws SQLException {
        //1. 将c3p0.config.xml 拷贝到src目录
        ComboPooledDataSource hsp_edu = new ComboPooledDataSource("hsp_edu");

        //2.
        Connection connection = hsp_edu.getConnection();
        System.out.println("ok");

        //3.
        connection.close();
    }


}
