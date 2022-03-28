import java.util.Scanner;

public class ArrayInputOutput {
    public void printArray(int[] numbers){
        for(int number : numbers) {
            System.out.print(number);
        }
    }

    public int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arraySize = input.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] numArray = new int[arraySize];
        for(int i=0;i<arraySize;i++) {
            numArray[i] = input.nextInt();
        }
        return numArray;
    }
}
