package task_2;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Address("Россия, Свердловская область, Екатеринбург, Лермонтова, 11, 1, 16", ","));
        System.out.println(new Address("Россия, Свердловская область, Екатеринбург. Лермонтова, 11-1; 16"));
        System.out.println(new Address("Россия, Свердловская область, Первоуральск, Электриков, 15, 5, 3", ","));
        System.out.println(new Address("Россия. Свердловская область. Новоуральск; Ленина, 22, 293. 70"));
    }
}
