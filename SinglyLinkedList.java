public class SinglyLinkedList {
    Node head;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public void deletefirst(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        head=head.next;
    }
    public void deletelast(){
        Node slast=head;
        Node last=head.next;
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        while(last.next!=null){
           slast=slast.next;
           last=last.next;
        }
        slast.next=null;
    }
    public void insertpos(int data,int pos){
        Node newNode= new Node(data);
        if(pos==0){
            addfirst(data);
            return;
        }
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        int k=0;
        while(k<pos-1){
            temp=temp.next;
            k++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deletepos(int pos){
        if(pos==0){
            deletefirst();
            return;
        }
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        int k=0;
        while(k<pos-1){
            temp=temp.next;
            k++;
        }
        temp.next=temp.next.next;
    }
    public void insertmid(int data){
         Node newNode= new Node(data);
         Node fast=head;
         Node prev=null;
         Node slow=head;
         while(fast!=null&&fast.next!=null){
             fast=fast.next.next;
             prev=slow;
             slow=slow.next;
         }
         newNode.next=slow;
         if(prev!=null){
             prev.next=newNode;
         }
         else{
             head=newNode;
         }

    }
    public void deletemid(){
         if(head==null){
             System.out.println("Empty");
             return;
         }
         if(head.next==null){
             head=null;
             return;
         }
        Node fast=head;
        Node prev=null;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
            prev.next=slow.next;


    }
    public void reverse(){
      Node next=null;
      Node curr=head;
      Node prev=null;
              while(curr!=null){
                  next=curr.next;
                  curr.next=prev;
                  prev=curr;
                  curr=next;
              };
              head=prev;


    }

    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        s.addfirst(1);
        s.addlast(2);
        s.insertpos(3,2);
        s.insertpos(4,3);
        s.insertpos(5,4);
        s.display();
        s.insertmid(100);
        s.display();
        s.deletemid();
        s.display();
        s.reverse();
        s.display();
    }


}
