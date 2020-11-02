import java.util.ArrayList;

public class MergeSort {

    private static ArrayList<Student> MergeSort(ArrayList<Student> array){
        if(array.size()>1) {
            ArrayList<Student> arr1 = new ArrayList<>();
            int i = 0;
            for(; i<array.size() / 2; i++){
                arr1.add(array.get(i));
            }
            ArrayList<Student> arr2 = new ArrayList<>();
            for(; i<array.size(); i++){
                arr2.add(array.get(i));
            }
            arr1 = MergeSort(arr1);
            arr2 = MergeSort(arr2);
            return Merge(arr1, arr2);
        }
        return array;
    }

    private static ArrayList<Student> Merge(ArrayList<Student> arr1, ArrayList<Student> arr2){
        ArrayList<Student> result = new ArrayList<>();
        int first = 0;
        int second = 0;
        while(first<arr1.size() && second<arr2.size()){
            Student el1 = arr1.get(first);
            Student el2 = arr2.get(second);
            if (el1.compareTo(el2) <= 0) {
                result.add(el1);
                first++;
            } else {
                result.add(el2);
                second++;
            }
        }
        for(; first<arr1.size(); first++){
            result.add(arr1.get(first));
        }
        for(; second<arr2.size(); second++){
            result.add(arr2.get(second));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Student> arr1 = new ArrayList<>();

        arr1.add(new Student(2, "Danil", 284));
        arr1.add(new Student(4, "Denis", 256));
        arr1.add(new Student(1, "Anna", 283));
        arr1.add(new Student(6, "Vladimir", 294));

        ArrayList<Student> arr2 = new ArrayList<>();
        arr2.add(new Student(5, "Alexander", 278));
        arr2.add(new Student(8, "Jane", 264));
        arr2.add(new Student(7, "Jane", 234));
        arr2.add(new Student(1, "Anna", 283));


        arr1 = MergeSort(arr1);
        arr2 = MergeSort(arr2);

        ArrayList<Student> result = Merge(arr1, arr2);
        for(int i = 0; i<result.size(); i++){
            System.out.println(result.get(i).getGrade() + " " + result.get(i).getName());
        }
    }
}
