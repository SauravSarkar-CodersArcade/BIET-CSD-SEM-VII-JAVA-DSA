package dataStructures.linear.linkedLists.problems.intersectionOfTwoLists;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class IntersectionOfLists {
    public static Node findIntersection(Node head1, Node head2){
        Node p1 = head1;
        Node p2 = head2;
        // This is for the new linked list which will be the output / result
        Node head = null;
        Node tail = null;
        while (p1 != null && p2 != null){
            if(p1.data < p2.data){
                p1 = p1.next;
            }else if(p2.data < p1.data){
                p2 = p2.next;
            }
            else {
                // Match has been found
                // If empty
                Node newNode = new Node(p1.data);
                if(head == null){
                    head = tail = newNode;
                }else {
                    tail.next = newNode;
                    tail = newNode;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return head; // Return the head of the newly created list
    }
    public static void printList(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(8);
        printList(head1);
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(10);
        printList(head2);
        Node head = findIntersection(head1, head2);
        printList(head);
    }
}
