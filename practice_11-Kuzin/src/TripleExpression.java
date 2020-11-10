public class TripleExpression implements Expression{

    private Expression expression;

    public TripleExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate(int valueX, int valueY, int valueZ) throws DivisionByZeroException, OverflowException {
        return expression.evaluate(valueX, valueY, valueZ);
    }
}
