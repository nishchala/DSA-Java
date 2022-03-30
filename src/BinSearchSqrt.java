import java.util.Scanner;
/* Problem - Find sqrt of given positive number

Brute force - Linear search - O(sqrt(n))

Optimised solution - Binary search.
Time complexity - O(Log(n))
 */
public class BinSearchSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the positive number: ");
        int number = input.nextInt();

        System.out.println("Square root(Integer) of given number is " + squareRoot(number));
    }

    public static int squareRoot(int number) {
        if(number == 0 || number == 1){
            return number;
        }
        int low = 1;
        int high = number - 1;
        int result = 0;
        while(low<=high) {
            int mid = low + (high - low)/2;
            if(mid*mid == number) {
                return mid;
            }
            else if(mid*mid > number) {
                high = mid - 1;
            }
            else {
                low = mid+1;
                result = mid;
            }
        }
        return result;
    }
}
