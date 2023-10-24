package xpvsBohac.GUI;

import javax.swing.*;

public class Options {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "some useless info", "title", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "some useless info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "some useless info", "title", JOptionPane.QUESTION_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "Uzavrena otazka", "origitalni tiulek", JOptionPane.YES_NO_OPTION);
        System.out.println("odpoved: " + answer);
        if (answer == JOptionPane.YES_NO_OPTION) {
            System.out.println("Agreed");
        }

        String input = JOptionPane.showInputDialog("Otevrena otazka");
//        JOptionPane.showOptionDialog(null, "Secret message", "title", Messa);


    }
}
