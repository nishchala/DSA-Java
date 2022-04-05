import java.util.Scanner;
/*Brute Force - Sort both strings and verify if they are equal
Time complexity - O(nlog(n)) or O(n) depending on how you sort. ( Check if counting sort applies to
sorting strings. O(N))
Or
Second approach is to use frequency arrays for both strings and verify if freq arrays are equal.
Time complexity - O(N). Space complexity O(N)

Optimised Solution - Use only one frequency array. Count frequency during one loop of first string
Decrement frequency during loop of second string.
Time complexity - O(N) space complexity O(N)
 */
public class StringAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string one (all lowercase characters)");
        String stringOne = input.next();

        System.out.println("Enter second string (all lowercase characters)");
        String stringTwo = input.next();

        System.out.println("The two Strings are anagram: " + isAnagram(stringOne,stringTwo));

    }

    static boolean isAnagram(String stringOne, String stringTwo) {
        int[] freq = new int[26];

        if(stringOne.length() != stringTwo.length()){
            return false;
        }

        for(int i=0;i<stringOne.length();i++){
            freq[stringOne.charAt(i) - 'a']++;
        }
        for(int i=0;i<stringTwo.length();i++){
            freq[stringTwo.charAt(i) - 'a']--;
        }
        for(int num : freq ){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
