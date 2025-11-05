package DesignPatterns.Factory;

public class MySQLDB implements Database{
    //properties
    @Override
    public Query createQuery(String queryparam) {
        return new SQLQuery();
    }
}
