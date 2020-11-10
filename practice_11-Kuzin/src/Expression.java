public interface Expression {
    int evaluate(int valueX, int valueY, int valueZ) throws DivisionByZeroException, OverflowException;
}
