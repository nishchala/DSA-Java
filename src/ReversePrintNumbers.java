import java.util.Scanner;
/*Using recursion print from n to 1.
Time complexity - O(n)
 */
public class ReversePrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();

        reversePrint(n);
    }
    static void reversePrint(int n) {
        if(n<1) {
            return;
        }
        System.out.print(n + " ");
        reversePrint(n-1);
    }
}
