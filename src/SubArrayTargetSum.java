
import java.util.HashSet;
import java.util.Scanner;
/* Brute force - O(n^2) - Find the sum of every subarray.

Optimised - Use prefix sum array. In the prefix sum array, find the two elements where prefix[i] - k is in the hashset
 , if not add the prefix sum in the hasset and go to next prefix sum element.
 Time complexity - O(n)
 */
public class SubArrayTargetSum {
    public static void main(String[] args) {
        ArrayInputOutput arrayInputOutput = new ArrayInputOutput();
        int[] numbers = arrayInputOutput.inputArray();
        System.out.println("Enter the target sum ");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println("Nunmber of subarrays with given target sum is " + subArrayTargetSum(numbers,k));
    }
    public static int subArrayTargetSum(int[] numArray, int k) {
        int[] prefix = PrefixSum.calculatePrefixSum(numArray);
        HashSet<Integer> hashSet = new HashSet<>();
        int count = 0;
        for(int i = 0; i< numArray.length; i++) {
            int sum = prefix[i] - k;
            if(sum == 0) {
                count++;
            }
            else if(hashSet.contains(sum)) {
                count++;
            }
            hashSet.add(prefix[i]);
        }
        return count;
    }
}
