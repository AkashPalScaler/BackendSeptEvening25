package DesignPatterns.Adapter.Version3;

public class GetBankAPIFactory {
    static BankAPIInterface getBankAPI(String bank){
        if(bank == "yesbank") return new YesBankAPI();
        else if (bank == "icici") {
            return new ICICBankAPI();
        }
        else {
            throw new RuntimeException("Invalid bank selected");
        }
    }
}
