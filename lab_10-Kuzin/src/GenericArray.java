import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//task 2
public class GenericArray<E> {
    E[] array;

    public GenericArray(E[] array) {
        this.array = array;
    }

    @SuppressWarnings("unchecked")
    public GenericArray(){
        this.array = (E[]) new Objects[0];
    }

    public List<E> convertToList(){
        return new ArrayList<E>(Arrays.asList(array));
    }

    //task 3
    public E get(int index){
        return array[index];
    }

    public boolean isEmpty(){
        return array.length == 0;
    }


}
