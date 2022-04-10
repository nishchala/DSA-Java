class Solution {
    static class MonotonicStack {
        Stack<Integer> stack;
        HashMap<Integer,Integer> map;
        public MonotonicStack(int[] array) {
            stack = new Stack<>();
            map = new HashMap<>();
            
            for(int i=0;i<array.length;i++) {
                while(!stack.isEmpty() && array[i]>stack.peek()) {
                    map.put(stack.pop(),array[i]);
                }
                  
                stack.push(array[i]);
            }
        }
         int getNextGreaterElement(int element){
        return (map.containsKey(element))? map.get(element):-1;
    } 
    }
      
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        MonotonicStack ms = new MonotonicStack(nums2);
        int[] result= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = ms.getNextGreaterElement(nums1[i]);
        }
        return result;
        }
    }
