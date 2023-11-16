package xpvsBohac.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class gridTask_byTomas extends JFrame {
    gridTask_byTomas() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 640);
        this.setLayout(null);

        JPanel content = new JPanel();
        content.setBackground(Color.red);
        content.setBounds(50, 50, 500,500);

        content.setLayout(new BorderLayout());
        JLabel gridBelow = new JLabel("Grid Below");
        gridBelow.setFont(new Font("Consolas", Font.BOLD, 24));
        gridBelow.setBackground(Color.PINK);
        gridBelow.setHorizontalAlignment(SwingConstants.CENTER);
        gridBelow.setOpaque(true);
        content.add(gridBelow, BorderLayout.NORTH);

        JPanel numberPanel = new JPanel();
        numberPanel.setBackground(Color.green);

        numberPanel.setLayout(new GridLayout(3,3,1,1));
        for (int i = 0; i < 9; i++) {
            numberPanel.add(new OwnLabel(String.valueOf(i+1)));
        }
        this.add(content);
        content.add(numberPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new gridTask_byTomas().setVisible(true);
    }
}
class OwnLabel extends JLabel {
    OwnLabel(String text) {
        this.setText(text);
        this.setBackground(Color.BLUE);
        this.setOpaque(true);
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.MAGENTA);
        this.setFont(new Font("Consolas", Font.BOLD, 18));
        Border border = BorderFactory.createLineBorder(Color.black, 3);
        this.setBorder(border);
    }
}


