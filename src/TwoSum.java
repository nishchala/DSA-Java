import java.util.HashSet;
import java.util.Scanner;
/* Brute Force - Add every number in  array with every other element in that array and return the numbers if their
sum is equal to target sum
Time complexity - O(n^2)

Optimised Solution - for each element in array check if its target-element value is present in hashset.
It is present return the two elements, else add the element to hashset.

Time Complexity - O(N) on average
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println("We will find two numbers in array whose sum is given target sum");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numArray = arrInOut.inputArray();

        System.out.println("Enter the target sum: ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();

        twoSum(numArray,target);

    }
    public static void twoSum(int[] numbers, int target){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num: numbers) {
            int remainder = target - num;
            if(hashSet.contains(remainder)){
                System.out.println("two numbers in array with given target sum are " + num + " & " + remainder);
                break;
            }
            hashSet.add(num);
        }
    }
}
