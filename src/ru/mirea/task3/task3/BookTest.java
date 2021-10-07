package ru.mirea.task3.task3;

public class BookTest {
    public static void main(String[] args) {
        Book d1 = new Book("Книгу 1", "Автор 1",1930);
        Book d2 = new Book("Книгу 2", "Автор 2",2000);
        Book d3 = new Book("Книгу 3", "Автор 3",1951);
        System.out.println(d1);
        d1.outBook();
        d2.outBook();
        d3.outBook();
    }
}