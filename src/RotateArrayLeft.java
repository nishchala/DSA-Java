import java.util.Arrays;
import java.util.Scanner;
/*Brute force - extra space of O(d) - Time complexity O(n)
store the first d elements in new array,
shift the elements in original array by d positions to left
and then copy back new array to original array adding elements towards the end of the original array.

Time complexity O(n) and no extra space used.
Reverse entire array,
then reverse first n-d elements
and then reverse the remaining d elements.
*/
public class RotateArrayLeft {
    public static void main(String[] args) {

        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numArray = arrInOut.inputArray();
        int[] numArrayCopy = Arrays.copyOf(numArray, numArray.length);

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the number of positions by which to rotate the array: ");
        int d = input.nextInt();

        d = d% numArray.length;
        rotateWithoutExtraSpace(numArray, d);
        System.out.println("Rotated array without using extra space is :");
        arrInOut.printArray(numArray);

        rotateWithExtraSpace(numArrayCopy, d);
        System.out.println("\nRotated array using extra space is :");
        arrInOut.printArray(numArrayCopy);
    }


    public static void rotateWithoutExtraSpace(int[] numbers, int d) {
        ReverseArrayOfNumbers.reverseArray(numbers,0, numbers.length-1); // reverse entire array
        ReverseArrayOfNumbers.reverseArray(numbers,0, numbers.length - d-1); // reverse the first n-d elements
        ReverseArrayOfNumbers.reverseArray(numbers, numbers.length - d , numbers.length-1); // reverse the remaining d elements
    }

    public static void rotateWithExtraSpace(int[] numbers, int d) {

        int[] extraArray = new int[d];
        for(int i = 0; i<d; i++){
            extraArray[i] = numbers[i];
        }
        for(int j = 0; j<numbers.length - d; j++) {
            numbers[j] = numbers[j+d];
        }
        for(int k = 0; k < d; k++){
            numbers[numbers.length-d+k] = extraArray[k];
        }
    }
}
