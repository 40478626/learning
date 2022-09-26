import java.util.Scanner;
public class compareNo {
    public static void main (String agrs [])
    {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Input first integer: ");
         num1 = input.nextInt();

         System.out.print("Input Second integer: ");
         num2 = input.nextInt();

        if ( num1 == num2 )
            System.out.printf( "%d == %d\n", num1, num2 );
        if ( num1 != num2 )
            System.out.printf( "%d != %d\n", num1, num2 );
        if ( num1 < num2 )
            System.out.printf( "%d < %d\n", num1, num2 );
        if ( num1 > num2 )
            System.out.printf( "%d > %d\n", num1, num2 );
        if ( num1 <= num2 )
            System.out.printf( "%d <= %d\n", num1, num2 );
        if ( num1 >= num2 )
            System.out.printf( "%d >= %d\n", num1, num2 );
    }
}
