package task_3;

public class Shirt {
    private String code;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirt) {
        String[] parts = shirt.split(",");
        if (parts.length != 4) {
            System.out.println("Неверный ввод");
            return;
        }
        this.code = parts[0];
        this.name = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return  "code = " + code + '\n' +
                "name = " + name + '\n' +
                "color = " + color + '\n' +
                "size = " + size + '\n';
    }
}
