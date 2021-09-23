package ru.mirea.task5.Zadanie2;

public abstract class Dog {
    protected String size;
    protected String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public Dog(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Собака{" +
                "Размер " + size + '\'' +
                ", Окрас" + color + '\'' +
                '}';
    }
}
