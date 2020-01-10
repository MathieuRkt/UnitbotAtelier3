package org.domat.unitbot;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Window {
    JFrame window = new JFrame();
    JButton button = new JButton("Log in");
    JTextField user = new JTextField(10);
    JPasswordField password = new JPasswordField(10);

    public void setWindow() {
        window.setTitle("Ma première fenêtre Java");
        window.setSize(400, 500);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());
        window.add(user);
        window.add(password);
        window.add(button);
        window.setVisible(true);
    }
}
