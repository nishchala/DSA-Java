import java.util.Scanner;
/*Brute force - O(n^2) where each subarray sum is checked.

Optimised - Using variable sliding window technique.
time complexity - O(n)
 */
public class SlidingSubArrayTargetSum {
    public static void main(String[] args) {
        ArrayInputOutput arrayInputOutput = new ArrayInputOutput();
        int[] numbers = arrayInputOutput.inputArray();
        System.out.println("Enter the target sum ");
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        System.out.println("Nunmber of subarrays with given target sum is " + slidingSubArrayTargetSum(numbers,k));
    }

    public static int slidingSubArrayTargetSum(int[] numArray, int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSize = 0;

        while(right < numArray.length) {
            sum = sum + numArray[right];
            if(sum<k) {
                right++;
            }
            else if(sum>k){
                while(sum>k && left<=right){
                    sum-=numArray[left];
                    left++;
                }
                right++;
            }
            else{
                if(maxSize<(right-left+1)){
                    maxSize = right-left+1;
                }
                right++;
            }
        }
        return maxSize;
    }
}
