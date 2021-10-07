package ru.mirea.task6.Zadanie1;

public class Animal implements Nameable{
    private String name;
    public int hight;
    public Animal(String name, int h){
        this.name = name;
        this.hight = h;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
        return "Средний рост " + this.name + " составляет " + this.hight + " см.";
    }
}