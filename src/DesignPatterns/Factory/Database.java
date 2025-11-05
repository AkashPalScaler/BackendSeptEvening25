package DesignPatterns.Factory;

public interface Database {
    Query createQuery(String queryparam);
}
