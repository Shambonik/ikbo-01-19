package com.shambonik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window  extends JFrame {
    JPanel[] pnl = new JPanel[9];
    private int milan = 0;
    private int madrid = 0;

    public Window()
    {
        setLayout(new GridLayout(3,3));
        for(int i = 0 ; i < pnl.length ; i++)
        {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        JLabel result = new JLabel("Result: 0 X 0");
        JLabel last = new JLabel("Last Scorer: N/A");
        JLabel winner = new JLabel("Winner: DRAW");
        pnl[3].add(result);
        pnl[4].add(last);
        pnl[5].add(winner);

        JButton button = new JButton("AC Milan");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milan++;
                result.setText("Result " + milan + " X " + madrid);
                last.setText("Last Scorer: AC Milan");
                if(milan>madrid) winner.setText("Winner: AC Milan");
                else if(madrid==milan) winner.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        pnl[1].add(button);
        button = new JButton("Real Madrid");
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madrid++;
                result.setText("Result " + milan + " X " + madrid);
                last.setText("Last Scorer: Real Madrid");
                if(milan<madrid) winner.setText("Winner: Real Madrid");
                else if(madrid==milan) winner.setText("Winner: DRAW");
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        pnl[1].add(button);
        setSize(800,500);
    }

    public static void main(String[]args)
    {
        new Window().setVisible(true);;
    }
}
