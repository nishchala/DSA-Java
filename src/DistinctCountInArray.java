import java.util.Arrays;
import java.util.HashSet;
/* Brute Force - sort the array and starting  from first element iterate the array and count only the
unique occurences
Time Complexity - O(nLogn)

Optimised Solution - Use HashSet. Copy the array elements in the HashSet and return its size.
Time Complexity - O(N) on average.
 */
public class DistinctCountInArray {
    public static void main(String[] args) {
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        System.out.println("We wil find the count of distinct elements in the given array");
        int[] numArray = arrInOut.inputArray();

        System.out.println("Number of unique/distinct elements in given array is " + countDistinct(numArray));

        System.out.println("Unique elements count  without using HashSet: " + sortAndCountUnique(numArray));
    }

    public static int countDistinct(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<numbers.length;i++) {
            hashSet.add(numbers[i]);
        }
        return hashSet.size();
    }

    static int sortAndCountUnique(int[] numbers) {
        Arrays.sort(numbers);
        int count = 0;
        for(int i=0; i<numbers.length;i++) {
            while(i<(numbers.length-1) && numbers[i]==numbers[i+1]){
                i++;
            }
            count++;
        }
        return count;
    }
}
