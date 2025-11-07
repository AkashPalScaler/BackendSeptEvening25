package DesignPatterns.Adapter.Version3.BankAdapters;

import DesignPatterns.Adapter.Version3.BankAPIInterface;
import DesignPatterns.Adapter.Version3.ExternalBankSDK.ICICBankAPI;
import DesignPatterns.Adapter.Version3.ExternalBankSDK.ICICIBankTranferRequest;
import DesignPatterns.Adapter.Version3.ExternalBankSDK.ICICIBankTranferResponse;

public class ICICIBankAdapter implements BankAPIInterface {
    ICICBankAPI icicBankAPI = new ICICBankAPI();
    @Override
    public int getBalanceInfo() {
        return icicBankAPI.fetchBalance();
    }

    @Override
    public boolean sendMoney(int amount, String fromUPI, String toUPI) {
        // PhonePeTransferRequest -> ICICIBankTransferRequest
        ICICIBankTranferRequest request = new ICICIBankTranferRequest();
        request.setAmount(amount);
        request.setFromUPI(fromUPI);
        request.setToUPI(toUPI);

        ICICIBankTranferResponse response = icicBankAPI.makeTransfer(request);
        // ICICIBankTranferResponse -> PhoneBankTransferResponse
        return response.success;
    }
}
