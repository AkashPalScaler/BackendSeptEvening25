package DesignPatterns.Builder;

public class Student {
    String name;
    String email;
    float psp;
    int age;

    public Student(StudentBuilder builder){
//        if(builder.email == null){
//            throw new RuntimeException("Email is mandatory");
//        }
//
//        if(builder.age < 18){
//            throw new RuntimeException("You should be 18 above");
//        }
//        if(builder.name == null){
//            throw  new RuntimeException("Name is mandatory");
//        }
        this.email = builder.email;
        this.name = builder.name;
        this.age = builder.age;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        String name;
        String email;
        float psp;
        int age;

        private StudentBuilder(){
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public float getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(float psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build(){
            if(this.email == null){
                throw new RuntimeException("Email is mandatory");
            }
            if(this.age < 18){
                throw new RuntimeException("You should be 18 above");
            }
            if(this.name == null){
                throw  new RuntimeException("Name is mandatory");
            }
            return new Student(this);
        }
    }
}
