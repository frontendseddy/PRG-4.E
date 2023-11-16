package xpvsBohac.GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo extends JFrame implements ChangeListener {
    JPanel panel;
    JLabel label;
    JSlider slider;

    public SliderDemo() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 600);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(450,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        label.setText(slider.getValue() + " vol");
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        this.add(panel);
    }

    public static void main(String[] args) {
        new SliderDemo().setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(slider.getValue() + " vol");
    }
}

