public class StackWithArray {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println("djfkgj");
        System.out.println("popped "+s.pop());
        s.display();
    }
}

class Stack{
    int arr[]=new int[1000];
    int top;
    Stack(){

        this.top=-1;
    }

    public void push(int d){
        if(this.top==1000)return;
        this.top++;
        arr[this.top]=d;
    }

    public int pop(){
        if(this.top==-1)return 0;
        int a=arr[top];
        this.top--;
        return a;
    }

    public void display(){
        int temp=this.top;
        while (temp>=0) {
            System.out.println(arr[temp]);
            temp--;
        }
    }
}
