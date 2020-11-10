public class Divide implements Expression{
    private Expression value1;
    private Expression value2;

    public Divide(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public int evaluate(int valueX, int valueY, int valueZ) throws DivisionByZeroException, OverflowException{
        try {
            return value1.evaluate(valueX, valueY, valueZ) / value2.evaluate(valueX, valueY, valueZ);
        }catch (ArithmeticException e){
            throw new DivisionByZeroException();
        }catch (Exception e){
            throw new OverflowException();
        }
    }
}
