/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp!=null) {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        Node prev = head;
        Node nxt;
        while(prev!=null){
            nxt = prev.next;
            if(prev.random==null){
                nxt.random = null;
            }
            else {
                nxt.random = prev.random.next;
            }
            prev = nxt.next;
        }
        Node headCopy = head.next;
        prev = head;
        temp = head;
        while(prev.next!=null) {
            temp = prev.next;
            prev.next = temp.next;
            prev = temp;
        }
        return headCopy;
    }
}