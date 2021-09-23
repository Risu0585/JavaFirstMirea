package ru.mirea.task5.Zadanie3;


public class TestFurniture {
    public static void main(String[] args) {
        Table t = new Table("12.000 рублей","Дуб");
        Shelf s = new Shelf("9.000 рублей","Береза");
        System.out.println(t);
        System.out.println(s);

        Shop1 sh1 = new Shop1("Москва", "есть");
        System.out.println(sh1);
    }
}