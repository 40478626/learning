package Dependency_Inversion_Principle;

public class Cash implements PaymentMethod {

    public void doTransition(long amount) {
        System.out.println("Purchase by using Mobile Pay!");
    }
}