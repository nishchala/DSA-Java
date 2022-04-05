import java.util.Scanner;
/*Using recursion print from 1 to n.
Time complexity - O(n)
 */
public class ForwardPrintOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = input.nextInt();

        forwardPrint(n);
    }

    static void forwardPrint(int n) {
        if(n<1){
            return;
        }
        forwardPrint(n-1);
        System.out.print(n + " ");
    }
}
