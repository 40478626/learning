import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
//    Account user = new Account("1","Amara",0, "SavinG");
        Scanner input = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = input.nextInt();
        Account[] acc = new Account[n];
        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account();
            acc[i].registerAccount();
        }
//        List<Account> acc = new ArrayList<>();
//        for (Account account:acc){
//
//        }

        //looping until input is "E"
        String opition ="";
        do {
            System.out.println("Main Menu!");
            System.out.println(" A. View all registered Account");
            System.out.println(" B. Search registered User");
            System.out.println(" C. Add deposit to Account");
            System.out.println(" D. Transfer money");
            System.out.println(" E. Exit");
            System.out.println("Enter Your Option : ");
            opition = input.next();
            boolean found = false;

            switch (opition) {
                case "A":
                    for (int i = 0; i< acc.length;i++){
                        acc[i].showAccountInfo();
                    }
                    break;
                case "B":
                    System.out.println("Enter Account Id : ");
                    String id = input.next();

                    for (int i=0 ; i< acc.length; i++){
                        found = acc[i].search(id);
                        if (found){
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Failed! no acc id!");
                    }
                    break;
                case "C":
                    System.out.println("Enter Account Id : ");
                    id = input.next();
                    acc[Integer.parseInt(id)].depositMoney();
                    break;

                case "D":
                    System.out.println("Enter Amount to transfer : ");
                    double amount = input.nextDouble();

                    System.out.println("Enter Account Id that you want to transfer: ");
                    String recieverId = input.next();
                    acc[Integer.parseInt(recieverId)].TransferMoneyReciever(amount);

                    System.out.println("Enter your account Id : ");
                    String senderId = input.next();
                    acc[Integer.parseInt(senderId)].TransferMoneySender(amount);

                case "E":
                    System.out.println("Thanks for using our service!");
                    break;
            }
        }
        while (opition != "E");
    }

}