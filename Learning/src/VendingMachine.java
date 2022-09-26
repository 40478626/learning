public class VendingMachine

{

    public VendingMachine()

    {

        System.out.println(

                " vending machine object was generated.");

    }

    public void payCheck()

    {

        System.out.println("injection amount of money check processing.");

    }

    public void buttonCheck()

    {

        System.out.println("The check disposal of buttons pushed down. ");

    }

    public void changeCheck()

    {

        System.out.println("Amount of money check disposal of change. ");

    }

    public void getCan()

    {

         System.out.println(" juice acquisition. ");

    }

    public static void main(String[] args)

    {

        // object generation.

        VendingMachine machine = new VendingMachine();

        // 1. I check a spent amount of money.

        machine.payCheck();

        // 2. I check a button pushed down.

        machine.buttonCheck();

        // 3. I check the change.

        machine.changeCheck();

        // 4. I acquire deuce.

        machine.getCan();

    }

}