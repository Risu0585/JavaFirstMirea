package ru.mirea.task2.task4;

import java.lang.*;

public class Dog {
    private String name;
    private int age;
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public void outAge(){
        System.out.println("Возраст " + name+" по человеческим меркам - "+age*7);
    }
}