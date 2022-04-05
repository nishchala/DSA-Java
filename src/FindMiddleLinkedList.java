
/*Use two pointers to traverse the linked list. Pointer1 goes one step at a time, while
pointer 2 goes two steps each time. When ptr2 reaches last element or null, ptr1 will
reach the middle position.
Time complexity - O(n)
 */

public class FindMiddleLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(10);
        ll.insertTail(20);
        ll.insertTail(30);
        ll.insertTail(40);
        ll.insertHead(21);
        ll.insertTail(7);
        ll.insertPosition(33,3);
        System.out.println("The middle element of linked list is: " + findMiddle(ll));
    }
    public static int findMiddle(LinkedList ll){
        LinkedList.Node ptr1 = ll.head;
        LinkedList.Node ptr2 = ll.head;

        if(ll.head.next == null){
            return ll.head.value;
        }
        while(ptr2!=null && ptr2.next!=null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        return ptr1.value;
    }
}
