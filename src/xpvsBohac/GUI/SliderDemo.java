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
        this.setSize(600, 600);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400,420));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);

        this.add(panel);
        this.add(label);
        this.add(slider);
    }

    public static void main(String[] args) {
        new SliderDemo().setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}

