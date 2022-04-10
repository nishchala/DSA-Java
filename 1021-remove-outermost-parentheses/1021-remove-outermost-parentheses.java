class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for( char ch : s.toCharArray()) {
            
            if(ch == ')'){
                
                st.pop();
            }
            if(st.size()!=0){
                    sb.append(ch);
                }
           
            if(ch == '(') {
                st.push(ch);
            }      
        }
      
        return sb.toString();
    }
}