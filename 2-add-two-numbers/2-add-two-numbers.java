/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        if(l1==null && l2==null){
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while(l1!=null || l2!=null) {
            int p = (l1==null)?0:l1.val;
            int q = (l2==null)?0:l2.val;
            
            int sum = p + q + carry;
            
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            
            carry = sum/10;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
}