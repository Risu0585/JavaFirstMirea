package ru.mirea.task2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball("Мяча 1", 220);
        Ball d2 = new Ball("Мяча 2", 284);
        Ball d3 = new Ball("Мяча 3", 340);
        System.out.println(d1);
        d1.outBall();
        d2.outBall();
        d3.outBall();
    }
}
