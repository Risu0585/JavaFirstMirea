package ru.mirea.task5.Zadanie2;

public class Newfound extends Dog {

    public Newfound(String size, String color) {
        super(size, color);
    }

    @Override
    public String toString() {
        return "Ньюфаундлен (Размер: " + size + ", Цвет: " + color + ')';
    }
}