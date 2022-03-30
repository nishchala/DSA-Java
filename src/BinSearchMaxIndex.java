import java.util.Scanner;
/*
Problem - Given a sorted array and number key, find the greatest index of number less than or equal to key.

Brute force - Linear search. Time complexity - O(n)

Optimised Solution - Binary search
Time complexity O(log(n))

 */
public class BinSearchMaxIndex {
    public static void main(String[] args) {
        System.out.println("In a sorted array, we will find the max index of number smaller than or equal to the given number");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numbers = arrInOut.inputArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key element: ");
        int key = input.nextInt();

        System.out.println("Max index of number smaller or equal to " + key + " is " + searchIndex(numbers,key));
    }

    public static int searchIndex(int[] numArray, int key) {
        int high = numArray.length - 1;
        int low = 0;

        while(low<=high) {
            int mid = low + (high - low)/2;
            if(numArray[mid] <= key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return (low-1);
    }
}
