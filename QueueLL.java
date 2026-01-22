public class QueueLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front,rear;
    public boolean isEmpty(){
        return front==null && rear==null;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data= front.data;
        front=front.next;
        return data;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueLL queue=new QueueLL();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
