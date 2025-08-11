package dataStructures.linear.linkedLists.problems.middleNode;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class FindMiddleNode {
    public static Node findMiddle(Node head){
        if(head == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // One step at a time
            fast = fast.next.next; // Two steps at a time
        }
        return slow;
    }
    public void printListElement(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        System.out.println("Middle Node: " + findMiddle(head1).data);

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        System.out.println("Middle Node: " + findMiddle(head2).data);
    }
}
