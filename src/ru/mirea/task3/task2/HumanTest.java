package ru.mirea.task3.task2;

public class HumanTest {
    public static void main(String[] args) {
        Human man = new Human("Joe", "left", "forward", 2, 2);
        Human woman = new Human("Marine", "right", "right", 2, 0);
        man.toMove();
        woman.toMove();
        man.isDisabled();
    }
}