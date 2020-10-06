import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {

    private int index = 0;
    private int delta = 1;
    private int lastNumber;

    public void imageChange(){
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images\\"+index+".jpg")))));
            index += delta;
            if(index%lastNumber==0) delta*=-1;
            Thread.sleep(15);
        } catch (IOException e) {
            System.out.println("Error image");
        }catch (InterruptedException e){
            System.out.println("Interrupted Exception");
        }
        setVisible(true);
    }

    public Window(int lastNumber)
    {
        setLayout(new BorderLayout());
        this.lastNumber = lastNumber;
        setSize(900, 1000);
    }

    public static void main(String[] args) {
        Window window = new Window(9);
        while(true) {
            window.imageChange();
        }
    }
}
