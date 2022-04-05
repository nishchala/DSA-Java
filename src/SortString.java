import java.util.Scanner;
/*Brute force - Apply efficient sorting algorithm TC - O(nLog(n))

Optimised Solution - Use Counting sort since the number of distinct elements are small ( 256 ascii characters ).
Store the frequency of all possible characters in a string in the frequency array and then create
back the string from the frequency array.
Time Complexity - O(N)
Note - Hashmap can also be used instead of frequency array.
 */
public class SortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string ");
        String inputStr = input.next();
        System.out.println("Sorted String is " + sortString(inputStr));
    }

    public static String sortString(String inputString) {
        int[] freq = new int[256];

        for(int i =0; i< inputString.length(); i++){
            freq[inputString.charAt(i)]++;
        }
        char[] sortedString = new char[inputString.length()];
        int j=0;
        for(int i=0;i< freq.length;i++){
            while(freq[i]>0){
                sortedString[j++] = (char)(i);
                freq[i]--;
            }
        }
        return new String(sortedString);
    }
}
