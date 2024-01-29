package pvsv.Threads;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class RunningExample extends Thread{
    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");

    public static void main(String[] args) {
        RunningExample re = new RunningExample();
        re.start();
        String input = JOptionPane.showInputDialog("Neco zadej pico...");
        System.out.println("zadals: " + input);
    }

    @Override
    public void run() {



        super.run();
    }
}
