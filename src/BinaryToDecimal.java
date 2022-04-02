import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter the binary number: ");
        Scanner input = new Scanner(System.in);
        int binary = input.nextInt();

        System.out.println("The decimal number is " + binaryToDecimal(binary));
    }

    public static int binaryToDecimal(int binary) {
        int base = 1;
        int decimal = 0;
        while(binary > 0) {
            decimal += binary%10 * base;
            binary /= 10;
            base *= 2;
        }
        return decimal;
    }
}
