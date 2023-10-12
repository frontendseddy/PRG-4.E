package xpvsBohac.GUI.basic;

import xpvsBohac.GUI.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelingAdvanced extends JFrame implements ActionListener {
    JButton button;
    JPanel bluePanel, redPanel, greenPanel, yellowPanel;
    PanelingAdvanced(){
        this.setSize(750, 750);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        this.add(redPanel, BorderLayout.NORTH);

        bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        this.add(bluePanel, BorderLayout.EAST);

        greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        this.add(greenPanel, BorderLayout.WEST);


        yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        this.add(yellowPanel, BorderLayout.SOUTH);

        bluePanel.setPreferredSize(new Dimension(100, 100));
        greenPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));
        redPanel.setPreferredSize(new Dimension(100, 100));

        button = new JButton("Rotate!");
        this.add(button, BorderLayout.CENTER);
        button.addActionListener(this);
    }

    public static void main(String[] args) {
        new PanelingAdvanced().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            Color r = redPanel.getBackground();
            Color b = bluePanel.getBackground();
            Color y = yellowPanel.getBackground();
            Color g = greenPanel.getBackground();

            redPanel.setBackground(g);
            bluePanel.setBackground(r);
            yellowPanel.setBackground(b);
            greenPanel.setBackground(y);

        }
    }
}
