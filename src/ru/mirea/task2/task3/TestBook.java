package ru.mirea.task2.task3;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Книга 1", 12);
        Book d2 = new Book("Книга 2", 200);
        Book d3 = new Book("Книга 3", 150);
        System.out.println(d1);
        d1.outBook();
        d2.outBook();
        d3.outBook();
    }
}
