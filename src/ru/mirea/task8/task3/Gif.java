package ru.mirea.task8.task3;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gif extends JPanel {
    private JFrame frame;
    private Timer timer;
    private Image image;
    public Gif() {
        frame = new JFrame("Third Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 281);
        frame.add(this);
        frame.setVisible(true);
        image = new ImageIcon("src/ru/mirea/task8/ms/gif/0.gif").getImage();
        count = 1;
        timer = new Timer();
        timer.schedule(animate, 1, 100);
    }

    private int count = 1;
    TimerTask animate = new TimerTask() {

        public void run() {
            switch (count) {
                case 1:
                    image = new ImageIcon("src/ru/mirea/task8/task3/giff/1.gif").getImage();
                    break;
                case 2:
                    image = new ImageIcon("src/ru/mirea/task8/task3/giff/2.gif").getImage();
                    break;
                case 3:
                    image = new ImageIcon("src/ru/mirea/task8/task3/giff/3.gif").getImage();
                    break;
                case 4:
                    image = new ImageIcon("src/ru/mirea/task8/task3/giff/4.gif").getImage();
                    break;
                case 5:
                    image = new ImageIcon("src/ru/mirea/task8/task3/giff/5.gif").getImage();
                    break;
            }
            count++;
            if (count == 5) {
                count = 1;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

    public static void main(String[] args) {
        new Gif();
    }
}