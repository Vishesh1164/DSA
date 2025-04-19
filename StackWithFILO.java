public class StackWithFILO {
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
        Node newnode = new Node(d);
        newnode.next=this.top;
        this.top=newnode;
    }

    public int pop(){
        if(top==null) return 0;
        if(top.next.next==null){
            int a = top.data;
            top=null;
            return a;
        }
        Node first = top;
        top=top.next;
        int a=first.data;
        first.next=null;
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

