package ProtectedInheritanceExample;

import Inheritance.User;

public class Student extends User {
    void something(){
        this.age = 20; // Protected member of a class from a diff package can only be accessed inside it's child class
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
}
// new Student();