package map.quickstart;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "hsp");
        map.put("no2", "zwj");
        map.put("no2", "zwj");
        map.put(null,null);
        System.out.println(map);
    }
}
