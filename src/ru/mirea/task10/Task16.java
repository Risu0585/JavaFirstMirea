package ru.mirea.task10;


public class Task16
{
    public static void number(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                number(n, 1);
            }
            else if (n == max) {
                number(max, ++count);
            }
            else {
                number(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        number(0, 0);
    }
}