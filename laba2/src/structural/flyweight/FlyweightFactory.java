package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        pool.putIfAbsent(key, new Flyweight(key));
        return pool.get(key);
    }
}
