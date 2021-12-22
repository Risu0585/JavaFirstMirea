package ru.mirea.task17;

import java.util.Scanner;

enum Planet {
    Меркурий(3.302e23, 2440), Венера(4.869e24, 6052), Земля(5.974e24, 6378), Марс(6.419e23, 3397),
    Юпитер(1.899e27, 71490), Сатурн(5.685e26, 60270), Уран(8.685e25, 25560), Нептун(1.024e26, 24760);

    private double G = 6.67408e-11;
    private double weight, radius, force;
    Planet(double w, double r) {
        weight = w;
        radius = r;
        force = (G*weight)/(radius*radius)/1000000;
    }

    public double getForce() { return force; }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planet;
        while (true) {
            System.out.println("Введите номер планеты по удаленности от солнца или введите 0 для завершения программы: ");
            planet = sc.nextInt();
            Planet pl;
            if (planet < 9 && planet != 0) {
                System.out.println("Планета: " + Planet.values()[planet-1].name());
                System.out.println("Сила притяжения: " + Planet.values()[planet-1].getForce() + " м/с^2");
            } else if (planet == 0 ) {
                System.out.println("Выход из программы");
                break;
            }
            else
                System.out.println("Планеты под данным номером не существует.");
        }
    }
}