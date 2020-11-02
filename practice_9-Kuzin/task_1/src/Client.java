public class Client {
    private String name;
    private long INN;

    public Client(String name, long INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public long getINN() {
        return INN;
    }
}
