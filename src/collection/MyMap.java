package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Name  wanghongwei
 * Date  2017/6/9
 */
public class MyMap {
    public static void main(String[] args) {
        Map map = new HashMap<String,String>();
        map.put("1","2");
        map.put("2","3");
        Properties properties = new Properties();
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
    }
}
