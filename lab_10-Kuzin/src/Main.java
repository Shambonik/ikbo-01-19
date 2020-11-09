import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Object[] arr0 = {1, new GenericArray<Integer>(arr), "string"};
        System.out.println(convertToList(arr));
        System.out.println(convertToList(arr0));

        GenericArray<Object> genericArray = new GenericArray<>(arr0);
        System.out.println(genericArray.convertToList());
        System.out.println(genericArray.get(2));

        System.out.println(getByIndex(arr0, 0));

        printDir("D:\\");
    }

    //task 1
    private static <E> List<E> convertToList(E[] array){
        return new ArrayList<E>(Arrays.asList(array));
    }

    //task 3
    private static <E> E getByIndex(E[] array, int index){
        return array[index];
    }

    //task 4
    private static List<String> printDir(String path){
        File dir = new File(path);
        ArrayList<String> files = new ArrayList<>();
        if(dir.isDirectory()){
            for(File file: Objects.requireNonNull(dir.listFiles())){
                files.add(file.getName());
            }
            for(int i = 0 ; i<5 && i<files.size(); i++){
                System.out.println(files.get(i));
            }
        }
        return files;
    }

}
