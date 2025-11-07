package DesignPatterns.Adapter.Version3.BankAdapters;

import DesignPatterns.Adapter.Version3.BankAPIInterface;
import DesignPatterns.Adapter.Version3.ExternalBankSDK.YesBankAPI;

public class YesBankAdapter implements BankAPIInterface {
    YesBankAPI yb = new YesBankAPI();
    @Override
    public int getBalanceInfo() {
        return yb.getBalance();
    }

    @Override
    public boolean sendMoney(int amount, String fromUPI, String toUPI) {
        return yb.transferAmount(fromUPI, toUPI, amount);
    }
}
