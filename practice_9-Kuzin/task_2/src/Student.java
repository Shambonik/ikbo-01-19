public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public boolean equalsName(String name) throws EmptyStringException{
        if(name.equals("")) throw new EmptyStringException();
        return this.name.equals(name);
    }
}
