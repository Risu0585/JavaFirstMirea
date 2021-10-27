package ru.mirea.task3.task2;

public class Hand
{
    private double length;
    private boolean up = false;

    public Hand(double l)
    {
        length = l;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getLength() {
        return ("Длина руки равна " + length);
    }

    public void grow()
    {
        length++;
    }
}