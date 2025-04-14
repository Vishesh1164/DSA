class Node:
    def __init__(self,d):
        self.data =d
        self.next=None
class Linkedlist:
    def __init__(self):
        self.head=None

    def insert(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def length(self):
        if self.head==None: 
            return 0
        c=1
        temp=self.head
        while(temp!=None):
            temp=temp.next
            c=c+1
        return c
    def display(self):
        temp=self.head
        while(temp!=None):
            print(temp.data)
            temp=temp.next

if __name__ == "__main__":
    l = Linkedlist()
    l.insert(1)
    l.insert(2)
    l.insert(3)
    l.display()
    print("length",l.length())
        