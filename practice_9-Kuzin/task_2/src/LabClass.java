import java.util.ArrayList;

public class LabClass extends ArrayList<Student>{
    public LabClass() {
        super();
    }

    public void add(String name, int grade){
        add(new Student(name, grade));
    }

    public Student findByName(String name) throws StudentNotFoundException, EmptyStringException{
        for(int i = 0; i<size(); i++){
            Student student = get(i);
            if(student.equalsName(name)) return student;
        }
        throw new StudentNotFoundException();
    }
}
