package ru.mirea.task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner arg = new Scanner(System.in);
        System.out.println("Введите 10 аргументов: ");
        for (int i = 0; i < 10; i++){
            arr[i]=arg.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i]+" ");
        }
    }
}