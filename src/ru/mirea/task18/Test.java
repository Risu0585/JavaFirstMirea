package ru.mirea.task18;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ФИО");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        while(true){
            System.out.println("Введите номер ИНН");
            try{
                BigInteger inn =  new BigInteger(sc.nextLine());
                checkInn(inn);
                break;
            }catch (Inn e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен!");
    }

    public static boolean checkInn(BigInteger inn) throws Inn{
        int i = 0;
        BigInteger cInn = new BigInteger(inn.toByteArray());
        while (!cInn.equals(new BigInteger("0"))){
            i++;
            cInn = new BigInteger(cInn.divide(new BigInteger("10")).toByteArray());
        }
        if(i != 10 && i != 12) throw new Inn(inn);
        return true;
    }
}