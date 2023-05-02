package g_properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        // 使用Properties

        //创建
        Properties properties = new Properties();
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "汤姆");//1. 注意保存的时候,是中文的unicode码值(当你用字节流存, 字符流存就是直接是中文)
        properties.setProperty("pwd", "666");//3. 底层使用hashtable, 所以再次用就是覆盖旧值

        properties.store(new FileOutputStream("src\\mysql2.properties"), null);//2. null的位置是一个注释
    }
}
