package ru.mirea.task5.Zadanie3;

public class Shop1 extends FurnitureShop {
    private String dostavka;

    public String getDostavka() {
        return dostavka;
    }

    public void setDostavka(String dostavka) {
        this.dostavka = dostavka;
    }
    public Shop1(String city, String dostavka) {
        super(city);
        this.dostavka = dostavka;
    }
    @Override
    public String toString() {
        return "Магазин 1 (Город: " + city + ", Доставка: " + dostavka + ')';
    }
}