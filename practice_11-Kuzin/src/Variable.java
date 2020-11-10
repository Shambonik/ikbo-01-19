public class Variable implements Expression{
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int evaluate(int valueX, int valueY, int valueZ){
        switch (name){
            case "x":
                return valueX;
            case "y":
                return valueY;
            case "z":
                return valueZ;
        }
        return 1;
    }
}
