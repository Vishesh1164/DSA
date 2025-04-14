
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }

    public void insertAtBegining(int d){
        Node newnode = new Node(d);
        newnode.next=head;
        head=newnode;
    }

    public void insertAtEnd(int d){
        Node newnode = new Node(d);
        Node last=this.head;
        while(last.next!=null){
            last=last.next;

        }
        last.next=newnode;
    }
    public int lengthOfList(){
        if(head==null) return 0;
        int c=1;
        Node temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void display(){
        Node a=head;
        while(a!=null){
            System.out.println(a.data);
            a=a.next;
        }
    }
}

public class LengthOfLength {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBegining(3);
        System.out.println("hello");
        list.insertAtEnd(1);
        
        list.display();
        System.out.println("length: "+list.lengthOfList());
    }
}

