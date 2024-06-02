
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(5, 2));

        // Create text fields for input numbers
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();

        // Create a combo box for selecting operations
        String[] operations = {"Add", "Subtract", "Multiply", "Divide"};
        JComboBox<String> operationsBox = new JComboBox<>(operations);

        // Create a label to display the result
        JLabel resultLabel = new JLabel("Result: ");

        // Create a button to perform the calculation
        JButton calculateButton = new JButton("Calculate");

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the numbers from the text fields
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    // Get the selected operation
                    String selectedOperation = (String) operationsBox.getSelectedItem();

                    // Perform the calculation
                    double result = 0;
                    switch (selectedOperation) {
                        case "Add":
                            result = num1 + num2;
                            break;
                        case "Subtract":
                            result = num1 - num2;
                            break;
                        case "Multiply":
                            result = num1 * num2;
                            break;
                        case "Divide":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            break;
                    }

                    // Display the result
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Number 1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2Field);
        frame.add(new JLabel("Operation:"));
        frame.add(operationsBox);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Set the frame visibility
        frame.setVisible(true);
    }
}
