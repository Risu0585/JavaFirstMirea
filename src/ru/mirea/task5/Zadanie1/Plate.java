package ru.mirea.task5.Zadanie1;

public class Plate extends Dish {
    private String uzor;

    public String getUzor() {
        return uzor;
    }

    public void setUzor(String uzor) {
        this.uzor = uzor;
    }
    public Plate(String material, String color, String uzor) {
        super(material, color);
        this.uzor = uzor;
    }

    @Override
    public String toString() {
        return "Тарелка (Материал: " + material + ", Цвет: " + color + ", Узор: " + uzor +')';
    }
}