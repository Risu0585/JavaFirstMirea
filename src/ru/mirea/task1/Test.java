
package ru.mirea.task1;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9};
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        System.out.println("Вывод циклом for: ");
        for(i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println(sum1);
        System.out.println("Вывод циклом while: ");
        i = 0;
        while(i < a.length) {
            sum2 = sum2 + a[i];
            i++;
        }
        System.out.println(sum2);
        System.out.println("Вывод циклом do while: ");
        i = 0;
        do {
            sum3 = sum3 + a[i];
            i++;
        }while(i < a.length);
        System.out.println(sum3);
    }
}
