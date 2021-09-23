package ru.mirea.task5.Zadanie3;

public class Shelf extends Furniture {

    public Shelf(String price, String material) {
        super(price, material);
    }

    @Override
    public String toString() {
        return "Полка (Цена: " + price + ", Материал: " + material + ')';
    }
}