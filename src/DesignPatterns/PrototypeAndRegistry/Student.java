package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    String name;
    int age;
    float psp;

    public Student(String name, int age, float psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
