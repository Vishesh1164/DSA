class Node:
    def __init__(self,d):
        self.data=d
        self.next=None
class LinkedList:
    def __init__(self):
        self.head=None
    def insert(self,d):
        newnode = Node(d)
        if not self.head:
            self.head=newnode
            return
        temp=self.head
        while temp.next:
            temp = temp.next
        temp.next=newnode

    def rotate(self,n):
        temp = self.head;
        while(n>=3):
            temp=temp.next
            n=n-1
        temp2=temp.next
        
        first=temp.next
        temp.next=None

        while temp2.next!=None:
            temp2=temp2.next
        temp2.next=self.head
        self.head=first


    def display(self):
        temp= self.head
        while temp!=None:
            print(temp.data)
            temp=temp.next

if __name__ == "__main__":
    l1=LinkedList()
    l1.insert(1)
    l1.insert(2)
    l1.insert(3)
    l1.insert(6)
    l1.insert(7)
    l1.display()
    print("dkfj")
    l1.rotate(3)
    l1.display()
   