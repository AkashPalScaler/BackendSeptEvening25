package DesignPatterns.Adapter.Version3;

public interface BankAPIInterface {
    int getBalanceInfo();
    boolean sendMoney(int amount, String fromUPI, String toUPI);
}
