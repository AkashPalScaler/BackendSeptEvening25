package DesignPatterns.PrototypeAndRegistry;

public class Client {
    static StudentRegistry studentRegistry = new StudentRegistry();
    public static void setupRegistry(){
        //Prototypes registered
        studentRegistry.register("Student", new Student("Akash", 29, 10));
        studentRegistry.register("IntelliStudent", new IntelliStudent("Pramod", 30, 89, 100));
    }
    public static void main(String[] args) {
        setupRegistry();


        IntelliStudent ogIStud = (IntelliStudent) studentRegistry.get("IntelliStudent");
        Student student = studentRegistry.get("Student");

        ogIStud.copy();

        GenericRegistry<Student> studentRegistry2 = new GenericRegistry<>();
        studentRegistry2.register("Student", new Student("Akash", 29, 10));
        studentRegistry2.register("IntelliStudent", new IntelliStudent("Pramod", 30, 89, 100));


    }
}
