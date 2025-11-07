package DesignPatterns.Adapter.Version3.ExternalBankSDK;

public class YesBankAPI {
    public int getBalance(){
        return 0;
    }

    public boolean transferAmount(String fromUPI, String toUPI, int amount){
        return false;
    }
}
