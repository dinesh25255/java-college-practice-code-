import javax.swing.*;

public class MenuExample {

    public static void main(String[] args) {
        // Create the main frame
        JFrame home = new JFrame("Hello");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(400, 400);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the File menu
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem openMenuItem = new JMenuItem("Open");

        // Add menu items to the File menu
        fileMenu.add(saveMenuItem);
        fileMenu.add(openMenuItem);

        // Add the File menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar for the frame
        home.setJMenuBar(menuBar);

        // Set the frame visible
        home.setVisible(true);
    }
}
