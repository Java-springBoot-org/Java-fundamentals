package javaswing;

import javax.swing.*;

public class Jmenu extends  JFrame{
    public Jmenu() {
        super("Menu Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        initComponents();
        setVisible(true);
    }

    public void initComponents() {
        //Menubar is represented by JMenuBar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        new Jmenu();
    }
}
