package model;

public interface MoneyAcceptor {

    int getAmount();

    void addAmount();

    void spendAmount(int amount);

    void showInterface();
}
