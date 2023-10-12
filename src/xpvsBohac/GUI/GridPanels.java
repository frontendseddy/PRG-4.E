package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;

public class GridPanels extends JFrame {
    public GridPanels() {
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
        this.add(blackPanel, BorderLayout.CENTER);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(new Color(255, 255, 0));
        this.add(yellowPanel, BorderLayout.SOUTH);

        bluePanel.setPreferredSize(new Dimension(100, 100));
        redPanel.setPreferredSize(new Dimension(100, 100));
        greenPanel.setPreferredSize(new Dimension(100, 100));
        blackPanel.setPreferredSize(new Dimension(100, 100));
        yellowPanel.setPreferredSize(new Dimension(100, 100));

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,3,2,2));
        for (int i = 0; i < 9; i++) {
            gridPanel.add(new JButton(String.valueOf(i + 1)));
        }
    }

    public static void main(String[] args) {
        new GridPanels().setVisible(true);
    }
}
