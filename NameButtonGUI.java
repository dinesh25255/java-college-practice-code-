import javax.swing.*;
import java.awt.*;

public class NameButtonGUI {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Name Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create the button with your name
        JButton nameButton = new JButton("Dinesh Bhatt");

        // Add the button to the frame
        frame.add(nameButton);

        // Set frame visibility
        frame.setVisible(true);
    }
}
