package map.implement_class.Properties;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        //1. 继承了 Hashtable
        //2. 可以通过k-v存放数据,当然k-v都不能为null

        Properties properties = new Properties();
//        properties.put(null,"abc");
//        properties.put("abc", null);

        // 增加
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);//修改 会被替换v
        System.out.println(properties);

        //获取
        System.out.println(properties.get("lic"));//88

        //删除
        properties.remove("lic");
        System.out.println(properties);


    }
}
