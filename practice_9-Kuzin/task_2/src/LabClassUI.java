import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {

    private JLabel label;

    public LabClassUI(){
        super("LabClass");
        setLayout(new GridLayout(3,3));
        JPanel[] pnl = new JPanel[9];
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        JTextField textField = new JTextField("Имя студента", 20);
        pnl[1].add(textField);
        label = new JLabel("");
        pnl[7].add(label);
        JButton button = new JButton("Показать оценку");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabClassDriver.writeStudentGrade(textField.getText());
            }
        });
        pnl[4].add(button);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
    }

    public void setTextLabel(String text){
        label.setText(text);
    }
}
