class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i<ops.length;i++) {
            if(ops[i].equals("C")){
                sum-=st.pop();    
            }
            else if(ops[i].equals("D")) {
                sum+=(st.peek() * 2);
                st.push(st.peek()*2);
            }
            else if(ops[i].equals("+")) {
                int numTop = st.pop();
                int secondTop = st.pop();
                int addition = numTop + secondTop;
                sum+=addition;
                st.push(secondTop);
                st.push(numTop);
                st.push(addition);       
            }
            else {
                st.push(Integer.parseInt(ops[i]));
                sum+=Integer.parseInt(ops[i]);
            }
        }
        return sum;
    }
}