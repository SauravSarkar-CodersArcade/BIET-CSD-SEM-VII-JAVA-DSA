package dataStructures.linear.linkedLists;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0; // The list is empty at in the beginning
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // This means the node is connected to null
            size++; // Increase the size once a new node is created
        }
    }
    public void printListElements(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println(" null");
    }
    // Insert Operations
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Point the new node's next pointer to the head
        newNode.next = head;
        // Update the head to the new node
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Empty list
        if(head == null){
            head = newNode;
            return;
        }
        // For multiple nodes
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // Add the new node at the end of the last node
        last.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty. Can't remove head.");
            return;
        }
        // If there is a single element head will point to null
        // If there are multiple elements head will point to next element
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty. Can't remove tail.");
            return;
        }
        // Single element
        if(head.next == null){
            head = null;
            return;
        }
        Node curr = head;
        Node last = head.next;
        while (last.next != null){
            curr = last;
            last = last.next;
        }
        curr.next = null;

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("CSD");
        list.addFirst("from");
        list.addFirst("is");
        list.addFirst("Ranjan");
        list.addFirst("Student");
        list.printListElements();
        list.addLast("Semester");
        list.addLast("VII");
        list.addLast("BIET");
        list.addLast("College");
        list.addLast("Davangere");
        list.printListElements();
        list.removeFirst();
        list.printListElements();
        list.removeLast();
        list.printListElements();
    }
}
