package ru.mirea.task19;

import java.util.Scanner;

public class Test {
    public Test(int angle1, int angle2, int angle3) throws Triangle {
        if (angle1 + angle2 + angle3 != 180) {
            throw new Triangle("Треугольника с данными углами не существует");
        }
        else System.out.println("Треугольник успешно создан!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите углы треугольника: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        try {
            Test tr = new Test(angle1, angle2, angle3);
        } catch (Triangle exc) {
            exc.printStackTrace();
        }
    }
}