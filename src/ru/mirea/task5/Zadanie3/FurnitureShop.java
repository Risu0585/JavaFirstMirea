package ru.mirea.task5.Zadanie3;

public abstract class FurnitureShop {
    protected String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public FurnitureShop(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Магазин{" +
                "Город " + city + '\'' +
                '}';
    }
}
