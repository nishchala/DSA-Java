/* Find perfect square root of any number ( integer or floating) with two demical places.

Brute Force - Linear search O(sqrt N)

Optimised solution - Binary Search O(Log N)
 */
import java.util.Scanner;

public class BinSearchFloatingSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double number = input.nextDouble();

        System.out.println("Sqrt of given number is " + squareRoot(number));
    }
    public static double squareRoot(double number) {

        double low = 0;
        double high = number + 1;
        double result = 0;
        while(low<=high) {
            double mid = low + (high - low)/(double)2;

            if(Math.abs((mid*mid) - number) < 0.01) {

                return (Math.floor(mid * 100) / 100);
            }
            else if(mid*mid < number) {
                low = mid + 0.001;
                result = mid;
            }
            else {
                high = mid - 0.001;

            }
        }
        return (Math.floor(result * 100) / 100);
    }
}
