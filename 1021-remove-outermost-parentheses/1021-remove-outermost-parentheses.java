class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for( char ch : s.toCharArray()) {
            if(ch == '('){
                if(st.size()!=0){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else if(ch==')' && st.size() > 1) {
                st.pop();
                sb.append(ch);
            }
            else if(ch==')' && st.size() == 1) {
                    st.pop();
                    }
        }
      
        return sb.toString();
    }
}