package ru.mirea.task3.task2;

public class Leg {
    public int leg;
    public Leg(int legs){
        leg = legs;
    }
    public boolean countLegs(){
        if (leg == 2)
            return true;
        else
            return false;
    }
}