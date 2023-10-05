package xpvsBohac.GUI.basic;

import javax.swing.*;
import java.awt.*;

public class ComponentShowCase extends Basic{
    public ComponentShowCase(String name) {
        super(name);
        JLabel label = new JLabel("Hello world");
        label.setText("This will actually show");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(label);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
        label.setForeground(Color.blue);
    }

    public static void main(String[] args) {
        new ComponentShowCase("label - ukazka").setVisible(true);
    }
}
