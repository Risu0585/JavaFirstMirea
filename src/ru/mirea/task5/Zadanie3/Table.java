package ru.mirea.task5.Zadanie3;

public class Table extends Furniture {

    public Table(String price, String material) {
        super(price, material);
    }

    @Override
    public String toString() {
        return "Стол (Цена: " + price + ", Материал: " + material + ')';
    }
}