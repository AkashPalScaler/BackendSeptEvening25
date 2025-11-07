package DesignPatterns.Adapter.Version3.ExternalBankSDK;

public class ICICIBankTranferRequest {
    String fromUPI;
    String toUPI;
    int amount;

    public String getFromUPI() {
        return fromUPI;
    }

    public void setFromUPI(String fromUPI) {
        this.fromUPI = fromUPI;
    }

    public String getToUPI() {
        return toUPI;
    }

    public void setToUPI(String toUPI) {
        this.toUPI = toUPI;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
