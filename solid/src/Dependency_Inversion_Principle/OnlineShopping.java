package Dependency_Inversion_Principle;

public class OnlineShopping {
    private PaymentMethod paymentMethod;

    public OnlineShopping(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void doPurchase(long amount) {
        paymentMethod.doTransition(amount);
    }

    public static void main(String[] args) {

        //Cash cash = new Cash();
        //MobilePay mobilePay = new MobilePay();
        PaymentMethod paymentMethod = new MobilePay();
        OnlineShopping onlineShopping = new OnlineShopping(paymentMethod);

        onlineShopping.doPurchase(10000);
    }
}
