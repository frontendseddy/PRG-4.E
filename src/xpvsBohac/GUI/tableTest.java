package xpvsBohac.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class tableTest extends JFrame {
    public tableTest() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);

        String[] columns = {"sloupec 1", "sloupec 2", "Sloupec 3", "Sloupec 4"};

        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        for (int i = 0; i < 30; i++) {
            model.addRow(new String[]{" A", " B", " C", " D"});
        }

        table.setEnabled(false); //nemohu v tom nic delat
        table.setFont(new Font("Arial", Font.BOLD, 20));
        table.editCellAt(1,1); // mohu editovat to co si reknu
        table.setBackground(Color.orange);
        table.setOpaque(true);
        table.setForeground(new Color(0x62EF5D));


        //model.setRowCount(0); smazani radku

        this.add(sp);

    }

    public static void main(String[] args) {
        new tableTest().setVisible(true);
    }
}
