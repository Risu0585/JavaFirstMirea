package ru.mirea.task6.Zadanie2;

import ru.mirea.task6.Zadanie1.Nameable;

public class Toys implements ru.mirea.task6.Zadanie2.Priceable, Nameable {
    private String name;
    private int price;
    private String color;
    public Toys(String name, int price, String color){
        this.name=name;
        this.color=color;
        this.price=price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    @Override
    public String toString(){
        return this.color + " " + this.name + " стоит " + this.price + " руб.";
    }
}