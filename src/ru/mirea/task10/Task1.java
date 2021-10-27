package ru.mirea.task10;

import java.util.Scanner;

public class Task1 {
    public static String Triangle(int n) {
        int sum = 0;
        int k = 0;
        if (n == 1) {
            return ("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                k = i;
            }
            return (Triangle(n - 1) + " " + k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(n + " первых чисел треугольной последовательности: " + Triangle(n));
    }
}