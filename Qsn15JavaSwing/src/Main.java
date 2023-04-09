import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a frame window with a title and a custom logo icon
        JFrame frame = new JFrame("GUI Example");
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());

        // Create a label with an icon and a label displaying text
        ImageIcon labelIcon = new ImageIcon("label.png");
        JLabel label1 = new JLabel("Label with icon", labelIcon, JLabel.LEFT);
        JLabel label2 = new JLabel("My name is John Smith", JLabel.RIGHT);

        // Create a text field with a colorful line border and a tooltip
        JTextField textField = new JTextField();
        textField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        textField.setToolTipText("Enter your name here");

        // Create a text area with horizontal and vertical scroll bars
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Create a check box
        JCheckBox checkBox = new JCheckBox("Check me");

        // Create a password field
        JPasswordField passwordField = new JPasswordField();

        // Create a radio button
        JRadioButton radioButton = new JRadioButton("Radio button");

        // Create a push button
        JButton button = new JButton("Push me");

        // Create a combo box
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox comboBox = new JComboBox(options);

        // Add the components to the frame window
        frame.add(label1);
        frame.add(label2);
        frame.add(textField);
        frame.add(scrollPane);
        frame.add(checkBox);
        frame.add(passwordField);
        frame.add(radioButton);
        frame.add(button);
        frame.add(comboBox);

        // Display the frame window
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
