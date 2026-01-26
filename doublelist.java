public class doublelist {
    Node head,tail;
    class Node{
        int data;
        Node next,prev;
        public Node(int data) {
            this.data = data;
            this.next=this.prev=null;
        }
    }
    public void insertfirst(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void insertlast(int data) {
        Node newNode = new Node(data);
        if(tail==null) {
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    public void display() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println("NULL");

    }
    public void deletefirst() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    public void deletelast() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        tail=tail.prev;
        tail.next=null;
    }
    public void insertpos(int data,int pos) {
       Node newNode = new Node(data);
       if(pos==0){
           insertfirst(data);
           return;
       }
       if(head==null){
           System.out.println("List is empty");
           return;
       }
       Node temp=head;
       int k=0;
       while(k<pos-1){
           temp=temp.next;
           k++;
       }
       newNode.next=temp.next;
       newNode.prev=temp;
       if(temp.next!=null){
        temp.next=newNode;
        temp.next.prev=newNode;
       }
       else{
           temp.next=newNode;
           tail=newNode;
       }

    }
    public void deletepos(int pos) {

        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        if(pos==0){
            deletefirst();
        }
        Node temp=head;
        int k=0;
        while(k<pos-1){
            temp=temp.next;
            k++;
        }
        temp.next=temp.next.next;
        if(temp.next!=null){
            temp.next.prev=temp;
        }
        else{
            tail=temp;
        }


    }
    public void highest() {
        Node temp = head;
        int high = head.data;
        while (temp != null) {
            if (temp.data > high) {
                high = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("Highest element: " + high);
    }
    public void lowest() {
        Node temp = head;
        int low = head.data;
        while (temp != null) {
            if (temp.data < low) {
                low = temp.data;
            }
            temp = temp.next;
        }
        System.out.println("lowest element: " + low);
    }
    public void sum(){
        int sum=0;
        Node temp=head;
        while(temp!=null){
            sum=sum+temp.data;
            temp=temp.next;
        }
        System.out.println("sum "+sum);
    }

    public static void main(String[] args) {
        doublelist d=new doublelist();
        d.insertfirst(2);
        d.insertlast(3);
        d.insertfirst(8);
        d.insertlast(4);
        d.insertpos(100,2);
        d.highest();
        d.lowest();
        d.sum();
        d.display();






}}

