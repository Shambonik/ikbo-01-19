public class Const implements Expression {
    private int number;

    public Const(int number) {
        this.number = number;
    }

    @Override
    public int evaluate(int valueX, int valueY, int valueZ) {
        return number;
    }
}
