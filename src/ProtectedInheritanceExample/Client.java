package ProtectedInheritanceExample;


import Inheritance.User;

public class Client {
    public static void main(String[] args) {

        User u = new User();
//        u.age = 20;

        Student s = new Student();
        s.setAge(20);


    }
}
