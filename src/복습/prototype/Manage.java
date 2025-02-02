package 복습.prototype;

import java.util.HashMap;
import java.util.Map;

public class Manage {
    private static Manage instance = new Manage();

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product getProduct(String name) {
        return showcase.get(name).createCopy();
    }

    public static Manage getInstance() {
        return instance;
    }
}
