package DesignPatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    //HW convert this into singleton
    private HashMap<String, Student> registry = new HashMap<>();

    void register(String key, Student obj){
        registry.put(key, obj);
    }
    Student get(String key){
        return registry.get(key).copy();
    }
}
