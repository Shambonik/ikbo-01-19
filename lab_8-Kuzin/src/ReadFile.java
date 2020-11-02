import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader(System.getProperty("user.dir")+"\\file.txt");
            int c;
            while((c = file.read())!=-1){
                System.out.print((char)c);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
