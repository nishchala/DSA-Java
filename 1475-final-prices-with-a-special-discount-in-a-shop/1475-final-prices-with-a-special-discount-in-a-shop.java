class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] discountedPrice = new int[prices.length];
        for(int i=(prices.length -1);i>=0;i--){
                 
            while(!st.isEmpty() && (prices[i] < st.peek())){ 
                    st.pop();             
            }
            
            if(!st.isEmpty()){
                discountedPrice[i] = prices[i] - st.peek();
            }
            else {
                discountedPrice[i] = prices[i];
            }
            
            st.push(prices[i]);      
        }
        return discountedPrice;
    }
}