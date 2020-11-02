import java.util.ArrayList;

public class InsertionSort {

    private static void swap(ArrayList<Student> array, int first, int second){
        Student k = array.get(first);
        array.set(first, array.get(second));
        array.set(second, k);
    }

    private static void insertionSort(ArrayList<Student> array){
        for(int i=1;i<array.size();i++)
            for(int j=i;j>0 && array.get(j-1).getIdNumber()>array.get(j).getIdNumber();j--)
                swap(array, j-1, j);
    }

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student(2, "Danil"));
        array.add(new Student(4, "Denis"));
        array.add(new Student(1, "Anna"));
        array.add(new Student(6, "Vladimir"));
        array.add(new Student(5, "Alexander"));
        array.add(new Student(8, "Jane"));
        insertionSort(array);
        for (int i = 0; i<array.size(); i++){
            System.out.println(array.get(i).getIdNumber() + " " +  array.get(i).getName());
        }
    }
}
