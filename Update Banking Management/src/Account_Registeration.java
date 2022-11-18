import java.util.Scanner;

public class Account_Registeration extends Account {
    public Account registerAccount() {

        Account account = new Account();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Account Id : ");
        account.setAccountId(input.next());

        System.out.println("Enter Name : ");
        account.setName(input.next());

        System.out.println("Balance : ");
        account.setBalance(input.nextDouble());

        System.out.println("Enter Status : ");
        account.setStatus(input.next());

        return account;
    }
}
