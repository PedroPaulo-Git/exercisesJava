import java.util.Objects;
import java.util.Scanner;
import entites.bank;
public class Main {

    public static void main(String[] args) {
        int numberAccount;
        String holderAccount;
        double balanceAccount;
        String deposit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number : ");
        numberAccount = sc.nextInt();
        System.out.print("Enter account holder : ");
        holderAccount = sc.next();
        System.out.print("is there a initial deposit (y/n)");
        deposit = sc.next();
        if (Objects.equals(deposit, "y")){
            System.out.print("Enter a initial deposit value : $");
            balanceAccount = sc.nextDouble();

        }
        else {
            balanceAccount = 0;
        }

        bank bankAccount = new bank(numberAccount,holderAccount,balanceAccount);
        System.out.println("Account data: ");
        System.out.println("Account " + bankAccount.getNumberAccount()+", Holder: "+ bankAccount.getHolderAccount()+ ", Balance: $" + bankAccount.getBalanceAccount());

        System.out.print("Enter a deposit value:");
        balanceAccount = sc.nextDouble();
        bankAccount.depositAccount(balanceAccount);
        System.out.println("Updated account data: ");
        System.out.println("Account " + bankAccount.getNumberAccount()+", Holder: "+ bankAccount.getHolderAccount()+ ", Balance: $" + bankAccount.getBalanceAccount());

        System.out.print("Enter a withdraw value:");
        balanceAccount = sc.nextDouble();
        bankAccount.withDrawBalance(balanceAccount);


        System.out.println("Updated account data: ");
        System.out.println("Account " + bankAccount.getNumberAccount()+", Holder: "+ bankAccount.getHolderAccount()+ ", Balance: $" + bankAccount.getBalanceAccount());


    }
}