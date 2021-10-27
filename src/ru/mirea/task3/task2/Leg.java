package ru.mirea.task3.task2;

public class Leg
{
    private double length;

    public Leg(double l)
    {
        length = l;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getLength() {
        return ("Длина ноги равна " + length);
    }

    public void grow()
    {
        length++;
    }
}