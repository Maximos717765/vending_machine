package model;

public class CoinAcceptor implements MoneyAcceptor {


    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }


    @Override
    public int getAmount() {
        return amount;}

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void addAmount() {
        System.out.println("Вы бросили монетку +10");
        amount += 10;
    }

    @Override
    public void spendAmount(int price) {
        amount -= price;
    }
    @Override
    public void showInterface() {
        System.out.println(" a - Пополнить баланс (бросить монету)");
    }




}
