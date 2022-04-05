import java.util.Scanner;
/*Using recursion find the nth fibonacci number.
Time Complexity - O(2^n)
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();
        System.out.println("The nth fibonacci number is " + fib(n));
    }
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return (fib(n-1) + fib(n-2));
    }
}
