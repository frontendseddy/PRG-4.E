package xpvsBohac.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOpening extends JFrame {
    public FileOpening() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(new FlowLayout());
        JButton openFile = new JButton("OPEN");
        JTextField textField = new JTextField("tmp");
        textField.setPreferredSize(new Dimension(120, 40));
        this.add(openFile);
        this.add(textField);
        this.setLocationRelativeTo(null);
        openFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedReader br = new BufferedReader(new FileReader(textField.getText()))){
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                } catch (IOException exception) {
                    System.out.println("File not found");

                }
            }
        });

        JButton insertFile = new JButton("Insert");
        insertFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int response =fileChooser.showOpenDialog(null);
                System.out.println(response);
                if (response == JFileChooser.OPEN_DIALOG) {
                    File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                    textField.setText(String.valueOf(file));
                    System.out.println(file);
                }
                if (response == JFileChooser.CANCEL_OPTION){
                    System.out.println("No file choosen");
                }

            }
        });
        this.add(insertFile);
    }

    public static void main(String[] args) {
        new FileOpening().setVisible(true);
    }
}
