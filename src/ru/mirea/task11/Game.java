package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private JButton AnswerButton;
    private JTextField AnswerText;
    private JLabel Task;
    private JLabel Result;
    private int count, num;
    private JPanel[] allCell;

    public Game() {
        super("Game");


        num = 21;
        while (num > 20 || num < 1) {
            num = (int)(Math.random() * 10) + (int)(Math.random() * 10);
        }
        System.out.println("num = " + num);

        count = 0;

        AnswerButton = new JButton("Отправить");
        Task = new JLabel("Отгадай число от 1 до 20. Число попыток: 3");
        Result = new JLabel("Result: void");
        AnswerText = new JTextField(2);

        this.setSize(600, 600);

        setLayout(new GridLayout(4, 1));
        allCell = new JPanel[4];

        for (int i = 0; i < 4; i++) {
            allCell[i] = new JPanel();
            this.add(allCell[i]);
        }

        allCell[0].add(Task);
        allCell[1].add(AnswerText);
        allCell[2].add(AnswerButton);
        allCell[3].add(Result);

        AnswerButton.addActionListener(new AnswerButtonListener());
    }

    public class AnswerButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (AnswerText.getText().equals("")) {
                return;
            }
            Task.setText("Отгадай число от 1 до 20. Число попыток: " + (3 - count - 1));
            if (count < 3) {
                if (AnswerText.getText().equals(String.valueOf(num))) {
                    count = 3;
                    Result.setText("Result: Верно.");
                } else {
                    count++;
                    if (Integer.parseInt(AnswerText.getText()) > num) {
                        Result.setText("Result: Неверно. Возьми число поменьше.");
                    } else {
                        Result.setText("Result: Неверно. Возьми число побольше.");
                    }
                    AnswerText.setText("");
                }
            } else {
                Result.setText("Result: Нет попыток");

            }
        }
    }
}