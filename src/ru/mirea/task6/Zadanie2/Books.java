package ru.mirea.task6.Zadanie2;

import ru.mirea.task6.Zadanie1.Nameable;

public class Books implements Priceable, Nameable {
    private String name;
    private int price;
    private String author;
    public Books(String name, int price, String author){
        this.name=name;
        this.author=author;
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
        return "Книга «" + this.name + "», написанная " + this.author + ", стоит " + this.price + " руб.";
    }
}