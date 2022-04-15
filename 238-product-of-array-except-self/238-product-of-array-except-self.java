class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int[] result = new int[nums.length];
        
        for(int i = 0; i< nums.length; i++){
            result[i] = prefix;
            prefix = result[i] * nums[i];
        }
        for(int i=nums.length-1;i>=0; i--) {
            result[i] = result[i]*postfix;
            postfix = postfix*nums[i];
        }
        return result;
    }
}