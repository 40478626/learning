
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = input.nextInt();
        Account[] acc = new Account[n];

        AccountRegisteration account_registeration = new AccountRegisteration();
        for (int i = 0; i < n; i++) {
            acc[i] = account_registeration.registerAccount();
        }

        //looping until input is "D"
        String opition;
        do {
            System.out.println("Main Menu!");
            System.out.println(" A. View all registered Account");
            System.out.println(" B. Add deposit to Account");
            System.out.println(" C. Transfer money");
            System.out.println(" D. Exit");
            System.out.println("Enter Your Option : ");
            opition = input.next();

            switch (opition) {
                case "A" -> {
                    AccountInformation information = new AccountInformation();
                    for (int i = 0; i < n; i++) {
                        information.showAccountInfo(acc[i].getAccountId(), acc[i].getName(), acc[i].getBalance(), acc[i].getStatus());
                    }
                }
                case "B" -> {
                    DepositMoney deposit = new DepositMoney();
                    System.out.println("Enter Account Id : ");
                    String id = input.next();

                    Account account = (Account) Arrays.stream(acc).filter(filteredAccount -> Objects.equals(filteredAccount.accountId, id)).toArray()[0] ;
                    deposit.depositMoney(account);
                    System.out.println("Deposit Money is successfully added! New balance is " + account.getBalance());
                }
                case "C" -> {
                    MoneyReciever reciever = new MoneyReciever();
                    MoneySender sender = new MoneySender();

                    System.out.println("Enter Account Id that you want to transfer: ");
                    String recieverId = input.next();

                    Account recieverAcc = (Account) Arrays.stream(acc).filter(filteredAccount -> Objects.equals(filteredAccount.accountId, recieverId)).toArray()[0];
                    System.out.println("Enter Amount to transfer : ");
                    double amount = input.nextDouble();

                    reciever.transferMoneyReciever(recieverAcc, amount);
                    System.out.println("Enter your account Id : ");
                    String senderId = input.next();

                    Account SenderAcc = (Account) Arrays.stream(acc).filter(filteredAccount -> Objects.equals(filteredAccount.accountId, senderId)).toArray()[0];
                    sender.transferMoneySender(SenderAcc, amount);
                }
            }
        }
        while (!opition.equals("D"));
    }

}