package DesignPatterns.Adapter.Version1;

public class FastCard {
    String fastCardUPI = "fastcard@ybl";

    void rechargeCard(ICICBankAPI bankAPI, String userUPI, int amount){
        bankAPI.makeTransfer(userUPI, fastCardUPI, amount);
    }   
}
