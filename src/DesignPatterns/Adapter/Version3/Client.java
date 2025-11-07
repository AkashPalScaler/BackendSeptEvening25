package DesignPatterns.Adapter.Version3;


public class Client {
    public static void main(String[] args) {
        //input from user
        String bank = "icici"; // user input from rest api
        PhonePe phonePe = new PhonePe(GetBankAPIFactory.getBankAPI(bank));

        phonePe.checkLoanEligibility();

        phonePe.rechargeFastCard(100);

        phonePe.setBankAPI(GetBankAPIFactory.getBankAPI(bank));

        phonePe.rechargeFastCard(200);
    }
    // API - { amount:"", userInfo:"", bank:"yesbank"}
}
// PhonePE FE ->(request Payload 1)-> PhonePE BE ->(request payload 2)-> YesBankAPI, ICICBankAPI, HDFC