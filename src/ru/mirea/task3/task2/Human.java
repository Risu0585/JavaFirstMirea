package ru.mirea.task3.task2;

public class Human
{
    public Head head;
    public Hand leftHand;
    public Hand rightHand;
    public Leg leftLeg;
    public Leg rightLeg;

    public Human(double HeadR, double LeftHandL, double RightHandL, double LeftLegL, double RightLegL)
    {
        head = new Head(HeadR);
        leftHand = new Hand(LeftHandL);
        rightHand = new Hand(RightHandL);
        leftLeg = new Leg(LeftLegL);
        rightLeg = new Leg(RightLegL);
    }

    public void grow()
    {
        head.grow();
        leftHand.grow();
        rightHand.grow();
        leftLeg.grow();
        rightLeg.grow();
    }
}