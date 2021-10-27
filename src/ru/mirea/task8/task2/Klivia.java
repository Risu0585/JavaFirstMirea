package ru.mirea.task8.task2;

import javax.swing.*;

public class Klivia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Klivia");
        frame.setSize(1200, 800);
        ImageIcon icon = new ImageIcon("");
        for (String arg : args) {
            icon = new ImageIcon(arg);
            break;
        }
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setVisible(true);
    }
}