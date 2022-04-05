import java.util.Scanner;
/*Using recursion, find the factorial of a number
Time complexity - O(n)
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factNum(n));
    }
    public static int factNum(int n) {
        if(n<1){
            return 1;
        }
        return (n * factNum(n-1));
    }
}
