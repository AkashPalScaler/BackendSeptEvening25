package Inheritance;

public class Student extends User {
    float psp;


    public Student(){
        // super needs to be the first line
        // super calls the parent constructor - not to create parent object, but to initialise parent's inherited properties
        super("Akash", "opass");
        System.out.println("Student default constructor called");

    }

    void rateClass(){
        System.out.println("rating");
        System.out.println(age);
//        System.out.println(password);
    }
}
// order of calling and order of execution
// Student called
// User called
// User execution will be done
// Student execution will be done