import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private int IdNumber;
    private String name;
    private int grade;

    public Student(int idNumber, String name) {
        IdNumber = idNumber;
        this.name = name;
    }

    public Student(int idNumber, String name, int grade) {
        IdNumber = idNumber;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(grade, o.getGrade());
    }

    public int getGrade() {
        return grade;
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public String getName() {
        return name;
    }
}
