package DesignPatterns.Singleton;

public class DBConnection {
    private String url;
    private String password;
    private String username;
    private static DBConnection instance = null;

    private DBConnection(){}

    public static DBConnection createInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }


}
