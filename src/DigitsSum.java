import java.util.Scanner;
/*Using recursion find the sum of the digits in given number
Time complexity - O(m) where m is the number of digits in the given number.
 */
public class DigitsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println("Sum of digits of " + n + " is " + digitSum(n));
    }
    static int digitSum(int n) {
        if(n<1){
            return 0;
        }
        return (digitSum(n/10) + n%10);
    }
}
