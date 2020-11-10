import java.io.DataInputStream;
import java.util.*;


public class ExpressionParser {
    public static void main(String[] args) {
        String str = "1000000*x*x*x*x*x/(x-1)";
        Expression expression = parse(str);
        System.out.println("x\ty\tz\tf");
        for(int i = 0; i<=10; i++) {
            System.out.print(i + "\t0\t0\t");
            try {
                System.out.println(expression.evaluate(i, 0, 0));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void addExpressions (Stack<Character> actionStack, ArrayList<Expression> expressions, boolean all){
        while(!actionStack.isEmpty() && (all || (!all && actionStack.peek()!='+' && actionStack.peek()!='-'))){
            System.out.println(actionStack.toString());
            System.out.println(expressions);
            char action = actionStack.pop();
            Expression ex1;
            Expression ex2;
            if(expressions.size()>1) {
                ex2 = expressions.remove(expressions.size()-1);
                ex1 = expressions.remove(expressions.size()-1);
            }
            else{
                ex1 = new Const(0);
                ex2 = expressions.remove(0);
            }
            switch (action) {
                case '+':
                    expressions.add(new Add(ex1, ex2));
                    break;
                case '-':
                    expressions.add(new Subtract(ex1, ex2));
                    break;
                case '*':
                    expressions.add(new Multiply(ex1, ex2));
                    break;
                case '/':
                    expressions.add(new Divide(ex1, ex2));
                    break;
            }
        }
    }

    private static Expression parse(String str){
        Stack<Character> actionStack = new Stack<>();
        ArrayList<Expression> expressions = new ArrayList<>();
        str = str.replace(" ", "");
        int con = 0;
        int left = 0;
        String newString = "";
        boolean addConst = false;
        for(char ch : str.toCharArray()){
            if(left==0) {
                if (ch >= '0' && ch <= '9') {
                    con = con * 10 + (ch - '0');
                    addConst = true;
                } else if (ch == 'x' || ch == 'y' || ch == 'z') {
                    expressions.add(new Variable("" + ch));
                } else {
                    if(ch == '+' || ch == '-') {
                        if(addConst){
                            expressions.add(new Const(con));
                            con = 0;
                            addConst = false;
                        }
                        addExpressions(actionStack, expressions, true);
                        actionStack.add(ch);
                    }
                    else if(ch == '*' || ch == '/'){
                        if(addConst){
                            expressions.add(new Const(con));
                            con = 0;
                            addConst = false;
                        }
                        addExpressions(actionStack, expressions, false);
                        actionStack.add(ch);
                    }
                }
            }
            else{
                if(ch==')'){
                    left--;
                    if(left==0){
                        expressions.add(parse(newString));
                        newString = "";
                    }
                }
                if(left!=0) newString += ch;
            }
            if(ch == '(') left++;
        }
        if(addConst){
            expressions.add(new Const(con));
        }
        addExpressions(actionStack, expressions, true);
        return expressions.get(0);
    }
}
