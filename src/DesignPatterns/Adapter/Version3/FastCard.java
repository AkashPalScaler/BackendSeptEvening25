package DesignPatterns.Adapter.Version3;

public class FastCard {
    String fastCardUPI = "fastcard@ybl";

    void rechargeCard(BankAPIInterface bankAPI, String userUPI, int amount){
        bankAPI.sendMoney(amount, userUPI, fastCardUPI);
    }   
}
