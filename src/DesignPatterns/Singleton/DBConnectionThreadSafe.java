package DesignPatterns.Singleton;

public class DBConnectionThreadSafe {
    private String url;
    private String password;
    private static DBConnectionThreadSafe instance = null;

    private DBConnectionThreadSafe(){}

    public static DBConnectionThreadSafe createInstance(){
        if(instance == null){
            synchronized (DBConnectionThreadSafe.class) {
                if (instance == null) {
                    instance = new DBConnectionThreadSafe();
                }
            }
        }

        return instance;
    }


}
