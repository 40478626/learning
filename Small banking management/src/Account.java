import java.util.Scanner;

public class Account {
    int accountId;
    String name;
    double balance;
    String status;
    Scanner input = new Scanner(System.in);

    public void registerUserAccount(){
        System.out.println("Enter account Id : ");
        accountId = input.nextInt();

        System.out.println("Enter Name : ");
        name = input.next();
    }

    public void displayAccountInfo(){
        System.out.println("Account Information!");
        System.out.println("Account ID : "+ accountId);
        System.out.println("User Name : "+ name);
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}

//class Register extends Account{
//    public void registerUserAccount(){
//        System.out.println("Enter account Id : ");
//        accountId = input.nextInt();
//
//        System.out.println("Enter Name : ");
//        name = input.next();
//    }
//     public void displayAccountInfo(){
//        System.out.println("Account Information!");
//        System.out.println("Account ID : "+ accountId);
//        System.out.println("User Name : "+ name);
//    }
//}