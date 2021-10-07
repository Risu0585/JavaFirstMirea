package ru.mirea.task2.task4;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шу", 3);
        Dog d2 = new Dog("Селти", 4);
        Dog d3 = new Dog("Ризен", 2);
        System.out.println(d1);
        d1.outAge();
        d2.outAge();
        d3.outAge();
    }
}
