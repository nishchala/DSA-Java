import java.util.Scanner;
// Time complexity = O(logN)
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("We will search a number in a sorted array of numbers.");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numbers = arrInOut.inputArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int num = input.nextInt();

        int result = binSearch(numbers,num);
        if(result >-1) {
            System.out.println("Given number is present at position " + result);
        }
        else {
            System.out.println("Given number is not present in the array");
        }
    }

    public static int binSearch(int[] numbers, int  number) {
        int low = 0;
        int high = numbers.length -1;
        int mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(numbers[mid] == number) {
                return mid;
            }
            else if(numbers[mid] < number) {
                low = mid +1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
