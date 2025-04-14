public class PushPopInLinkedlist {

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.push(1);
        l.push(2);
        l.push(3);
        l.push(4);
        l.display();
        System.out.println("poped element: "+l.pop());
        System.out.println("poped element: "+l.pop());
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

    public void push(int d){
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

    public int pop(){
        if(this.head==null) return 0;
        if(this.head.next==null){
            int a=head.data;
            head=null;
            return a;
        }

        Node temp= this.head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int a= temp.next.data;
        temp.next=null;
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