package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;

public class Back extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawOval(this.getWidth() / 2 - 20, this.getHeight() / 2 - 20, 40, 40);
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, this.getWidth() , 0);
        g.setColor(Color.GREEN);
        g.drawLine(0, 0, this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.GREEN);
        g.drawLine(this.getWidth(), 0, this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.GREEN);
        g.drawLine(this.getWidth(), this.getHeight(), this.getWidth() / 2, this.getHeight() / 2);
        g.setColor(Color.GREEN);
        g.drawLine(0, getHeight(), this.getWidth() / 2, this.getHeight() / 2);
    }
}