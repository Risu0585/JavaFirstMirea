package ru.mirea.task5.Zadanie3;

public abstract class Furniture {

    protected String price;
    protected String material;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        material = material;
    }

    public Furniture(String price, String material) {
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Мебель{" +
                "Цена " + price + '\'' +
                ", Материал" + material + '\'' +
                '}';
    }
}
