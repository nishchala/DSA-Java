import java.util.Scanner;
/*
Problem - Given a sorted array and number key, find the number of occurences of key element.

Brute force - Linear search. Time complexity - O(n)

Optimised Solution - Binary search
Time complexity O(log(n))

 */
public class BinSearchNumOfOccurences {
    public static void main(String[] args) {
        System.out.println("In a sorted array we will find the number of occurences of the given key");
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] numbers = arrInOut.inputArray();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key element: ");
        int key = input.nextInt();

        searchOccurence(numbers,key);
    }
    static void searchOccurence(int[] numArray, int key) {
        int first = BinSearchMinIndex.searchIndex(numArray,key);
        if(numArray[first] == key) {
            int last = BinSearchMaxIndex.searchIndex(numArray,key);
            System.out.println("Number of occurences of " + key + " is " + (last-first+1));
        }
        else {
            System.out.println("Key not found in the array");
        }
    }
}
