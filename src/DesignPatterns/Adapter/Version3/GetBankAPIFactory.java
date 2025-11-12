package DesignPatterns.Adapter.Version3;

import DesignPatterns.Adapter.Version1.YesBankAPI;
import DesignPatterns.Adapter.Version3.BankAdapters.ICICIBankAdapter;
import DesignPatterns.Adapter.Version3.BankAdapters.YesBankAdapter;

public class GetBankAPIFactory {
    static BankAPIInterface getBankAPI(String bank){
        if(bank == "yesbank") return new YesBankAdapter();
        else if (bank == "icici") {
            return new ICICIBankAdapter();
        }
        else {
            throw new RuntimeException("Invalid bank selected");
        }
    }
}
