import  java.util.Scanner;

public class Exe3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the Number: ");
         int a  =in.nextInt();
         for (int b = 1; b<= 10; b++) {
             System.out.println(a + " x " + b + " = " + (a * b) );
         }
    }
}
