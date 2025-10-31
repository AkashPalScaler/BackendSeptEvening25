package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        //Solution 1
//        StudentBuilder builder = new StudentBuilder();
//        builder.setAge(18);
//        builder.setName("Akash");
//        builder.setPsp(10);
//        builder.setEmail("some@some.com");
//
//        Student s = new Student(builder);
//        //Solution 2
//        StudentBuilder builder = Student.getBuilder();
//        builder.setAge(18);
//        builder.setName("Akash");
//        builder.setPsp(10);
//        builder.setEmail("some@some.com");
//
//        Student s = new Student(builder);

//        //Solution 3
//        StudentBuilder builder = Student.getBuilder()
//                .setAge(18)
//                .setName("Akash")
//                .setPsp(10)
//                .setEmail("some@some.com");
//
//        Student s = new Student(builder);

        //Solution 4
        Student s = Student.getBuilder()
                .setAge(18)
                .setName("Akash")
                .setPsp(10)
                .setEmail("some@some.com")
                .build();










        System.out.println("DEBUG");
    }
}
