package ru.mirea.task6.Zadanie1;

public class Car implements Nameable{
    private String name;
    public int speed;
    public Car(String name, int s){
        this.name = name;
        this.speed = s;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
        return "Разгон автомобиля " + this.name + " до 100 км/ч составляет " + this.speed + " сек.";
    }
}