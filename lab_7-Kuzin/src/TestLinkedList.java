import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TestLinkedList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 10; i++){
            list.add(new Random().nextInt(50));
        }
        System.out.println("Изначальный list: " + list);

        System.out.println("Метод addFirst(): ");
        list.addFirst(in.nextInt());
        System.out.println("Метод addLast():");
        list.addLast(in.nextInt());
        System.out.println("Текущий list: " + list);

        list.removeFirst();
        System.out.println("Метод removeFirst(): " + list);
        list.removeLast();
        System.out.println("Метод removeLast(): " + list);

        System.out.println("Метод peekFirst(): " + list.peekFirst());
        System.out.println("Метод peekLast(): " + list.peekLast());

        System.out.println("Метод pollFirst(): " + list.pollFirst());
        System.out.println("Метод pollLast(): " + list.pollLast());
        System.out.println("Текущий list: " + list);

        System.out.println("Метод get(3): " + list.get(3));
        System.out.println("Метод size(): " + list.size());
        list.clear();
        System.out.println("Метод clear(): " + list);
    }
}
