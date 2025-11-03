package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class GenericRegistry2 {
    private HashMap<String, Object> registry = new HashMap<>();

    void register(String key, Object obj){
        registry.put(key, obj);
    }
    Object get(String key){
        return registry.get(key);
    }
}
