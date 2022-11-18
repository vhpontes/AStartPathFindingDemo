package main;

import javax.swing.JFrame;

public class Main {
    
    public static final DemoPanel demoPanel = new DemoPanel();
    public static JFrame window;
    
    public static void main(String[] args) {
        
        window = new JFrame();
        
        window.setTitle("PathFinding");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.add(demoPanel);
        
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}