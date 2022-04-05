import java.util.Scanner;
/*Convert a string to integer without recursion.
Time Complexity - O (n)
 */
public class StringToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numeric string");
        String numberString = input.next();
        System.out.println("String in Integer format is " + stringToInt(numberString));
    }
    static int stringToInt(String str) {
        int x = 0;
        for(int i = 0; i<str.length();i++){
            x = x*10 + (str.charAt(i) - '0');
        }
        return x;
    }
}
