import javax.swing.*;
import java.awt.*;

public class TableExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // Define column names for the table
        String[] columnNames = {"ID", "Name", "Age", "Gender"};

        // Define data for the table
        Object[][] data = {
            {"1", "dinesh", "23", "male"},
            {"2", "kusum", "27", "female"},
            {"3", "basanta", "30", "male"},
            {"4", "Ramesh", "22", "Male"}
        };

        // Create a table with the data and column names
        JTable table = new JTable(data, columnNames);

        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the frame visible
        frame.setVisible(true);
    }
}

