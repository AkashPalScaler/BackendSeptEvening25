package DesignPatterns.Singleton;

public class DbConnectionCreation implements Runnable{
    @Override
    public void run() {
        DBConnectionThreadSafe db1 = DBConnectionThreadSafe.createInstance();
        System.out.println("Object : "+ db1);
    }
}
