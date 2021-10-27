package ru.mirea.task3.task2;


public class HumanTest
{
    public static void main(String[] args)
    {
        Human H = new Human(21, 65, 65, 75,75);
        System.out.println(H.head.getArea());
        System.out.println(H.head.getVolume());
        System.out.println(H.leftLeg.getLength());
        System.out.println(H.rightLeg.getLength());
        System.out.println(H.rightHand.getLength());
        System.out.println(H.leftHand.getLength());
    }
}