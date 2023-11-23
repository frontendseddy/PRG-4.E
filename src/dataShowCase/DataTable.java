package dataShowCase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataTable extends JFrame {
    public static ArrayList<Record> data;
    DefaultTableModel model;
    SortMenu menu;

    public DataTable(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data = new ArrayList<>();
        this.setLayout(new BorderLayout());
        menu = new SortMenu();
        this.add(menu, BorderLayout.NORTH);

        String[] column = {"Name", "Release year", "Rating", "Duration"};
        model = new DefaultTableModel(column, 0);
        JTable table = new JTable(model);
        table.setEnabled(false);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp, BorderLayout.CENTER);
        this.setSize(600, 600);
        this.setResizable(false);

        menu.outputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JRadioButton button : menu.buttons) {
                    if (button.isSelected()) {
                        System.out.println("Sorted by: " + button.getText());
                        switch (button.getText()) {
                            case "Name":
                                data.sort(Record.byName);
                                break;
                            case "Release":
                                data.sort(Record.byRelease);
                                break;
                            case "Rating":
                                data.sort(Record.byRating);
                                break;
                            case "Duration":
                                data.sort(Record.byDuration);
                                break;
                            default:
                                break;
                        }
                    }
                };
                showData();
            }
        });

        menu.reversed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JRadioButton button : menu.buttons) {
                    if (button.isSelected()) {
                        System.out.println("Sorted by: " + button.getText());
                        switch (button.getText()) {
                            case "Name":
                                data.sort(Record.byName.reversed());
                                break;
                            case "Release":
                                data.sort(Record.byRelease.reversed());
                                break;
                            case "Rating":
                                data.sort(Record.byRating.reversed());
                                break;
                            case "Duration":
                                data.sort(Record.byDuration.reversed());
                                break;
                            default:
                                break;
                        }
                    }
                };
                showData();
            }
        });

    }

    public static void main(String[] args) {
        DataTable table = new DataTable("Vizualizace dat");
        table.loadData("Movies.txt");
        table.showData();
        table.setVisible(true);
    }

    void clearTable() {
        model.setRowCount(0);
    }

    //nacte data ze souboru do listu
    void loadData(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            String[] attributes;
            for (String line : lines) {
                attributes = line.split(";");
                data.add(new Record(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[3]), Double.parseDouble(attributes[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("loaded " + data.size() + " records");
    }

    //do tabulky vlozi to, co je prave v listu
    void showData() {
        clearTable();
        for (Record r : data) {
            model.addRow(r.returnAsTableRow());
        }
    }
}
