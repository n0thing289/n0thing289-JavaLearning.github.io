package reviewutils;

import java.util.Properties;
import javax.sql.DataSource;
import java.io.*;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBCDruidUtils {
    //实现三个功能：配置环境和注册，获得连接，关闭连接

    //配置环境和注册
    private static DataSource ds;//import javax.sql.DataSource;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/druid.properties"));//io操作会抛异常
            ds = DruidDataSourceFactory.createDataSource(properties);//import com.alibaba.druid.pool.DruidDataSourceFactory;
        } catch (Exception e) {
            throw new RuntimeException(e);//编译异常转为运行异常,由调用者决定处理
        }

    }

    //获得连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();//抛异常
    }

    //关闭连接
    public static void close(Connection conn, Statement state, ResultSet rs) {

        try {
            if (conn != null) {
                conn.close();
            }
            if (state != null) {
                state.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
