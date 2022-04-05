import java.util.Scanner;
/*Brute Force - store the freq array for both strings and compare the freq of each letter.
Time complexity - O(n)

Optimised solution - We can store the freq of string 1 elements and decrement the freq with the string 2 chars.
Finally, add all absolute values of frequency array.
Time complexity O(n)
 */
public class MinCharsForAnagram {
    public static void main(String[] args) {
        System.out.println("Enter the first string ( all lowercase )");
        Scanner input = new Scanner(System.in);
        String stringOne = input.next();

        System.out.println("Enter the second string ( all lowercase )");
        String stringTwo = input.next();

        System.out.println("Minimum number of characters to make anagram are: " + numberOfCharsToAnagram(stringOne,stringTwo));
    }
    static int numberOfCharsToAnagram(String stringOne, String stringTwo) {
        int[] freq = new int[26];

        for(int i=0;i<stringOne.length();i++){
            freq[stringOne.charAt(i) - 'a']++;
        }
        for(int i =0; i< stringTwo.length(); i++){
            freq[stringTwo.charAt(i) - 'a']--;
        }
        int sum = 0;
        for(int i=0;i<26;i++){
            sum+=Math.abs(freq[i]);
        }
        return sum;
    }
}
