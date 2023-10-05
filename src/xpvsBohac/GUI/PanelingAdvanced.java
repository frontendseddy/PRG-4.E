package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class PanelingAdvanced extends JFrame {
    public PanelingAdvanced() {
        this.setSize(750, 750);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(new Color(250, 0, 0));
        this.add(redPanel, BorderLayout.NORTH);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(0, 0, 250));
        this.add(bluePanel, BorderLayout.WEST);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(0, 250, 0));
        this.add(greenPanel, BorderLayout.EAST);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(new Color(0, 0, 0));
        this.add(blackPanel, BorderLayout.SOUTH);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 255, 0));
        this.add(yellowPanel, BorderLayout.CENTER);

        bluePanel.setPreferredSize(new Dimension(100, 100));
        redPanel.setPreferredSize(new Dimension(100, 100));
        greenPanel.setPreferredSize(new Dimension(100, 100));
        blackPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        panel1.setPreferredSize(new Dimension(50, 50));
        panel2.setPreferredSize(new Dimension(50, 50));
        panel3.setPreferredSize(new Dimension(50, 50));
        panel4.setPreferredSize(new Dimension(50, 50));

        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.MAGENTA);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel4.setBackground(Color.ORANGE);

        yellowPanel.setLayout(new BorderLayout());
        yellowPanel.add(panel1, BorderLayout.NORTH);
        yellowPanel.add(panel2, BorderLayout.EAST);
        yellowPanel.add(panel3, BorderLayout.SOUTH);
        yellowPanel.add(panel4, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new PanelingAdvanced().setVisible(true);
    }
}
