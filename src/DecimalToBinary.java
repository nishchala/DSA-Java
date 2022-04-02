import java.util.Scanner;
/* Time complexity - O(log(n))
*/
public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter the decimal number: ");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();

        System.out.println("The decimal number is " + decimalToBinary(decimal));
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int base = 1;

        while(decimal > 0) {
            binary += decimal%2 * base;
            decimal /= 2;
            base *= 10;
        }
        return binary;
    }
}
