package Constructors;

public class Exam {
    int exam_id;
    int marks;
    static int count;

    public Exam(){}

    public Exam(Exam exam){
        this.exam_id = exam.exam_id;
        this.marks = exam.marks;
    }
}
