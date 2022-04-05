import java.util.Scanner;
/* Use the two pointer approach to find if second string is subsequence of first string
Time complexity - O(N)
 */
public class StringSubsequenceCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = input.next();

        System.out.println("Enter the second string");
        String str2 = input.next();

        System.out.println("Second string is subsequence of first: " + isSubsequence(str1, str2));

    }
    static boolean isSubsequence(String str1, String str2) {
        int ptr1 = 0;
        int ptr2 = 0;

        if(str2.length()>str1.length()){
            return false;
        }
        while(ptr1<str1.length() && ptr2<str2.length()){
            if(str1.charAt(ptr1) != str2.charAt(ptr2)) {
                ptr1++;
            }
            else {
                ptr1++;
                ptr2++;
            }
        }
        if(ptr2 < str2.length()) {
            return false;
        }
        return true;
    }
}
