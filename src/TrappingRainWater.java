/*
Problem - Given n non-negative integers representing an elevation map
where the width of each bar is 1,
compute how much water it is able to trap after raining.

Brute Force - At each index of array find the leftmax and right max ( that is the maximum of all elements
at the left/right) and take the min of the max left and max right, subtract the min of max value with the
value of the elevation at that index.  add all such values obtained at every index. We will store leftmax and rightmax
in two arrays of length O(n). So extra space is required for this solution.
Time complexity is O(N). Space complexity is  O(N)

Optimised solution - Two pointer approach. take left,right, leftmax and rightmax pointers.
Left pointers traverse from start of array. and right pointers iterate from end of array.
if leftmax <= rightmax, then subtract the value at the left index from the leftmax and increment left pointer.
if rightmax < leftmax, then subtract the value at the right index from the rightmax and decrement right pointer.
Repeat until left pointer>right pointer.
Time complexity is O(n). Space - O(1)
 */

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        ArrayInputOutput arrInOut = new ArrayInputOutput();
        int[] rainWaterMap = arrInOut.inputArray();
        int[] rainWaterCopy = Arrays.copyOf(rainWaterMap, rainWaterMap.length);
        calculateTrappedWater(rainWaterMap);
        calculateTrappedWaterTwoPointer(rainWaterCopy);
    }

    static void calculateTrappedWater(int[] elevationMap) {
        int[] leftMax = new int[elevationMap.length];
        int[] rightMax = new int[elevationMap.length];
        int size = elevationMap.length;
        leftMax[0] = elevationMap[0];
        rightMax[size-1] = elevationMap[size-1];

        for(int i = 1; i< size;i++){
            if(leftMax[i-1] > elevationMap[i]) {
                leftMax[i] = leftMax[i-1];
            }
            else{
                leftMax[i] = elevationMap[i];
            }
        }

        for(int i = size-2; i>=0;i--){
            if(rightMax[i+1] > elevationMap[i]) {
                rightMax[i] = rightMax[i+1];
            }
            else{
                rightMax[i] = elevationMap[i];
            }
        }
        int sum = 0;
        for(int i=0; i<size; i++) {
            if(leftMax[i] <= rightMax[i]) {

               sum+= (leftMax[i] - elevationMap[i]);
            }
            else {
                sum+=(rightMax[i] - elevationMap[i]);
            }
        }
        System.out.println("Water stored will be " + sum + " units.");

    }

    static void calculateTrappedWaterTwoPointer(int[] elevationMap) {
        int left = 0;
        int right = elevationMap.length - 1;
        int size = elevationMap.length;
        int leftMax = elevationMap[0];
        int rightMax = elevationMap[size-1];
        int sum = 0;
        while(left<right) {
            if(leftMax<=rightMax) {
                sum+= (leftMax - elevationMap[left]);
                left++;
                if(elevationMap[left] > leftMax) {
                    leftMax = elevationMap[left];
                }
            }
            else{
                sum+= (rightMax - elevationMap[right]);
                right--;
                if(elevationMap[right] > rightMax) {
                    rightMax = elevationMap[right];
                }
            }
        }
        System.out.println("Water stored will be " + sum + " units.");
    }
}
