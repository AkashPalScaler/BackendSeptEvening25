package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class GenericRegistry<T> {
    private HashMap<String, T> registry = new HashMap<>();

    void register(String key, T obj){
        registry.put(key, obj);
    }
    T get(String key){
        return registry.get(key);
    }
}
