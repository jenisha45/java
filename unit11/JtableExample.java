package labreport.unit11;

import javax.swing.*;

public class JtableExample {

    public static void main(String[] args) {

        // Column Names
        String[] columns = {"ID", "Name", "Age"};

        // Data for the table
        String[][] data = {
            {"1", "Ram", "20"},
            {"2", "Sita", "21"},
            {"3", "Hari", "22"},
            {"4", "Gita", "23"}
        };

        // Create JTable
        JTable table = new JTable(data, columns);

        // Add table to JScrollPane (recommended)
        JScrollPane scrollPane = new JScrollPane(table);

        // Create JFrame
        JFrame frame = new JFrame("JTable Example");

        frame.add(scrollPane); // add scrollPane containing JTable to frame
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
