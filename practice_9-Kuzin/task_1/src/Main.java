public class Main {
    public static void main(String[] args){
        ClientArray base = new ClientArray();
        base.add("Кузин Данил Олегович", 123456789012L);
        base.add("Пономарев Алексей Алексеевич", 234567890123L);
        base.add("Барышникова Анна Александровна", 987654321098L);
        base.add("Субботин Василий Владимирович", 102938475611L);
        base.add("Агутина Таисия Гитаровна", 234567891029L);

        try {
            base.order("Кузин Олег Данилович", 123456789033L);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            base.order("Кузин Данил Олегович", 123456789012L);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            base.order("Агутина Таисия Гитаровна", 123456789012L);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
