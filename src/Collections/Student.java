package Collections;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private Integer marks;

    public Student(String name, Integer age, Integer marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        //this, o
        // +ve means swap | 0,-ve no swap
//       if(o.age - this.age  == 0){
//           return o.marks - this.marks;
//       }else{
           return o.age-this.age;
//       }
    }
}
