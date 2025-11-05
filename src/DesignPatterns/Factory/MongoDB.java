package DesignPatterns.Factory;

public class MongoDB implements Database {

    @Override
    public Query createQuery(String queryparam) {
        return new NOSQLQuery();
    }
}
