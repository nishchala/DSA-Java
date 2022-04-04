/*Class with calculatePrefixSum method to find the prefix sum of array.
Time Complexity - O(n)
Space complexity - O(n)
 */
public class PrefixSum {
    public static void main(String[] args) {
        ArrayInputOutput arrayInputOutput = new ArrayInputOutput();
        System.out.println("We will find prefix sum of given array");
        int[] numArray = arrayInputOutput.inputArray();
        int[] prefix = calculatePrefixSum(numArray);
        System.out.println("Prefix sum array is : ");
        for(int sum : prefix) {
            System.out.print(sum + " ");
        }
    }
    public static int[] calculatePrefixSum(int[] numArray) {
        int[] prefix = new int[numArray.length];
        int sum = numArray[0];
        prefix[0] = sum;
        for(int i= 1; i<numArray.length;i++) {
            prefix[i] = sum + numArray[i];
            sum = prefix[i];
        }
        return prefix;
    }
}
