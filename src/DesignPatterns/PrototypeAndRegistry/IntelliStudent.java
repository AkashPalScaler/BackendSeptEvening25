package DesignPatterns.PrototypeAndRegistry;

public class IntelliStudent extends Student{
    int iq;

    public IntelliStudent(String name, int age, float psp, int iq) {
        super(name, age, psp);
        this.iq = iq;
    }

    public IntelliStudent(IntelliStudent ist) {
        super(ist);
        this.iq = ist.iq;
    }

    @Override
    public IntelliStudent copy() {
        return new IntelliStudent(this);
    }
}
