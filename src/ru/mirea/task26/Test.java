package ru.mirea.task26;

import java.util.Scanner;

interface PayStrategy{
    public void payment();
}

public class Test {
    int order_id;
    PayStrategy payStrategy;

    public Test(int order_id) {
        this.order_id = order_id;
    }

    public void payment() {
        payStrategy.payment();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите артикул товара: ");
        int order = sc.nextInt();

        System.out.println("Выберите способ оплаты: ");
        System.out.println("1 - Электронный кошелек");
        System.out.println("2 - Банковская карта");

        int action = sc.nextInt();
        Test payment;
        switch (action) {
            case 1 -> payment = new eWalletPayment(order);
            case 2 -> payment = new CardPayment(order);
            default -> throw new IllegalStateException("Введены некорректные данные.");
        }
        payment.payment();
    }
}

class eWalletStrategy implements PayStrategy{

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Заказ будет оплачен с помощью электронного кошелька. Введите номер кошелька: ");
        String card = sc.next();
        System.out.println("Введите пин-код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен.");
    }
}

class CardStrategy implements PayStrategy{

    public void payment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Заказ будет оплачен с помощью дебетовой карты. Введите номер карты: ");
        String card = sc.next();

        System.out.println("Введите пин-код: ");
        int pin = sc.nextInt();

        System.out.println("Заказ оформлен.");
    }
}

class eWalletPayment extends Test {
    public eWalletPayment(int order_id) {
        super(order_id);
        this.payStrategy = new eWalletStrategy();
    }
}

class CardPayment extends Test{
    public CardPayment(int order_id) {
        super(order_id);
        this.payStrategy = new CardStrategy();
    }
}