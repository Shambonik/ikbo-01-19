public interface Order {
    boolean addItem(Item item);
    boolean deleteByTitle(String title);
    int deleteAllByTitle(String title);
    int getNumOfOrders();
    Item[] getArrOfItems();
    double getFullCost();
    int getNumOfItemsByTitle(String title);
    String[] getTitles();
    void getSortedArrOfItems();
}
