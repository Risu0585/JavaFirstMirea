package ru.mirea.task1;

import java.util.Scanner;

public class Task5 {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.println(calculateFactorial(a));
    }
}