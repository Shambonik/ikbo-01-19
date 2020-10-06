public class Test {
    public static void main(String[] args) {
        Nameable obj = new Planet("Earth");
        System.out.println(obj.getName());
        obj = new Dog("Tuzik");
        System.out.println(obj.getName());
    }
}
