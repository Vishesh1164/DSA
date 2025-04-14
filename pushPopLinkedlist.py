class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def push(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    def pop(self):
        if not self.head:
            return
        if not self.head.next:
            a=self.head.data
            self.head = None
            return a
        current = self.head
        while current.next.next:
            current = current.next
        a=current.next.data
        current.next = None
        return a

    def display(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

if __name__=="__main__":
    l=LinkedList()
    l.push(1)
    l.push(2)
    l.push(3)
    l.push(4)
    l.display()
    print("popped element: ",l.pop())
    l.display()