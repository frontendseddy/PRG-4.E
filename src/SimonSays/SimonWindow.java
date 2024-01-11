package SimonSays;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SimonWindow extends JFrame {
    JButton startButton;
    JPanel gridPanel, buttonsPanel;
    ArrayList<SimonButton> somet = new ArrayList<SimonButton>();
    String sequence;

    public SimonWindow() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);

        startButton = new JButton("PLAY");

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sequence = getSequence(5);
                highlightSequence(300, new Color(0x6EEC07));
//                gridPanel.paintImmediately(0,0, getWidth(), getHeight());
            }
        });
        JButton resetBTN = new JButton("RESET");
        
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            SimonButton toAdd = new SimonButton(String.valueOf(i + 1));
            gridPanel.add(toAdd);
            somet.add(toAdd);
            toAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }

        this.add(buttonsPanel, BorderLayout.NORTH);
        buttonsPanel.add(startButton);
        this.add(gridPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new SimonWindow().setVisible(true);
    }

    String getSequence(int length) {
        String sequence = "";
        for (int i = 0; i < length; i++) {
            sequence += somet.get((int) (Math.random() * somet.size())).getText();
        }
        System.out.println("Cheat: " + sequence);
        return sequence;
    }

    void highlightSequence(int time, Color color) {
        Color original;
        for (int i = 0; i < sequence.length(); i++) {
            for (JButton toHighlight : somet) {
                if (toHighlight.getText().charAt(0) == sequence.charAt(i)) {
                    original = toHighlight.getBackground();
                    toHighlight.setBackground(color);
                    toHighlight.paintImmediately(0, 0, getWidth(), getHeight());
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        System.out.println("Thread died :/");
                    }
                    toHighlight.setBackground(original);
                    toHighlight.paintImmediately(0, 0, getWidth(), getHeight());
                }
            }
        }

        Color tmp;
    }
}

class SimonButton extends JButton {
    SimonButton(String text) {
        this.setText(text);
        this.setBackground(Color.cyan);
        this.setForeground(Color.black);
        this.setOpaque(true);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        this.setFont(new Font("Consolas", Font.BOLD, 32));
        this.setFocusable(false);
    }
}
