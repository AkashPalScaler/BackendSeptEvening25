package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();

        numlist.add(2);
        numlist.add(1);
        numlist.add(4);

        Collections.sort(numlist);

        System.out.println(numlist);

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Akash", 24, 94));
        studentList.add(new Student("Sachin", 30, 100));
        studentList.add(new Student("Biswajit", 29, 91));
        studentList.add(new Student("Sajid", 35, 96));

        Collections.sort(studentList, new StudentMarksComparator());
        for(Student s : studentList){
            System.out.println(s.getName() + " | " + s.getAge() + " | " + s.getMarks());
        }
        // My collections.sort either accepts a List of comparable type or expects a comparator

    }
}
