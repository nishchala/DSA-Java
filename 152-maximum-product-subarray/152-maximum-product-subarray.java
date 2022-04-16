class Solution {
    public int maxProduct(int[] nums) {
        int cproduct = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            cproduct*= nums[i];
            max = Math.max(cproduct,max);
            if(cproduct==0){
                cproduct =1;
            }
        }
        cproduct = 1;
        for(int i=nums.length-1;i>=0;i--){
            cproduct*=nums[i];
            max = Math.max(cproduct,max);
             if(cproduct==0){
                cproduct =1;
            }
        }
        return max;
    }
}