import java.util.*;

public class StackGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        for(int i = 0; i<5; i++){
            first.add(0, in.nextInt());
        }
        for(int i = 0; i<5; i++){
            second.add(0, in.nextInt());
        }
        int i = 0;
        while(first.size()>0 && second.size()>0){
            if(i==106){
                System.out.println("botva");
                break;
            }
            boolean firstWin = false;
            int firstCard = first.pop();
            int secondCard = second.pop();
            if(firstCard>secondCard){
                if(secondCard != 0 || firstCard != 9){
                    firstWin = true;
                }
            }
            else{
                if(firstCard==0&&secondCard==9){
                    firstWin = true;
                }
            }
            if(firstWin){
                first.add(0, firstCard);
                first.add(0, secondCard);
            }
            else{
                second.add(0, firstCard);
                second.add(0, secondCard);
            }
            i++;
        }
        if(i<106){
            if(first.size() == 0)
                System.out.println("second " + i);
            else
                System.out.println("first " + i);
        }
    }
}
