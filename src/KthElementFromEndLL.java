import java.util.Scanner;
/*
Brute force will be to travserse the list and get the count of elements and then traverse the list again to the
required position from last. O (n)

Optimised - TC - O (n)
Use two pointers
 */
public class KthElementFromEndLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(44);
        ll.insertTail(23);
        ll.insertTail(43);
        ll.insertTail(7);
        ll.insertTail(5);
        System.out.println("Enter the element position from last");
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        System.out.println("The element at given position from last is " + findKFromLast(ll,pos));
    }
    public static int findKFromLast(LinkedList ll, int k) {
        LinkedList.Node ptr1 = ll.head;
        LinkedList.Node ptr2 = ll.head;
        int i =1;
        while(ptr2.next!=null && i<k){
            ptr2 = ptr2.next;
            i++;
        }
        if(i!=k){
            throw new IllegalArgumentException("Elements are less than the number");
        }
        while(ptr2.next!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.value;
    }
}
