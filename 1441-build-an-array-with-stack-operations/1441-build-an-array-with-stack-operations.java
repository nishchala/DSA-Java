class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> st = new Stack<>();
        List<String> ops = new ArrayList<>();
        int i=0;
        int num = 1;
       while(n>0 && i<target.length) {
           
           st.push(num++);
           ops.add("Push");
           if(st.peek() == target[i]) {
                i++;
           }
           else{
               st.pop();
               ops.add("Pop");
           }       
           n--;
       }
        return ops;
       
    }
}