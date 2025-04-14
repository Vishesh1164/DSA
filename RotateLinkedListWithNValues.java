public class RotateLinkedListWithNValues {
    public static void main(String[] args) {
        Linked l= new Linked();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        l.rotate(3);
        l.display();
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

class Linked{
    Node head;
    Linked(){
        this.head=null;
    }

   

    public void insert(int d){
        Node newnode = new Node(d);
        if(this.head==null){
            head=newnode;
            return;
        }
       
        Node last=this.head;
        while(last.next!=null){
            last=last.next;

        }
        last.next=newnode;
    }

   public void rotate(int n){
        Node temp= this.head;
        while(n>=3){
            temp=temp.next;
            n--;
        }
        Node temp2=temp.next;
        Node first=temp.next;

        temp.next=null;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=this.head;
        this.head=first;
   }

    public void display(){
        if (head==null) return;
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

