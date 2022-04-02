/* Brute force - For every element in one array, search if it is present in another array
by comparing with every element in second array. Time Complexity - O(N^2)
Or
For each element in an array run a binary search to find that element in second array.
Time Complexity - O(nLogn)

Optimised Solution - XOR all the elements of both arrays and the result will be the missing element.
Time Complexity - O(n) where n is the total number of elements in both arrays.
 */

public class MissingNumberInDuplicateArrays {
    public static void main(String[] args) {
        System.out.println("We will find the missing number in the two arrays which " +
                "have exactly same elements except one");
        System.out.println("First array elements ");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] array1 = arrInOut.inputArray();

        System.out.println("Second array elements ");
        int[] array2 = arrInOut.inputArray();

        System.out.println("Missing number is " + findMissingMumber(array1,array2));
    }

    static int findMissingMumber(int[] a, int[] b){
        int ans=0;
        for(int i = 0; i< a.length; i++){
            ans^=a[i];
        }
        for(int i = 0; i<b.length;i++) {
            ans^=b[i];
        }
        return ans;
    }
}
