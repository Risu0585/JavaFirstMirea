package ru.mirea.task5.Zadanie1;

public class Fork extends Dish {

    public Fork(String material, String color) {
        super(material, color);
    }

    @Override
    public String toString() {
        return "Вилка (Материал: " + material + ", Цвет: " + color + ')';
    }
}