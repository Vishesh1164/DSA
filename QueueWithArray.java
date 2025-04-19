public class QueueWithArray {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println("wjkdsfd");
        System.out.println("popped "+q.dequeue());
        q.display();
    }
}

class Queue{
    int arr[];
    int front;
    int rear;
    Queue(){
        this.arr=new int[1000];
        front=-1;
        rear=-1;
    }

    public void enqueue(int d){
        if(rear==1000)return;
        this.rear++;
        arr[this.rear]=d;
        if(rear==0){
            front=0;
        }
    }

    public int dequeue(){
        if(front==-1)return 0;
        if(front==rear){
            int a=arr[front];
            front=-1;
            rear=-1;
            return a;
        }

        int a=arr[front];
        front++;
        return a;
    }

    public void display(){
        int temp=front;
        while(temp<=rear){
            System.out.println(arr[temp]);
            temp++;
        }
    }
}
