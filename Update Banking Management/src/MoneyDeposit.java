public class MoneyDeposit {
    public Account depositMoney(){
        Account account = new Account();
        double amount;
        System.out.println("Enter your deposit amount : ");
        amount = account.input.nextDouble();
        account.balance += amount;
        System.out.println("Deposit Money is successfully added! New balance is " + account.balance);
        return account;
    }
}
