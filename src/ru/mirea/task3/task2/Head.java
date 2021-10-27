package ru.mirea.task3.task2;

public class Head
{
    private double radius;

    public Head(double r)
    {
        radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getArea()
    {
        return("Площадь головы равна " + 4 * Math.PI * radius * radius);
    }

    public String getVolume()
    {
        return("Объем головы равен " + 4/3 * Math.PI * radius * radius * radius);
    }

    public void grow()
    {
        radius++;
    }
}