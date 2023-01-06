package javaswing;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class MockQuizApplication extends JFrame {

    public MockQuizApplication() {
        super("Mock Quiz App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);

        initComponents();
        setLayout(null); // sets absolute positioning of components
        setLocationRelativeTo(null);
        //Remember that you have to place new codes before setVisible(true).
        setVisible(true);
    }

    public void initComponents(){
        JLabel jLabel  = new JLabel("Que 1: Which one of these is not a datatype");
        jLabel.setBounds(10, 20, 300, 30);
        add(jLabel);

        JRadioButton intButton = new JRadioButton("int");
        JRadioButton floatButton = new JRadioButton("float");
        JRadioButton booleanButton = new JRadioButton("boolean");
        JRadioButton charButton = new JRadioButton("char");

        intButton.setBounds(40,50,100,30);
        floatButton.setBounds(40,80,100,30);
        booleanButton.setBounds(40,110, 100,30);
        charButton.setBounds(40,140,100,30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(intButton);        bg.add(floatButton);        bg.add(booleanButton);        bg.add(charButton);

        add(intButton);
        add(floatButton);
        add(booleanButton);
        add(charButton);
        setLayout(null);

        JButton nextQuestion = new JButton("Next");
        nextQuestion.setBounds(60, 180, 100, 30);
        add(nextQuestion);
    }

    public static void main(String[] args) throws   Exception {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                new MockQuizApplication();
//            }
//        };
//        SwingUtilities.invokeAndWait(runnable);

        new MockQuizApplication();
    }
}
