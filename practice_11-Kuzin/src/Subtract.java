public class Subtract implements Expression{
        private Expression value1;
        private Expression value2;

    public Subtract(Expression value1, Expression value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        @Override
        public int evaluate(int valueX, int valueY, int valueZ) throws DivisionByZeroException, OverflowException{
            int x = value1.evaluate(valueX, valueY, valueZ);
            int y = value2.evaluate(valueX, valueY, valueZ);
            long res = (long)x - (long)y;
            if(res<Integer.MIN_VALUE || res>Integer.MAX_VALUE) throw new OverflowException();
            return x - y;
        }
}
