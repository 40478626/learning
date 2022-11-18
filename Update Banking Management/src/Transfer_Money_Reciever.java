public class Transfer_Money_Reciever extends Account{
    public void TransferMoneyReciever(Account account , double amount) {

        account.setBalance(account.balance + amount);

    }
}
