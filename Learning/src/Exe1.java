import java.util.Scanner;

public class Exe1 {
    public static void main (String[] args){
        Scanner A = new Scanner(System.in);

        System.out.print("Input First Number:  ");
        int  num1  = A.nextInt();

        System.out.print("Input Second Number:  ");
        int  num2  = A.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}