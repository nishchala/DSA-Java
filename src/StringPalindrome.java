import java.util.Scanner;
/*Brute force - reverse the string and compare if both strings are equal. Time complexity - O(n)
Space complexity is also O(N)

Optimised solution - Two pointer approach.
Left and right pointers pointing to first and last element of string respectively.
if both are equal continue next check(inc and dec pointers) else return false
Time complexity - O(N)
Space complexity - O(1)
 */
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = input.next();

        System.out.println("Is the input string palindrome?: " + isPalindrome(inputString));

        }
    public static boolean isPalindrome(String inputString){
        int left=0;
        int right = inputString.length()-1;

        while(left<right){
            if(inputString.charAt(left)!=inputString.charAt((right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
