import java.util.Scanner;
/*
Problem - Given a sorted array and number key, find the min index of number greater than or equal to key.

Brute force - Linear search. Time complexity - O(n)

Optimised Solution - Binary search
Time complexity O(log(n))

 */
public class BinSearchMinIndex {
    public static void main(String[] args) {
        System.out.println("In a sorted array, we will find the min index of number greater than or equal to the given number");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numbers = arrInOut.inputArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key element: ");
        int key = input.nextInt();

        System.out.println("Min Index of greater or equal number to key is " + searchIndex(numbers,key));
    }

    public static int searchIndex(int[] numArray, int key) {
        int high = numArray.length - 1;
        int low = 0;

        while(low<=high) {
            int mid = low + (high - low)/2;
            if(numArray[mid] >= key) {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
