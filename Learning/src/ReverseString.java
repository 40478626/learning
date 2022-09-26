import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] B = A.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = B.length - 1; i >= 0; i--) {
            System.out.print(B[i]);
        }
        System.out.print("\n");
    }
}