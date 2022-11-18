public class Transfer_Money_Sender extends Account {
    public  void transferMoneySender(Account account, double amount){

        if(account.getBalance() > amount) {

            fee = (float) (2 * amount) / 100;
            discount = (float) (3 * amount) / 100;
            amount = amount + fee - discount;
            account.setBalance(account.balance - amount);
        }
        else {
            System.out.println("Insufficient Balance! Deposit more to transfer!");
        }
        System.out.println("Hello "+ account.name + "! You are successfully transferred money. Remaining Balance : " + account.balance);
    }
}
