package ru.mirea.task3.task2;

public class Hand {
    public String hand;
    public String name;
    public int numh;
    public Hand(String n, String hand, int nh){
        this.hand=hand;
        name = n;
        numh = nh;
    }
    public String toRaise(){
        if (numh==0)
            return this.name+" cannot raise the hands and ";
        else
            return this.name+" raised "+this.hand+" arm and ";
    }
    public boolean countHands(){
        if (numh == 2)
            return true;
        else
            return false;
    }
}