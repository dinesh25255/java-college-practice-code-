import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareNumberGUI {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Square Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create the text field for input
        JTextField textField = new JTextField(10);
        
        // Create the button
        JButton squareButton = new JButton("Square");
        
        // Create the label to display the result
        JLabel resultLabel = new JLabel("Result: ");
        
        // Add action listener to the button
        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the number from the text field
                    int number = Integer.parseInt(textField.getText());
                    // Calculate the square
                    int square = number * number;
                    // Display the result
                    resultLabel.setText("Result: " + square);
                } catch (NumberFormatException ex) {
                    // Handle invalid number format
                    resultLabel.setText("Invalid input!");
                }
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Enter a number:"));
        frame.add(textField);
        frame.add(squareButton);
        frame.add(resultLabel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
