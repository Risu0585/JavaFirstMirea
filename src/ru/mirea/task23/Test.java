package ru.mirea.task23;

class Game {
    String name;
}

public class Test {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.name = "Hades";
        Game game2 = new Game();
        game2.name = "Magicka";
        Game game3 = new Game();
        game3.name = "GRIS";
        Game game4 = new Game();
        game4.name = "Bayonetta";
        Game game5 = new Game();
        game5.name = "BioShock";

        System.out.println("\nСравнение хэш-кода названий:\n");
        int hash1 = game1.name.hashCode();
        System.out.println(hash1);
        int hash2 = game2.name.hashCode();
        System.out.println(hash2);
        int hash3 = game3.name.hashCode();
        System.out.println(hash3);
        int hash4 = game4.name.hashCode();
        System.out.println(hash4);
        int hash5 = game5.name.hashCode();
        System.out.println(hash5);

        System.out.println("\nСравнение хэш-кода игры:\n");
        hash1 = game1.hashCode();
        System.out.println(hash1);
        hash2 = game2.hashCode();
        System.out.println(hash2);
        hash3 = game3.hashCode();
        System.out.println(hash3);
        hash4 = game4.hashCode();
        System.out.println(hash4);
        hash5 = game5.hashCode();
        System.out.println(hash5);
    }
}