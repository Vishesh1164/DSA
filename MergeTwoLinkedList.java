public class MergeTwoLinkedList {
    public static void main(String[] args) {
        Linked l1 = new Linked();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
       
        l1.display();
System.out.println("second");
        Linked l2 = new Linked();
        l2.insert(5);
        l2.insert(6);
        l2.insert(7);
        l2.insert(8);

        l2.display();

        l1.merge(l2);
        System.out.println("merge");

        l1.display();
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

    public void merge(Linked l1){
        Node temp=this.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=l1.head;
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
