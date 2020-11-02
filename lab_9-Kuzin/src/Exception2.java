import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}