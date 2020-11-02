import java.util.Scanner;

public class ThrowsDemo {

    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        boolean input = false;
        System.out.print("Enter Key ");
        while(!input)
        try {
            String key = myScanner.nextLine();
            printDetails(key);
            input = true;
        }catch (Exception e){
            System.out.print("Try Entering The Key Again ");
        }
    }

    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}