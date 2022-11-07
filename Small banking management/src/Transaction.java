import java.awt.*;
import java.util.Scanner;

public class Transaction extends Account{
    int transactionId;
    String sender;
    String receiver;
    double amount;
    float fee;
    double discount;
    String content;
    String createdAt;
    String lastUpdatedAt;
    Scanner input = new Scanner(System.in);

    public void deposit(){
        System.out.println("Enter Account Id : ");
        accountId = input.nextInt();

        System.out.println("Enter deposit amount : ");
        amount = input.nextDouble();

        System.out.println("Enter content : ");
        content = input.next();

        if (amount != 0){
            balance = balance + amount;
        }

        System.out.println("Deposit Amount is successfully added!");
        System.out.println("Balance : " + amount);
        System.out.println("Transaction Id : " + Math.random());
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public void transferMoney() {
        System.out.println("Enter Account Id : ");
        accountId = input.nextInt();
        System.out.println("Remaining balance : "+ balance);
        System.out.println("Enter transfer amount : ");
        amount = input.nextDouble();
        if(amount != 0) {
            fee = (float) (2*amount) / 100;
            //idk what is discount for
            discount = (float) (3*amount)/ 100;
            balance = balance - amount - fee + discount;

        }
        System.out.println("Content for transfer : ");
        content = input.next();

        //new feature

//        discount = (am)
        System.out.println("Transfer fee 2% : "+ fee);
        System.out.println("Transfer discount 3% :"+ discount);
        System.out.println("Balance after transfer : "+ balance);
//        System.out.println("");
        System.out.println("Your money successfully transferred!\n");
        System.out.println("Transaction Id : " + Math.random());
        System.out.println("-------------------------------------------------------------------------------------------");
    }


}


