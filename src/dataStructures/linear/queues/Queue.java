package dataStructures.linear.queues;
public class Queue {
    private static final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int front;
    private int rear;
    public Queue(){
        front = rear = -1; // Initially the queue is empty
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public void enqueue(int data){
        // If the queue is full
        if(rear == MAX_SIZE - 1){
            System.out.println("Queue is full....!!!!");
            return;
        }else if(isEmpty()){
            front = rear = 0; // Move front & rear to the 0th index from -1
        }else {
           rear++;
        }
        arr[rear] = data;
        System.out.println("Added " + data + " into the queue.");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Empty queue....!!!!");
            return;
        }else if(front == rear){
            front = rear = -1;
        }else {
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Empty queue....!!!!");
        }
        return arr[front];
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Empty queue....!!!!");
        }
        return arr[rear];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty queue....!!!!");
            return;
        }
        for (int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return rear + 1;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] arr = {19,0,32,15,100};
        for (int x : arr){
            queue.enqueue(x);
        }
        queue.display();
        System.out.println("Current Size: " + queue.size());
        System.out.println("Front Element: " + queue.getFront());
        System.out.println("rear Element: " + queue.getRear());
    }
}
