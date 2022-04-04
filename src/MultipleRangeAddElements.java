import java.util.Scanner;
/* Brute force - O(n* q) where q is number of queries and n is length of array
In this approach for each query we will add the numbers within range left,right.

Optimised approach - In this we will make use of prefix sum concept. Each query will take O(1)
we will add target to only left and subtract it from right element in array for each query.
In the end we will return the prefix sum array.
Time complexity - O(n+q) or O(n)
 */
public class MultipleRangeAddElements {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the number of queries ");
        int queries = input.nextInt();

        int left = 0;
        int right = 0;
        while(queries>0){
            System.out.println("Enter the left index ");
            left = input.nextInt();
            System.out.println("Enter the right index ");
            right = input.nextInt();
            System.out.println("Enter the target value ");
            int target = input.nextInt();

            array[left] += target;

            if(right + 1 < size) {
                array[right + 1] -= target;
            }
            queries--;
        }
        for(int i = 1; i<size ; i++){
            array[i] += array[i-1];
        }
        System.out.println("Output array : ");
        for(int num: array) {
            System.out.print(num + " ");
        }
    }
}
