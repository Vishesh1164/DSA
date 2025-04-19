public class QueueWithLILO {
    
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
        if(rear==null){
            rear=newnode;
            front=newnode;
            return;
        }

        this.rear.next=newnode;
        rear=rear.next;
       
    }

    public int dequeue(){
        if(front==null) return 0;
        if(rear==front){
            int a = rear.data;
            rear=null;
            front=null;
            return a;
        }
       int a=front.data;
       front=front.next;
    
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

