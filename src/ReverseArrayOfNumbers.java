import java.util.Scanner;

/*Brute force - extra space of O(n) - Time complexity O(n)
iterate the array backwards and store the elements in new array and then copy back to original array.

Time complexity O(n) and no extra space used.
using the two pointers left and right and swapping elements method.
*/

public class ReverseArrayOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arraySize = input.nextInt();
        System.out.println("Enter the elements in the array: ");
        int[] numbers = new int[arraySize];
        for(int i =0; i< arraySize; i++){
            numbers[i] = input.nextInt();
        }

        reverseArray(numbers,0,arraySize-1);
        System.out.println("Reversed array is : ");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void reverseArray(int[] originalArray, int left, int right) {
        int temp;
        while(left<right) {
            temp = originalArray[left];
            originalArray[left] = originalArray[right];
            originalArray[right] = temp;
            left++;
            right--;
        }
    }
}
