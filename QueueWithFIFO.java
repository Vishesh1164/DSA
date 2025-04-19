public class QueueWithFIFO {
    public static void main(String[] args) {
        Queue  q=new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println(13456);
        q.dequeue();
        q.display();

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

class Queue{
    Node front;
    Node rear;
    Queue(){
        this.front=null;
        this.rear=null;
    }

    public void enqueue(int d){
        Node newnode = new Node(d);
        newnode.next=this.front;
        this.front=newnode;
        if(this.rear==null){
            this.rear=front;
        }
       
    }

    public int dequeue(){
        if(rear==null) return 0;
        if(rear==front){
            int a = rear.data;
            rear=null;
            front=null;
            return a;
        }
        Node first = front;
        while(first.next!=rear){
            first=first.next;
        }
        first.next=null;
        int a=rear.data;
        rear=first;
    
        return a;
    }

    public void display(){
        if(this.front==null)return;
        Node temp=this.front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
