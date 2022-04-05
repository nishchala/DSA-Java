import java.util.Scanner;

public class LinkedList {
    Node head;
    public static class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList singlyLL = new LinkedList();
        Scanner input = new Scanner(System.in);

        int option = 0;
        int nodeData, position;
        while(option!=-1) {
            System.out.println("1. Create a new linked list");
            System.out.println("2. Insert element in linked list in the tail end");
            System.out.println("3. Insert element in linked list in the head position");
            System.out.println("4. Insert element in the given position ");
            System.out.println("5. Delete element from tail");
            System.out.println("6. Delete element from head");
            System.out.println("7. Delete element from given position");
            System.out.println("8. Return element at given location");
            System.out.println("9. Find data is present in lined list");
            System.out.println("-1. exit");
            System.out.println("\nEnter your option: ");
            option = input.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Enter the head node value");
                    nodeData = input.nextInt();
                    singlyLL.createLL(nodeData);
                    System.out.println("Linked List created");
                    break;
                case 2:
                    System.out.println("Enter the data value");
                    nodeData = input.nextInt();
                    singlyLL.insertTail(nodeData);
                    System.out.println("Linked List node inserted");
                    break;
                case 3:
                    System.out.println("Enter the data value");
                    nodeData = input.nextInt();
                    singlyLL.insertHead(nodeData);
                    System.out.println("Linked list node inserted");
                    break;
                case 4:
                    System.out.println("Enter the data value");
                    nodeData = input.nextInt();
                    System.out.println("Enter the position (starting from 1) at which node to be inserted");
                    position = input.nextInt();
                    singlyLL.insertPosition(nodeData, position);
                    System.out.println("Node inserted at given position");
                    break;
                case 5:
                    System.out.println("The deleted data value is " + singlyLL.deleteTail());
                    System.out.println("Tail node deleted");
                    break;
                case 6:
                    System.out.println("The deleted data value is " + singlyLL.deleteHead());
                    System.out.println("HeadNode deleted");
                    break;
                case 7:
                    System.out.println("Enter the position of node(starting form 1) to delete: ");
                    position = input.nextInt();
                    System.out.println("Deleted node value is " + singlyLL.deletePosition(position));
                    System.out.println("Node deleted");
                    break;
                case 8:
                    System.out.println("Enter the position of node whose value is to be retrieved: ");
                    position = input.nextInt();
                    System.out.println("Data at given position is " + singlyLL.findDataAtPosition(position));
                    System.out.println("Data at given position retrieved");
                    break;
                case 9:
                    System.out.println("Enter the data to search in the linked list: ");
                    nodeData = input.nextInt();
                    System.out.println("Node data found at position (if -1 then data was not found) : " + singlyLL.findData(nodeData));
                    break;
            }
            if(singlyLL.head == null){
                System.out.println("Linked list is empty");
            }
            else {
                Node curr = singlyLL.head;
                System.out.println("Complete linked list is as follows");
                while (curr != null) {
                    System.out.print(curr.value + " ");
                    curr = curr.next;
                }
                System.out.println("\n");
            }
        }
    }
    void insertTail(int data) {
        if(head == null){
            insertHead(data);
        }
        else{
            Node newNode = new Node(data);
            Node nextNode = head;
            while(nextNode.next!=null){
                nextNode = nextNode.next;
            }
            nextNode.next = newNode;
        }
    }
    void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void insertPosition(int data, int pos){
        if(pos==1){
            insertHead(data);
        }
        else {
            Node newNode = new Node(data);
            Node prevNode = head;
            int i = 1;
            while(i<pos-1){
                i++;
                prevNode = prevNode.next;
            }

            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }

    }
    int deleteTail(){
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        if(head.next == null){
            return deleteHead();
        }
        Node nextNode = head;
        while(nextNode.next.next!=null){
            nextNode = nextNode.next;
        }
        int data = nextNode.next.value;
        nextNode.next = null;
        return data;
    }

    int deleteHead() {
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        int data = head.value;
        Node nextNode = head.next;
        head.next = null;
        head = nextNode;
        return data;
    }
    int deletePosition(int pos){
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        int data;
        if(pos==1){
            data = deleteHead();
        }
        else{
            Node prevNode = head;
            int i = 1;
            while(i<pos-1){
                prevNode = prevNode.next;
                i++;
            }
            data = prevNode.next.value;
            prevNode.next = prevNode.next.next;
        }
        return data;
    }
    void createLL(int data){
        head = new Node(data);
    }

    int findDataAtPosition(int pos){
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        Node curr =  head;
        int i=1;
        while(i<pos){
            curr = curr.next;
            i++;
        }
        return curr.value;
    }
    int findData(int data) {
        if(head == null){
            throw new IllegalArgumentException("List is empty");
        }
        Node curr = head;
        int i=1;
        while(curr!=null){
            if(curr.value == data){
                return i;
            }
            curr = curr.next;
            i++;
        }
        return -1;
    }

}
