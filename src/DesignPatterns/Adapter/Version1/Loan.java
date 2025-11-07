package DesignPatterns.Adapter.Version1;

public class Loan {
    final int eligibleAmount = 100000;
    boolean checkLoanEligibility(ICICBankAPI bankAPI){
        if(bankAPI.fetchBalance() > eligibleAmount){
            return true;
        }
        return false;
    }
}
