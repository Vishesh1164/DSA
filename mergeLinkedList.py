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
    def merge(self, l1):
        temp=self.head
        while temp.next:
            temp=temp.next
        temp.next=l1.head
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
    l1.display()
    l2=LinkedList()
    l2.insert(4)
    l2.insert(5)
    l2.insert(6)
    print("second")
    l2.display()
    print("merge")
    l1.merge(l2)
    l1.display()

            