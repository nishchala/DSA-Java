/*Recursively add the elements in an array
Time complexity - O(n)
 */
public class SumArrayRecursion {
    int[] arr;
    public SumArrayRecursion(int[] arr) {
        this.arr = arr;
    }
    public static void main(String[] args) {
        ArrayInputOutput arrayInputOutput = new ArrayInputOutput();
        int[] arr = arrayInputOutput.inputArray();
        SumArrayRecursion sum = new SumArrayRecursion(arr);
        System.out.println("Sum of all array elements is " + sum.sumArray(arr.length-1));
    }
    int sumArray(int n){
        if(n==0) {
            return arr[0];
        }
        return (sumArray(n-1) + arr[n]);
    }
}
