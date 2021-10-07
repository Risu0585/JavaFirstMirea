package ru.mirea.task2.task2;

public class Ball {
    private String name;
    private int wt;
    public Ball(String n, int a){
        name = n;
        wt = a;
    }
    public void setWt(int wt) {
        this.wt = wt;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getWt() {
        return wt;
    }
    public void outBall(){
        System.out.println("Вес " + name+" в граммах - "+wt);
    }
}
