package ru.mirea.task5.Zadanie2;

public class Shunqar extends Dog {

    public Shunqar(String size, String color) {
        super(size, color);
    }

    @Override
    public String toString() {
        return "Шункар (Размер: " + size + ", Цвет: " + color + ')';
    }
}