import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame {

    private JLabel label;

    public Window()
    {
        setLayout(new BorderLayout());
        label = new JLabel("Text");
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(label);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        setJMenuBar(menuBar);
        setSize(600, 400);
        setVisible(true);
    }

    private JMenu createFontMenu(){
        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem item = new JMenuItem("Times New Roman");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            }
        });
        fontMenu.add(item);
        item = new JMenuItem("MS Sans Serif");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
            }
        });
        fontMenu.add(item);
        item = new JMenuItem("Courier New");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Courier New", Font.PLAIN, 20));
            }
        });
        fontMenu.add(item);
        return fontMenu;
    }

    private JMenu createColorMenu(){
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem item = new JMenuItem("Синий");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLUE);
            }
        });
        colorMenu.add(item);
        item = new JMenuItem("Красный");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });
        colorMenu.add(item);
        item = new JMenuItem("Черный");
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLACK);
            }
        });
        colorMenu.add(item);
        return colorMenu;
    }

    public static void main(String[] args) {
        Window window = new Window();
    }
}
