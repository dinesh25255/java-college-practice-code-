import javax.swing.*;
import java.awt.*;

public class Radiobutton{

    public static void main(String[] args) {
        // Create the main frame
        JFrame home = new JFrame("Home");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(300, 200);
        home.setLayout(new FlowLayout());

        // Create radio buttons
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");

        // Group the radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // Add radio buttons to the frame
        home.add(male);
        home.add(female);

        // Create a label to display the selected option
        JLabel resultLabel = new JLabel("Selected Gender: None");
        home.add(resultLabel);

        // Create a button to submit the selected option
        JButton submitButton = new JButton("Submit");
        home.add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(e -> {
            if (male.isSelected()) {
                resultLabel.setText("Selected Gender: Male");
            } else if (female.isSelected()) {
                resultLabel.setText("Selected Gender: Female");
            } else {
                resultLabel.setText("Selected Gender: None");
            }
        });

        // Set the frame visible
        home.setVisible(true);
    }
}
