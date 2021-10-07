package ru.mirea.task1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*20-5);
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);

        System.out.print("\n");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}