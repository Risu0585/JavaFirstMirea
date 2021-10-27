package ru.mirea.task3.task1;

public class Circle{
    private double radius = 0;
    private String color = "not";

    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Окружность(" +
                "радиус=" + radius +
                ", цвет='" + color + '\'' +')';
    }
}