
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Account account = new Account();
//        account.registerUserAccount();
//        account.displayAccountInfo();

        Transaction transaction = new Transaction();
//        transaction.deposit();
//        transaction.transferMoney();

        String option = "/0";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("A : Register");
        System.out.println("B : Deposit");
        System.out.println("C : Transfer");
        System.out.println("D : Exit");

        do {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Choose your option : ");
            option = scanner.next();
            System.out.println("\n");
            switch (option) {
                case "A":
                    System.out.println("-------------------------------------------------------------------------------------------");
                    account.registerUserAccount();
                    account.displayAccountInfo();
                    System.out.println("\n");
                    break;
                case "B":
                    System.out.println("-------------------------------------------------------------------------------------------");
                    transaction.deposit();
                    System.out.println("\n");
                    break;
                case "C":
                    System.out.println("-------------------------------------------------------------------------------------------");
                    transaction.transferMoney();
                    System.out.println("\n");
                    break;
                case "D":
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Thanks for using our services!");
                    break;
                default:
                    System.out.println("Invalid Option! Please enter A,B,C or D!");
                    break;
            }
        }
        while (option != "D");
    }
}