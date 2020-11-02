import java.util.ArrayList;

public class QuickSort {

    private static void swap(ArrayList<Student> array, int first, int second){
        Student k = array.get(first);
        array.set(first, array.get(second));
        array.set(second, k);
    }

    private static void qsort (ArrayList<Student> array, int b, int e)
    {
        int l = b, r = e;
        Student piv = array.get((l + r) / 2);
        while (l <= r)
        {
            while (array.get(l).compareTo(piv) < 0)
                l++;
            while (array.get(r).compareTo(piv) > 0)
                r--;
            if (l <= r)
                swap(array, l++, r--);
        }
        if (b < r)
            qsort (array, b, r);
        if (e > l)
            qsort (array, l, e);
    }

    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        array.add(new Student(2, "Danil", 262));
        array.add(new Student(4, "Denis", 262));
        array.add(new Student(1, "Anna", 243));
        array.add(new Student(6, "Vladimir", 254));
        array.add(new Student(5, "Alexander", 248));
        array.add(new Student(8, "Jane", 274));
        array.add(new Student(7, "Jane", 260));
        qsort(array, 0, array.size()-1);
        for(int i = 0; i<array.size(); i++){
            System.out.println(array.get(i).getGrade() + " " + array.get(i).getName());
        }
    }
}
