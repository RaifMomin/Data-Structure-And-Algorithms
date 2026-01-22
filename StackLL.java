public class StackLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top;
    public boolean isEmpty(){
        return top==null;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }
    public int pop(){
        int data=top.data;
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        top=top.next;
        return top.data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        int data=top.data;
        return data;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        stack.pop();
        stack.display();
    }

}
