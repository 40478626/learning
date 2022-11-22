public class MoneyReciever extends Account{
    public void transferMoneyReciever(Account account , double amount) {

        account.setBalance(account.balance + amount);

    }
}
