package AccessModifier;

import IntroToOOPs.Student;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sam";
//        s.age = 20; //private
//        s.psp = 20; // protected -> can be access based on a condition (inheritance)
//        s.course = "lld"; // can't ever be access
    }
}
