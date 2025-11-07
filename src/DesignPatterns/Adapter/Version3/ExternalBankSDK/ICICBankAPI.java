package DesignPatterns.Adapter.Version3.ExternalBankSDK;

public class ICICBankAPI {
    public int fetchBalance(){
        return 0;
    }

    public ICICIBankTranferResponse makeTransfer(ICICIBankTranferRequest request){
        if(fetchBalance() < request.amount){
            throw new RuntimeException("insufficient balance");
        }
        return new ICICIBankTranferResponse();
    }    
    
}
