import java.util.ArrayList;

public class Test {

    /**
     * This is the Test class for testing custom lists
     * @author Shambonik
     */
    public static void main(String[] args) {
        System.out.println("Тест BoundedWaitList: ");
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(3);
        System.out.println("Добавление(1)");
        boundedWaitList.add(1);
        System.out.println("Добавление(2)");
        boundedWaitList.add(2);
        System.out.println("Добавление(3)");
        boundedWaitList.add(3);
        System.out.println("Добавление(4)");
        boundedWaitList.add(4);
        System.out.println("Capacity: " + boundedWaitList.getCapacity());
        System.out.println(boundedWaitList);
        boundedWaitList.remove();
        System.out.println("remove() " + boundedWaitList );
        System.out.println("contains 2 "+boundedWaitList.contains(2));
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        System.out.println("containsAll "+ arr + " " + boundedWaitList.containsAll(arr));
        arr.add(1);
        System.out.println("containsAll "+ arr + " " + boundedWaitList.containsAll(arr));
        System.out.println("isEmpty " + boundedWaitList.isEmpty() + "\n");

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        System.out.println("Тест UnfairWaitList: ");
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        System.out.println(unfairWaitList);
        System.out.print("Метод moveToBack: ");
        unfairWaitList.moveToBack(2);
        System.out.println(unfairWaitList);
    }
}
