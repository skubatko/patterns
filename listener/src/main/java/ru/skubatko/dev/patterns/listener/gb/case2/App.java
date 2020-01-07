package ru.skubatko.dev.patterns.listener.gb.case2;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.*;

/**
 * Listener pattern example
 */
public class App {

    public static void main(String[] args) {
        final JFrame testWindow = new JFrame();
        JButton button = new JButton("Click me!!");
        button.addActionListener(e -> JOptionPane.showMessageDialog(testWindow, "Hello !!"));
        testWindow.setSize(200, 100);
        testWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        testWindow.setLocationRelativeTo(null);
        testWindow.add(button);
        testWindow.show();
    }
}
