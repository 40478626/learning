public class Main {
    public static void main(String[] args) {
        double TotalAmount = 8000 ;
        double AddAmount = 2000;
        TotalAmount = TotalAmount + AddAmount;
        System.out.println("Total Amount: " + TotalAmount);

        double WithdrawAmount = 9000;
        TotalAmount = TotalAmount - WithdrawAmount;
        System.out.println("Total Amount After Withdraw :" + TotalAmount );
    }
}