
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        for(int i = 0; i<5; i++){
            first.add(in.nextInt());
        }
        for(int i = 0; i<5; i++){
            second.add(in.nextInt());
        }
        int i = 0;
        while(first.size()>0 && second.size()>0){
            if(i==106){
                System.out.println("botva");
                break;
            }
            boolean firstWin = false;
            int firstCard = first.remove();
            int secondCard = second.remove();
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
                first.add(firstCard);
                first.add(secondCard);
            }
            else{
                second.add(firstCard);
                second.add(secondCard);
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
