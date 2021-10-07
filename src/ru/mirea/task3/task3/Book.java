package ru.mirea.task3.task3;

public class Book {
    private String name;
    private String author;
    private int yr;
    public Book(String n, String m, int a){
        name = n;
        author = m;
        yr = a;
    }
    public void setYr(int yr) {
        this.yr = yr;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }
    public int getYr() {
        return yr;
    }
    public void outBook(){
        System.out.println(name+" написал "+author+" в "+yr + " году.");
    }
}
