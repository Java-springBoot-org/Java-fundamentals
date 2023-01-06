package javaswing;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        super("Hello App");
        //used to close the window on exit instead of hiding it
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        //center the window of the screen, all you need is to invoke the setLocationRelativeTo
        setLocationRelativeTo(null);

        initComponents();

        setLayout(null); // sets absolute positioning of components
        //Remember that you have to place new codes before setVisible(true).
        setVisible(true);
    }

    private void initComponents() {
        //the JLabel component is used to display some text
        JLabel nameLabel = new JLabel("Your Name");
        //setBounds() method parameters with their meaning. The first two parameters represent x and y positions respectively,          while the next two
        //parameters represent the width and height of the label respectively.
        nameLabel.setBounds(40,20, 100,30);
        add(nameLabel);

        //JTextField class which can be used for both displaying and entering some information.
        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(140,20, 100,20);
        add(nameTextField);

        JLabel yearLabel = new JLabel("Enter your age");
        yearLabel.setBounds(40, 45, 100, 20);
        add(yearLabel);

        JTextField yearTextField = new JTextField();
        yearTextField.setBounds(140,45, 100,20);
        add(yearTextField);

        //JPanel is used to divide JFrame into different sections
        JPanel greenPanel = new JPanel();
        greenPanel.setBounds(40,150,220,70);
        greenPanel.setLayout(new BorderLayout());
        greenPanel.setBackground(Color.GREEN);
        add(greenPanel);

        JButton acceptButton = new JButton("Accept");
        acceptButton.setBounds(100,80,100,30);
        add(acceptButton);

        JLabel helloLabel = new JLabel("Hello");
        helloLabel.setBounds(50,20, 100,30);
        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
        helloLabel.setVerticalAlignment(SwingConstants.CENTER);

        Font font = new Font("Calluna", Font.BOLD,12);
        helloLabel.setFont(font);
        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));

        greenPanel.add(helloLabel);

        //lambda expressions  behavior to a button, we need to create a special object called ActionListener
        acceptButton.addActionListener(e -> {
            String helloText = "Hello";
            String ageMessage = ". Your age is ";
            String name = nameTextField.getText();
            int age = Integer.parseInt(yearTextField.getText());
            if (name != null && name.trim().length() > 0 && age > 0) {
                helloText += String.format(", %s", name);
                ageMessage += String.format(" %s ", age);
            }
            helloLabel.setText(helloText + ageMessage);
        });
    }

    public static void main(final String[] args) {
        new HelloFrame();
    }
}