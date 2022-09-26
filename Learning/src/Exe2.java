import java.util.Scanner;

public class Exe2 {
     public static void main  (String[ ] args){
         Scanner A = new Scanner(System.in);
         System.out.println("Input First Number:  ");
         int no1 = A.nextInt();

         System.out.println("Input Second Number:  ");
         int no2 = A.nextInt();
         System.out.println(no1+ " + "+ no2 + " = " +  (no1+no2) );
         System.out.println(no1+ " - " +   no2 + " = " +(no1-no2));
         System.out.println(no1+ " x " +   no2 + " = " +(no1*no2));
         System.out.println(no1+ " / " +   no2 + " = " +(no1/no2));
         System.out.println(no1+ " mod " +   no2 + " = " +(no1%no2));
     }
}