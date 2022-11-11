import java.util.Scanner;

public class Account {
    String accountId;
    String name;
    double balance;
    String status;
    double fee;
    double discount;

    Scanner input = new Scanner(System.in);
    public Account() {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
        this.status = status;
    }

    public void registerAccount(){
        System.out.println("Enter Account Id : ");
        accountId = input.next();

        System.out.println("Enter Name : ");
        name = input.next();

        System.out.println("Balance : ");
        balance = input.nextDouble();

        System.out.println("Enter Status : ");
        status = input.next();
    }

    public void showAccountInfo (){
        System.out.println("Account Id :"+ accountId + " Name : "+ name+ " Balance : "+ balance+ " Status : "+ status);
    }
    public void depositMoney(){
        double amount;
        System.out.println("Enter your deposit amount : ");
        amount = input.nextDouble();
        this.balance += amount;
        System.out.println("Deposit Money is successfully added! New balance is " + this.balance);
    }

    boolean search(String userinput){
        if (accountId.equals(userinput)){
            showAccountInfo();
            return (true);
        }
        return (false);
    }
    public  void TransferMoneySender(double amount){

        if(this.balance > amount) {

            fee = (float) (2 * amount) / 100;
            discount = (float) (3 * amount) / 100;
            amount = amount + fee - discount;
            this.balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance! Deposit more to transfer!");
        }
        System.out.println("Hello "+ name + "! You are successfully transferred money. Remaining Balance : " + balance);
    }
    public  void TransferMoneyReciever(double amount) {
            balance = balance + amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
