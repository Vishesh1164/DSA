public class StackWithLIFO {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        s.pop();
        s.display();
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

class Stack{
    Node top;
    Stack(){
        this.top=null;
    }

    public void push(int d){
        Node newnode= new Node(d);
        if(this.top==null){
            this.top=newnode;
            return;
        }
        Node temp = this.top;
        while(temp.next!=null){
            temp=temp.next;

        }
        temp.next=newnode;
    }

    public int pop(){
        if(this.top==null) return 0;
        if(this.top.next==null){
            int a=top.data;
            top=null;
            return a;
        }

        Node temp= this.top;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int a= temp.next.data;
        temp.next=null;
        return a;
    }


    public void display(){
        if(this.top==null)return;
        Node temp=this.top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
