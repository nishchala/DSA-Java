class Solution {
    public int maxDepth(String s) {
        int maxcount = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                count++;
            }
            maxcount = Math.max(count,maxcount);
            if(s.charAt(i)==')') {
                count--;
            }
        }
        return maxcount;
    }
}