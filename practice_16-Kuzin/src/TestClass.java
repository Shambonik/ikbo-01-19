import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Item pie = new Dish(2000, "Муссовый торт", "Синий");
        Item coffee = new Drink(120, "Кофе", "Горький");
        Item tea = new Drink(60, "Зеленый чай", "Без сахара");
        Order internetOrder = new InternetOrder();
        internetOrder.addItem(pie);
        internetOrder.addItem(coffee);
        internetOrder.addItem(tea);

        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));
        System.out.println("\nSorted:");
        internetOrder.getSortedArrOfItems();


        System.out.println("\nУдален чай");
        internetOrder.deleteByTitle("Зеленый чай");
        System.out.println(Arrays.toString(internetOrder.getArrOfItems()));

        RestaurantOrder order1 = new RestaurantOrder();
        order1.addItem(coffee);

        OrderManager orderManager = new OrderManager();
        orderManager.addOrder("Москва, проспект Вернадского 86с1", (InternetOrder) internetOrder);
        orderManager.addOrder(5, order1);

        System.out.println("\ninternetOrders:");
        InternetOrder[] internetOrders = orderManager.getArrOfInternetOrders();
        for(InternetOrder order : internetOrders){
            System.out.println(Arrays.toString(order.getTitles()));
            System.out.println(order.getFullCost());
        }
    }
}
