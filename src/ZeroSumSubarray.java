/* Brute Force - For every element in prefix, subtract every next prefix and if zero then return indices
Time Complexity - O (n^2)

Optimised - Use Hashmap or Hashsets(if only true or false is needed)
If same prefix sum occurs in hashmap then return its indices.
Time Complexity - O(N) on average
 */
import java.util.HashMap;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        ArrayInputOutput arrayInputOutput = new ArrayInputOutput();
        int[] numArray = arrayInputOutput.inputArray();
        int[] zeroSumIndices = findZeroSum(numArray);
        System.out.println("Zero Sum subarray starts from " + zeroSumIndices[0] + " to " + zeroSumIndices[1]);
    }
    public static int[] findZeroSum(int[] numArray){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] prefix = PrefixSum.calculatePrefixSum(numArray);
        int left=-1;
        int right = -1;

        for(int i=0; i < prefix.length; i++) {
            if(prefix[i] == 0) {
                left = 0;
                right = i;
                break;
            }
            else if(numArray[i] == 0) {
                left = i;
                right = i;
                break;
            }
            else if(hashMap.containsKey(prefix[i])) {
                left = hashMap.get(prefix[i]) + 1;
                right = i;
                break;
            }
            hashMap.put(prefix[i],i);
        }
        return (new int[] {left,right});
    }
}
