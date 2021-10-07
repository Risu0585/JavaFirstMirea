package ru.mirea.task3.task2;

public class Human {
    public String name;
    public Hand hand;
    public Leg legs;
    public Head head;
    public Human(String name, String h, String he, int nl, int nh){
        this.name = name;
        hand = new Hand(name, h, nh);
        legs = new Leg(nl);
        head = new Head(he);
    }
    public void toMove(){
        System.out.print(hand.toRaise());
        System.out.print(head.toTilt());
    }
    public void isDisabled(){
        if (legs.countLegs() & hand.countHands())
            System.out.print(this.name+" is healthy");
        else
            System.out.print(this.name+" is disabled");
    }
}