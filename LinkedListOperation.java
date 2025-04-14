
public class LinkedListOperation {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insertAtBegining(1);
        list.insertAtBegining(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.display();
System.out.println("delete");
        list.deleteAtEnd();
        list.display();

        System.out.println("begin");

        list.deleteAtBegin();
        list.display();

        System.out.println("value");
        list.insertAfterValue(9,3);
        list.display();

        System.out.println("after position");
        list.insertAfterPosition(25, 2);
        list.display();


        System.out.println("before position");
        list.insertBeforePosition(25, 2);
        list.display();


        System.out.println("delete At position");
        list.insertAtPosition(23, 2);
        list.display();


        System.out.println("delete before value");
        list.deleteBeforeValue(9);
        list.display();


        System.out.println("delete After value");
        list.deleteAfterValue(9);
        list.display();

        System.out.println("delete At position");
        list.deleteAtPosition(6);
        list.display();

        System.out.println("delete After position");
        list.deleteAfterPosition(6);
        list.display();

        System.out.println("delete Before position");
        list.deleteBeforePosition(2);
        list.display();

        System.out.println("length= "+list.lengthOfList());
        
    }
}
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }

}

class Linkedlist{
    Node head;
    Linkedlist(){
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
    public void insertAfterValue(int d, int v){
        Node newnode = new Node(d);
        Node last=this.head;
        while(last.data!=v){
           
            last=last.next;

        }
        newnode.next=last.next;
       last.next=newnode;
    }
    public void insertBeforeValue(int d, int v){
        Node newnode = new Node(d);
        Node secondlast=this.head.next;
        Node last=this.head;
        while(last.next.data!=v){
           
            last=last.next;

        }
        newnode.next=last.next;
       last.next=newnode;
    }

    public void insertAtPosition(int d, int p){
        Node last=this.head;
        while(p!=1){
            last=last.next;
            p--;
        }
        last.data=d;
        
    }
    public void insertAfterPosition(int d, int p){
        Node newnode = new Node(d);
        Node last=this.head;
        while(p!=1){
            last=last.next;
            p--;
        }
        newnode.next=last.next;
       last.next=newnode;
    }
    public void insertBeforePosition(int d, int p){
        Node newnode = new Node(d);
        Node last=this.head;
        while(p!=2){
            last=last.next;
            p--;
        }
        newnode.next=last.next;
       last.next=newnode;
    }
    public void deleteAtEnd(){
        if(head==null) return;
        if(head.next.next==null)head=null;
        Node second_last = head;
        while(second_last.next.next != null){
            second_last=second_last.next;
        }
        second_last.next=null;
    }
    public void deleteAtBegin(){
        if(head==null) return;
        if(head.next.next==null)head=null;
        Node first = head;
        head=head.next;
        first.next=null;
    
    }

    public void deleteBeforeValue(int v){
        if(head==null) return;
        if(head.next.next==null && head.data==v)head=null;
        if(head.next.next==null && head.data!=v)return;
        Node last=this.head;
        while(last.next.next.data!=v){
            last=last.next;

        }
        last.next=last.next.next;
        
    }
    public void deleteAfterValue(int v){
        if(head==null) return;
        if(head.next.next==null && head.data==v)head=null;
        if(head.next.next==null && head.data!=v)return;
        Node last=this.head;
        while(last.data!=v){
            last=last.next;

        }
        last.next=last.next.next;
        
    }
    public void deleteAtPosition(int p){
        if(head==null) return;
        if(head.next.next==null && p==1) head=null;
        if(head.next.next==null && p>1) return;
        Node last=this.head;
        while(p!=2){
            last=last.next;
            p--;
            if(last.next==null && p>=2) return;
        
        }
        last.next=last.next.next;
        
    }
    public void deleteAfterPosition(int p){
        if(head==null) return;
        if(head.next.next==null && p==1) head=null;
        if(head.next.next==null && p>1) return;
        Node last=this.head;
        while(p!=1){
            last=last.next;
            p--;
            if(last.next.next==null && p>2) return;
        
        }
        last.next=last.next.next;
        
    }
    public void deleteBeforePosition(int p){
        if(head==null) return;
        if (p<2) return;
        if(head.next.next==null && p>=1) return;
        if(p==2) head=head.next;
        Node last=this.head;
        while(p>3){
            last=last.next;
            p--;
            if(last.next.next==null && p>2) return;
        
        }
        last.next=last.next.next;
        
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

