package Constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();

        Student s1 = new Student("Akash", 20, "somebatch");

        Student s2 = s;
        Student s3 = new Student(s);
//        s.someFun();
        System.out.println(Student.count);
        System.out.println(s.count); // Do not access static members through objects
        System.out.println(Exam.count);

        Student.printStudentCount();
        Student.something(s1);

        System.out.println("DEBUG");

    }
}
