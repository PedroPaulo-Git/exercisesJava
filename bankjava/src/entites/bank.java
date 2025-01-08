package entites;

public class bank {
    private int numberAccount;
    private String holderAccount;
    private double balanceAccount;

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public void setHolderAccount(String holderAccount) {
        this.holderAccount = holderAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public bank(int numberAccount, String holderAccount, double balanceAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.balanceAccount = balanceAccount;
    }

    public void withDrawBalance (double withdraw){
         balanceAccount -= withdraw + 5;
    }
    public void depositAccount (double balanceAccount){
        this.balanceAccount += balanceAccount;
    }
}
