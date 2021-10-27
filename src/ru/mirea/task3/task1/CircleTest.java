package ru.mirea.task3.task1;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(3, "зеленый");
        Circle c2 = new Circle(2, "красный" );

        System.out.println(c1);

        System.out.println("Периметр: " + c1.getPerimeter());
        System.out.println("Площадь: " + c1.getArea());

        System.out.println(c2);

        System.out.println("Периметр: " + c2.getPerimeter());
        System.out.println("Площадь: " + c2.getArea());
    }
}