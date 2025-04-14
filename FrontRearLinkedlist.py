class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def delete(self):
        if self.head:
            a=self.head.data
            self.head = self.head.next
            return a

    def display(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

if __name__=="__main__":
    l=LinkedList()
    l.insert(1)
    l.insert(2)
    l.insert(3)
    l.insert(4)
    l.display()
    print("deleted element: ",l.delete())
    l.display()
