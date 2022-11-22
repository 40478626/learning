import java.util.Scanner;
public class DepositMoney {
    public void depositMoney(Account account){
        double amount;
        double afterBalance;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your deposit amount : ");
        amount = input.nextDouble();
        afterBalance = account.balance + amount;
        account.setBalance(afterBalance);

    }
}
