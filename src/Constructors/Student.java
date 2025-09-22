package Constructors;

public class Student {
    public String name;
    private int age;
    String course; //default
    protected float psp;
    Exam exam;
    static int count;

    //static block
    static {
        count = 10;
    }

    //Default Constructor - Only for understanding being written here(it is already present)
    // Default constructor is only provided by java if no other constructor(any type) is written by user
//    public Student(){
//
//    }
    //Non-parameterised
    public Student(){
        this.name = "Default";
        age = 18;
        course = "Default";
        psp = 100;
        exam = new Exam();
        count++;
    }

    //Parameterised constructor
    public Student(String name, int age, String course){
        // this refers to the current object created - with default vals for params
        this.name = name;
        if(age > 18){
            this.age = age;
        }
        this.course = course;
        count++;
    }

    public void someFun(){
        //this refers to the object calling the function
        this.name = "Sam";
    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.course = other.course;
//        this.exam = other.exam; //shallow copy
        this.exam = new Exam(other.exam);
        count++;
    }

    public static void printStudentCount(){
        int x = 10;
//        name = "Akash"; // Can't access non static variables from static context/function
        //but vice versa works i.e. can call static vars from non-static
        System.out.println("Student count = " + count);
    }

    public void doSome(){
        System.out.println(count);
        Student.printStudentCount();
    }
    // I can access non-static members through object if passed
    public static void something(Student s){
        s.age = 20;
        System.out.println(s.name);
        printStudentCount();
    }


}
