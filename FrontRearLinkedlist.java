public class FrontRearLinkedlist {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.display();
       System.out.println("deleted element: "+ l.delete());
       System.out.println("deleted element: "+ l.delete());
        l.display();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }

    public void insert(int d){
        Node newnode= new Node(d);
        if(this.head==null){
            this.head=newnode;
            return;
        }
        Node temp = this.head;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }

    public int delete(){
        if(this.head==null) return 0;
        if(this.head.next==null){
            int a=head.data;
            head=null;
            return a;
        }

        int a=this.head.data;
        this.head=this.head.next;
        return a;
    }


    public void display(){
        if(this.head==null)return;
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
