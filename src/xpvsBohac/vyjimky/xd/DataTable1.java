/*package dataShowcase;

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

public class DataTable1 extends JFrame {
    ArrayList<Record> data;
    DefaultTableModel model;
    SortMenu menu;

    public DataTable1(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data = new ArrayList<>();
        this.setLayout(new BorderLayout());
        menu = new SortMenu();
        this.add(menu, BorderLayout.NORTH);

        String[] column = {"Name","Release year","Rating","Duration"};
        model = new DefaultTableModel(column,0);
        JTable table = new JTable(model);
        table.setEnabled(false);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp, BorderLayout.CENTER);
        this.setSize(500, 600);
        this.setResizable(false);

        menu.outputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.buttons.forEach(f -> {
                    if (f.isSelected()){
                        System.out.println("Sorted by: " + f.getText());
                        switch (f.getText()){
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
                });
                showData();
            }
        });

    }

    void clearTable(){
        model.setRowCount(0);
    }
    void loadData(String fileName){
        /**
         * načte data ze souboru do listu
         */
 /*       try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line: lines) {
                String[] attributes = line.split(";");
                Record tmp = new Record(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[3]), Double.parseDouble(attributes[2]));
                data.add(tmp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Loaded " + data.size() + " records");
    }

    void showData(){
        /**
         * do tabluky vloží, to co je právě v listu ve stejném pořadí

        clearTable(); // data se do tabulky přidávají, tudíž je třeba ty přdchozí smazat
        for (Record tmp : data) {
            model.addRow(tmp.returnAsTableRow());
        }
    }

    public static void main(String[] args) {
        dataShowcase.DataTable1 table = new dataShowcase.DataTable1("Vizualizace dat");
        table.loadData("Movies.txt");
        table.showData();
        table.setVisible(true);
    }
}*/
