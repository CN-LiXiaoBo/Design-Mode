package 工厂模式;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * TODO
 *
 * @author 热爱生活の李
 * @version 1.0
 * @since 2023/2/20 20:41
 */
public class Coffee2 {
}
class CoffeeFactory2{
    private static Map<String,Coffee> map = new HashMap<>();
    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory2.class.getClassLoader().getResourceAsStream("Bean.properties");
        try {
            properties.load(is);
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet) {
                String property = properties.getProperty((String) key);
                Class<?> aClass = Class.forName(property);
                Coffee coffee = (Coffee) aClass.newInstance();
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Coffee getCoffee(String name){
        return map.get(name);
    }
}
