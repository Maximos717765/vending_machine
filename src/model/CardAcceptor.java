package model;

import java.util.Scanner;

public class CardAcceptor implements MoneyAcceptor {

    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void addAmount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер карты:");
        String card = sc.nextLine();

        System.out.println("Введите одноразовый пароль:");
        String code = sc.nextLine();

        System.out.println("Успешно списано 50 сом с карты!");
        amount += 50;
    }

    @Override
    public void spendAmount(int price) {
        amount -= price;
    }

    @Override
    public void showInterface() {
        System.out.println(" a - Пополнить баланс (банковская карта)");
    }
}
