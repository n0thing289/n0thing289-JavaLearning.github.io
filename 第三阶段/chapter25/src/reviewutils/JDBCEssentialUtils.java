package reviewutils;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class JDBCEssentialUtils {
    //实现三个功能：配置环境和注册，获得连接，关闭连接
    //配置环境和注册
    private static final String url = "jdbc:mysql://localhost:3306/hsp_db02";
    private static final String user = "root";
    private static final String pwd = "hsp";

    static{
        try{
            Class.forName("com.mysql.jdbc.driver");
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    //获得连接
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user,pwd);
    }

    //关闭连接
    public static void close(Connection conn, Statement stat, ResultSet rs){
        try{
            if(conn != null){
                conn.close();
            }
            if(stat != null){
                stat.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

}
