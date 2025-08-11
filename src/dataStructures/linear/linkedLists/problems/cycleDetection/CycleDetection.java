package dataStructures.linear.linkedLists.problems.cycleDetection;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CycleDetection {
    public static boolean isCyclic(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = head1.next; // 4->next = 2
        System.out.println(isCyclic(head1) ? "Cyclic" : "Not Cyclic");

        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5); // 4->5->null
        System.out.println(isCyclic(head2) ? "Cyclic" : "Not Cyclic");
    }
}
