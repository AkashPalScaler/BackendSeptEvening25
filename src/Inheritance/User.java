package Inheritance;

public class User {
    String name;
    private String password;
    protected int age;

    public User(){
        //this calls own class constructor
        System.out.println("User default constructor called");

    }

    public User(String name){
        this.name = name;
    }

    public User(String name, String password){
        this(name);
        this.password = password;
        System.out.println("User - Parameterized constructor is called");
    }

    public User(String name, String password, int age){
        this(name, password);
        this.age = age;
        System.out.println("User - Parameterized constructor is called");
    }
    // constructor chaining - telescoping constructor

    void login(){
        System.out.println("Login");
    }

    public void setPassword(String password){
        this.password = password;
    }
}
