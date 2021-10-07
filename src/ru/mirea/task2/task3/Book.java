package ru.mirea.task2.task3;

public class Book {
    private String name;
    private int page;
    public Book(String n, int a){
        name = n;
        page = a;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage() {
        return page;
    }
    public void outBook(){
        System.out.println(name+" содержит "+page + " страниц.");
    }
}
