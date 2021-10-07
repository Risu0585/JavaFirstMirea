package ru.mirea.task3.task2;

class Head {
    public static String turn;

    public Head(String head) {
        turn = head;
    }

    public String toTilt() {
        return "tilted the head to the " + turn + "\n";
    }
}